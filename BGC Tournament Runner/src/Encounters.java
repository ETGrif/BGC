import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Encounters
	{

		

		public static void createEncounters()
			{

				// try to create settings file
				File indexFile = new File("Encounters.txt");
				boolean madeFile = true;

				try
					{
						if (indexFile.createNewFile())
							{
								System.out.println("Created Encounters file.");
							}
						else
							{
								madeFile = false;
							}
					} catch (IOException e)
					{

						e.printStackTrace();
					}

				if (!madeFile)
					{
						loadEncounters();
					}

			}

		public static void writeEncountersFile()
			{


				String fileName = "Encounters.txt";

				try
					{
						// Assume default encoding.
						FileWriter fileWriter = new FileWriter(fileName,true);

						// Always wrap FileWriter in BufferedWriter.
						BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

						// Note that write() does not automatically
						// append a newline character.

					for(Player p: Registry.players) {
						bufferedWriter.write("New Player:");
						bufferedWriter.newLine();
						bufferedWriter.write(p.getName());
						bufferedWriter.newLine();
						bufferedWriter.write("Encountered:");
						bufferedWriter.newLine();
						for(Player e: p.getEncounters()) {
							bufferedWriter.write(e.getName());
							bufferedWriter.newLine();

						}
						bufferedWriter.newLine();
						
						
						
					}

						// Always close files.
						bufferedWriter.close();
					}

				catch (IOException ex)
					{
						System.out.println("Error writing to file '" + fileName + "'");
					}

			}


		public static void loadEncounters()
			{

				try
					{
						Scanner file = new Scanner(new File("Encounters.txt"));

						while(file.hasNextLine()) {
							//"New Player:"
							file.nextLine();
							//player:
							String playerName = file.nextLine();
							
							//find player
							Player player = findPlayerObj(playerName);
							
							//"Encountered:"
							file.nextLine();
							
							boolean hasEncountered = true;
							while(hasEncountered){
								String encounteredName = file.nextLine();
								
								//test if its a blank line: --> move to next player
								if(encounteredName.equals("")){
									hasEncountered = false;
								}else{
								
								//find player
									Player encountered = findPlayerObj(encounteredName);
									System.out.println(encountered);
								//add the player to the encountered list
									player.addEncountered(encountered);
									
								}	
							}
							
							
							
							
							
							
						}

						file.close();

					} catch (FileNotFoundException e)
					{
						e.printStackTrace();
					}

			}
		
		
		
		
		public static Player findPlayerObj(String name){
			
			for(Player p: Registry.players){
				if(p.getName().equals(name)){
					return p;
					
				}
				
			}
			return null;
			
			
			
			
		}

	

		
		
		
	}

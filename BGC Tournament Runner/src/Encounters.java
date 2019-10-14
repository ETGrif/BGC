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

				try
					{
						if (indexFile.createNewFile())
							{
								System.out.println("Created Encounters file.");
							}
					} catch (IOException e)
					{

						e.printStackTrace();
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
						bufferedWriter.write(p.getName());
						bufferedWriter.write("Encountered:");
						for(Player e: p.getEncounters()) {
							bufferedWriter.write(e.getName());
							
						}
						
						
						
					}

						// Always close files.
						bufferedWriter.close();
					}

				catch (IOException ex)
					{
						System.out.println("Error writing to file '" + fileName + "'");
					}

			}


		public static void loadSettings()
			{

				try
					{
						Scanner file = new Scanner(new File("Encounters.txt"));

						while(file.hasNextLine()) {
							
							String player = file.nextLine();
							
							
							
							
							
						}

						file.close();

					} catch (FileNotFoundException e)
					{
						e.printStackTrace();
					}

			}

	

		
		
		
	}

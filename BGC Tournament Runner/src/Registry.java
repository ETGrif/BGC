import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Registry
	{

		public static ArrayList<Player> players = new ArrayList<Player>();

		public static void createRegisrtry()
			{

				// try to create registry file
				File indexFile = new File("Registry.txt");
				boolean needsRegistryFilled = true;

				try
					{
						if (indexFile.createNewFile())
							{
								System.out.println("Created registry file.");
							}
						else
							{
								needsRegistryFilled = false;
							}
					} catch (IOException e)
					{

						e.printStackTrace();
					}

				
				// if there was no settings file,
				// fill the document with settings.
				if (needsRegistryFilled)
					{
						takePlayers();
						writeRegistryFile();

					}
				else
					{
						// if the settings have already been made, load them
						loadRegistry();

					}

			}

		private static void loadRegistry()
			{
				try
					{
						Scanner file = new Scanner(new File("Registry.txt"));

						while(file.hasNextLine()){
							//take in raw data
							String playerName = file.nextLine();
							String scores = file.nextLine();
							file.nextLine();
							
							//parse the scores
							int wonMatches = Integer.parseInt(scores.substring(0,scores.indexOf("/")));
							int totalMatches = Integer.parseInt(scores.substring(scores.indexOf("/")+1));
							
							//create player
							players.add(new Player(playerName, totalMatches, wonMatches));
						}


					} catch (FileNotFoundException e)
					{
						e.printStackTrace();
					}

			}

		private static void writeRegistryFile()
			{
				String fileName = "Registry.txt";

				try
					{
						// Assume default encoding.
						FileWriter fileWriter = new FileWriter(fileName);

						// Always wrap FileWriter in BufferedWriter.
						BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

						// Note that write() does not automatically
						// append a newline character.

						for (Player p : players)
							{

								bufferedWriter.write(p.getName());
								bufferedWriter.newLine();

								bufferedWriter.write(p.getWonMatches() + "/" + p.getTotalMatches());
								bufferedWriter.newLine();
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

		private static void takePlayers()
			{
				
				Scanner userString = new Scanner(System.in);

				System.out.println("What players are going to be playing? You can add more or remove some later.");
				System.out.println("Type a name to add a name, or [END]");
				boolean takingNames = true;
				while (takingNames)
					{
						System.out.print(":");
						String response = userString.nextLine();
						if (response.equals("END"))
							{
								System.out.println("All players added.");
								takingNames = false;

							}
						else
							{
								players.add(new Player(response));
								System.out.println("Added '" + response + "'.");

							}

					}


			}

	}

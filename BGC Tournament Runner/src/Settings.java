import java.io.*;
import java.util.Scanner;

public class Settings
	{

		public static String tournamentName;
		public static String gameName;
		public static int maxRounds;
		public static int numberOfGroups;
		public static int maxPlayersPerGroup;

		public static void createSettings()
			{

				// try to create settings file
				File indexFile = new File("Settings.txt");
				boolean needsSettingsFilled = true;

				try
					{
						if (indexFile.createNewFile())
							{
								System.out.println("Created settings file.");
							}
						else
							{
								needsSettingsFilled = false;
							}
					} catch (IOException e)
					{

						e.printStackTrace();
					}

				// if there was no settings file,
				// fill the document with settings.
				if (needsSettingsFilled)
					{
						takeSettings();
						writeSettingsFile();

					}
				else
					{
						// if the settings have already been made, load them
						loadSettings();

					}

			}

		public static void writeSettingsFile()
			{

				String fileName = "Settings.txt";

				try
					{
						// Assume default encoding.
						FileWriter fileWriter = new FileWriter(fileName);

						// Always wrap FileWriter in BufferedWriter.
						BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

						// Note that write() does not automatically
						// append a newline character.

						bufferedWriter.write("Tournament Name:" + tournamentName);
						bufferedWriter.newLine();
						bufferedWriter.write("Game:" + gameName);
						bufferedWriter.newLine();
						bufferedWriter.write("Rounds:" + maxRounds);
						bufferedWriter.newLine();
						bufferedWriter.write("Groups:" + numberOfGroups);
						bufferedWriter.newLine();
						bufferedWriter.write("Players per Group:" + maxPlayersPerGroup);

						// Always close files.
						bufferedWriter.close();
					}

				catch (IOException ex)
					{
						System.out.println("Error writing to file '" + fileName + "'");
					}

			}

		public static void takeSettings()
			{
				Scanner userString = new Scanner(System.in);
				Scanner userInt = new Scanner(System.in);

				System.out.println("Let's start with the Tournament Settings:");

				System.out.println("What game will you be playing?");
				gameName = userString.nextLine();

				System.out.println("What is the name of your Tournament?");
				tournamentName = userString.nextLine();

				System.out.println("How many rounds will be played?(This can be changed later)");
				maxRounds = userInt.nextInt();

				System.out.println("How many groups will be playing?");
				numberOfGroups = userInt.nextInt();

				System.out.println("How many players are allowed per group?");
				maxPlayersPerGroup = userInt.nextInt();

			}

		public static void loadSettings()
			{

				try
					{
						Scanner file = new Scanner(new File("Settings.txt"));

						tournamentName = file.nextLine().substring(16);
						gameName = file.nextLine().substring(5);
						maxRounds = Integer.parseInt(file.nextLine().substring(7));
						numberOfGroups = Integer.parseInt(file.nextLine().substring(7));
						maxPlayersPerGroup = Integer.parseInt(file.nextLine().substring(18));

						file.close();

					} catch (FileNotFoundException e)
					{
						e.printStackTrace();
					}

			}

	}

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Registry
	{

		ArrayList<Player> players = new ArrayList<Player>();
		
		
		public static void createRegisrtry(){
			
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
					
				}else{
					//if the settings have already been made, load them
					loadRegistry();
					
				}

			
			
			
			
		}


		private static void loadRegistry()
			{
				// TODO Auto-generated method stub
				
			}


		private static void writeRegistryFile()
			{
				// TODO Auto-generated method stub
				
			}


		private static void takePlayers()
			{
				// TODO Auto-generated method stub
				
			}
		
		
		
		
		
		
		
		
		
		
		
	}

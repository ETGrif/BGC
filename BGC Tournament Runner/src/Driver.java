import java.io.File;
import java.io.IOException;

public class Driver
	{

		
		public static void main(String[] args)
			{
				firstOpenSetUp();
				//TODO if first time opening, make settings and set up registry
				
				
				//TODO Round creation
				//TODO round tab
				//ranking system
				
			}

		private static void firstOpenSetUp()
			{
				
				//settings
				Settings.createSettings();
				
				
//				//try to create Registry File
//				File rFile = new File("Registry.txt");
//				boolean needsRegistryFilled = true;
//				
//				try
//					{
//						if(rFile.createNewFile()){
//							System.out.println("Created regisrty file.");
//						}else{
//							needsRegistryFilled = false;
//						}
//					} catch (IOException e)
//					{
//						
//						e.printStackTrace();
//					}
				
				
				
				
			}
	
		
		
		
		
		
		
		
	}

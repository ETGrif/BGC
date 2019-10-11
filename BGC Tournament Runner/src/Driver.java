import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Driver
	{

		
		public static void main(String[] args)
			{
				// if first time opening, make settings and set up registry
				firstOpenSetUp();

				
				//TODO Round creation
				System.out.println("Would you like to do?\n"
						+ "[1]create new round\n"
						+ "[2]tab round\n"
						+ "[3]look at player rankings\n"
						+ "[4]exit");

				Scanner userInt = new Scanner(System.in);
				int response = userInt.nextInt();
				switch(response){
					case 1:
						//TODO create round
						RoundCreator.createRound(1);
						break;
						
					case 2:
						//TODO tab round
						break;
						
					case 3:
						//TODO ranking system
						//TODO display rankings
						break;
						
					case 4:
						//TODO exit;
						break;
						
					default:
						System.out.println("Thats not a valid response.");
						break;
					
					
				}
				
				
			}

		private static void firstOpenSetUp()
			{
				
				//settings
				Settings.createSettings();
				
				//registry
				Registry.createRegisrtry();
				
				
				
				
			}
	
		
		
		
		
		
		
		
	}

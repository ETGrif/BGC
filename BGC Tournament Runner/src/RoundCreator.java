import java.util.ArrayList;

public class RoundCreator
	{

		public static ArrayList<Group> createRound(int round) {
			//find numbers
			int players = Registry.players.size();
			int maxPlayers = Settings.maxPlayersPerGroup;
			
			int desiredNumOfGroups = (int) Math.ceil((double) players / maxPlayers);
			int baseNumOfPlayers = players / desiredNumOfGroups;
			int modCases = players % desiredNumOfGroups;
			
			//TODO create a round
			ArrayList<Group> groups = new ArrayList<Group>();
			//create groups
			for(int g = 1; g <= desiredNumOfGroups; g++) {
				if(g <= modCases) {
					groups.add(new Group(round, g, baseNumOfPlayers +1));
				}else {
					groups.add(new Group(round, g, baseNumOfPlayers));

				}
			}
			
			
			
			
			//populate
			ArrayList<Player> availablePlayers = Registry.players;
			for(Group g: groups) {
//				System.out.println("Group"+g.getGroup());
//				System.out.println("Players:" + g.getNumOfPlayers());
				
//				g.addPlayer(new Player("temp"));
				while(g.getPlayers().size() < g.getNumOfPlayers()) {
					int randIndex = (int) (Math.random()*availablePlayers.size());
//					System.out.println(randIndex);
//					System.out.println(availablePlayers.get(randIndex));
					g.addPlayer(availablePlayers.get(randIndex));
//					System.out.println(availablePlayers.get(randIndex).getName());
					availablePlayers.remove(randIndex);
					
				}
				
			}
			
//			//TODO print the round
//			System.out.println("Round " + round);
//			for(Group g: groups) {
//				System.out.println("Group " +g.getGroup());
//				for(Player p : g.getPlayers()) {
//					System.out.println(p.getName());
//					
//				}
//				
//			}
			//TODO re-roll
			
			
			return groups;
			
		}
		
		
	}

import java.util.ArrayList;

public class Group
	{

		ArrayList<Player> players;
		int numOfPlayers;
		int round;
		int group;
//		int flight;
		
		public Group(int round, int group, int numOfPlayers) {
			
			this.round = round;
			this.group = group;
			this.numOfPlayers = numOfPlayers;
			
			
		}

		public ArrayList<Player> getPlayers()
			{
				return players;
			}

		public void setPlayers(ArrayList<Player> players)
			{
				this.players = players;
			}
		
		public void addPlayer(Player player)
			{
				this.players.add(player);
			}

		public int getRound()
			{
				return round;
			}

		public void setRound(int round)
			{
				this.round = round;
			}

		public int getGroup()
			{
				return group;
			}

		public void setGroup(int group)
			{
				this.group = group;
			}

		public int getNumOfPlayers()
			{
				return this.numOfPlayers;
			}

		
		
		
		
	}

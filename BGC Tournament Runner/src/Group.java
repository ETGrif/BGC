import java.util.ArrayList;

public class Group
	{

		private ArrayList<Player> players;
		private int numOfPlayers;
		private int round;
		private int group;
//		private int flight;
		private int diversityScore;
		
		public Group(int round, int group, int numOfPlayers) {
			
			this.round = round;
			this.group = group;
			this.numOfPlayers = numOfPlayers;
			this.players = new ArrayList<Player>();
			
			this.setDiversityScore(findDiversityScore());
			
			
		}

		private int findDiversityScore()
			{

				int totalNumEncounters = 0;

				for (int i = 0; i < this.players.size() - 1; i++)
					{
						Player comparison = this.players.get(i);
						ArrayList<Player> comparisonEncountered = comparison.getEncounters();

						for (int j = i + 1; j < this.players.size(); j++)
							{
								Player comparator = this.players.get(j);

								if (comparisonEncountered.contains(comparator))
									{
										totalNumEncounters++;
									}

							}

					}

				int possibleEncounters = factorial(players.size());
				int diversityScore = 100 - (totalNumEncounters / possibleEncounters);
				return diversityScore;
			}

		private int factorial(int num)
			{
				return num * factorial(num-1);
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

		public int getDiversityScore()
			{
					return diversityScore;
			}

		public void setDiversityScore(int diversityScore)
			{
					this.diversityScore = diversityScore;
			}

		
		
		
		
	}

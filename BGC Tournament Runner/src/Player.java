
public class Player
	{

		private String name;
		private int totalMatches;
		private int wonMatches;
		private int score;
		
		public Player(String name){
			this.name = name;
			totalMatches = 0;
			wonMatches = 0;
			score = 0;
			
		}
		
		public Player(String name, int totalMatches, int wonMatches){
			this.name = name;
			this.totalMatches = totalMatches;
			this.wonMatches = wonMatches;
			score = (int) ((double)wonMatches/totalMatches*100);
			
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getTotalMatches()
			{
				return totalMatches;
			}

		public void setTotalMatches(int totalMatches)
			{
				this.totalMatches = totalMatches;
			}

		public int getWonMatches()
			{
				return wonMatches;
			}

		public void setWonMatches(int wonMatches)
			{
				this.wonMatches = wonMatches;
			}
		
		
		
		
		
		
	}

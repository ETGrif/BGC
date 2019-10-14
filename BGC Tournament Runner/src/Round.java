import java.util.ArrayList;

public class Round
	{
		int round;
		int numOfGroups;
		
		ArrayList<Group> groups;
		int diversityScore;
		
		public Round(int round) {
			this.round = round;
			//get a set of groups
			groups = RoundCreator.createRound(round);
			
			//TODO find diversity score
			
		}
		
	}

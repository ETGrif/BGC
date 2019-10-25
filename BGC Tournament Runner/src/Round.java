import java.util.ArrayList;

public class Round
	{
		int round;
		int numOfGroups;

		ArrayList<Group> groups;
		int diversityScore;

		public Round(int round)
			{
				this.round = round;
				// get a set of groups
				groups = RoundCreator.populateRound(round);

				// find diversity score
				int totalDivirsityScore = 0;
				for (Group g : groups)
					{
						totalDivirsityScore += g.getDiversityScore();
					}
				diversityScore = totalDivirsityScore / groups.size();

			}

		public int getRound()
			{
				return round;
			}

		public void setRound(int round)
			{
				this.round = round;
			}

		public int getNumOfGroups()
			{
				return numOfGroups;
			}

		public void setNumOfGroups(int numOfGroups)
			{
				this.numOfGroups = numOfGroups;
			}

		public ArrayList<Group> getGroups()
			{
				return groups;
			}

		public void setGroups(ArrayList<Group> groups)
			{
				this.groups = groups;
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

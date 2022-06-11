class Han_Dongwoo_Player extends Player{
	// Get Cooperation Rate from the opponent's history
	int getCoopRate(int n, int[] history) {
		int i = 0;
		for(int action:history) {
			if(action==0) i++;
		}
		// Generate a random decimal [0,1] to predict the oppoenen's next move
		if(Math.random()<(i/n)) return 0;
		return 1;
	}
	int selectAction(int n, int[] myHistory, int[] oppHistory1, int[] oppHistory2) {
		// Cooperate on the first round
		if(n==0) return 0;s
		// Defect if both opponents are predicted to defect
		if(this.getCoopRate(n, oppHistory1)==1 && this.getCoopRate(n, oppHistory2)==1)
			return 1;
		// Otherwise, cooperate
		return 0;
	}	
}

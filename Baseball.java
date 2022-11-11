
public class Baseball {

	public static void main(String[] args) {
		
		int yankees; // score for the yankees
		int redSox;  // score for the redsox
		
		int inning;  // the current inning
		
		// initialize variables for new game
		yankees = 0;
		redSox = 0;
		inning = 1; // starts with 1st inning
		
		while( (yankees == redSox) || (inning <= 9) ) {
			int runs;
			
			System.out.println("Inning number " + inning);
			// Generate runs for Yankees
			runs = randomRunGenerator();
			yankees = yankees + runs;
			System.out.println("\tThe Yankees score " + runs + " runs.");
			
			// test edge case, in the 9th inning: if red sox are still ahead there is no point in playing rest of inning
			if( (inning == 9) && (redSox > yankees) ) {
				System.out.println("The score is Yankees " + yankees + " to Red Sox " + redSox + ".");
				System.out.println("The game ends because the Red Sox are ahead.");
				System.out.println();
				break;
			}
			
			// Generate runs for Red Sox
			runs = randomRunGenerator();
			redSox = redSox + runs;
			System.out.println("\tThe Red Sox score " + runs + " runs.");
			
			System.out.println("The score is Yankees " + yankees + " to Red Sox " + redSox + ".");
			System.out.println();
			
			inning++; // end of the inning, increment
		}
		
		System.out.println("The final score is Yankees " + yankees + " to Red Sox " + redSox + ".\n");
		
		if(yankees > redSox) {
			System.out.println("Yankees win!");
		}
		else {
			System.out.println("Red Sox win!");
		}

	}
	
	/**
	 * Generates a random amount of baseball runs.
	 * @return the number of runs.
	 */
	public static int randomRunGenerator() {
		int runs;
		double rand = Math.random();
		//System.out.println(rand);
		
		// 70% of the time
		if(rand < .7264) {
			runs = 0;
		}
		// 20% of the time
		else if( rand > .7264 && rand < .8753) {
			runs = 1;
		}
		// 7% of the time
		else if( rand > .8753 && rand < .9439) {
			runs = 2;
		}
		// 1% of the time
		else if( rand > .9439 && rand < .9753) {
			runs = 3;
		}
		else if( rand > .9753 && rand < .9895){
			runs = 4;
		}
		else if( rand > .9895 && rand < .9955) {
			runs = 5;
		}
		else if( rand > .9955 && rand < .9980) {
			runs = 6;
		}
		else {
			runs = 7;
		}
		
		return runs;
	}

}

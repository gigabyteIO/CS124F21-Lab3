/**
 * This program simulates flipping a coin 80 times and checks to see if within those 80 flips
 * there were six heads in a row.
 * It additionally simulates doing this 1 million times and calculates the percentage of total times
 * six heads in a row occurs.
 * @author marti
 *
 */

public class SixHeads {

	public static void main(String[] args) {
		
		String flips = "";
		char flip;
		
		double totalExperiments;
		double doesContain;
		
		String sixHeads = "HHHHHH";
		doesContain = 0;
		totalExperiments = 1_000_000;
		
		// run 1 million times
		int count1 = 0;
		while(count1 < totalExperiments) {
			
			// flip 80 times
			int count = 0;
			while(count < 80) {

				double random = Math.random();

				if(random < .51) {
					flip = 'H';
				}
				else {
					flip = 'T';
				}

				flips = flips + flip;
				count++;
			}

			//System.out.println(flips);

			if(flips.contains(sixHeads)) {
				doesContain++;
			}
			
			// reset the string and increment count
			flips = "";
			count1++;
		}
		
		System.out.println("The probability that six heads occurs is:");
		System.out.println( (doesContain / totalExperiments) * 100 + "%" );

	}

}

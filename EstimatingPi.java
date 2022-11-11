/**
 * This program estimates the value of PI by randomly selecting X and Y-coordinates and adding
 * their squares and seeing if the value is less than 1. 
 * It does this many times and estimates PI by using the formula:
 * (4.0 * insideCount) / totalCount
 * where insideCount is the number of times x + y fall within < 1.
 * @author marti
 *
 */

public class EstimatingPi {

	public static void main(String[] args) {
		
		int totalCount; // total number of random points generated
		int insideCount; // number of random points that lie within the range (x^2 + y^2 < 1)
		
		double estimateForPi; //
		double randomX; // randomly generated x-coordinate between 0 and 1
		double randomY; // randomly generated y-coordinate between 0 and 1s
		
		totalCount = 100_000_000;
		insideCount = 0;
		
		int count = 0;
		while(count < totalCount) {
			randomX = Math.random();
			randomY = Math.random();
			
			//System.out.println(randomX + " " + randomY);
			
			// Check if x^2 + y^2 < 1
			if( (Math.pow(randomX, 2) + Math.pow(randomY, 2)) < 1 ) {
				insideCount++;
			}
			
			count++;
		}
		
		estimateForPi = ( (4.0 * insideCount) / totalCount);
		
		System.out.printf( "The actual value of Pi is: %1.6f%n", Math.PI );
		System.out.printf( "The estimate for Pi is:    %1.6f%n", estimateForPi );
		
	}

}

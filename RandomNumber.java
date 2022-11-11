
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 100; i++) {
			int rand = (int) (100 * Math.random() + 1);
			System.out.println(rand);
		}

	}

}

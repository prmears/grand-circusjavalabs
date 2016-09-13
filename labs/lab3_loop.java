package labs;
import java.util.Scanner;

public class lab3_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer");
		int sqrcub = scanner.nextInt();
		System.out.println();

		System.out.println("Number   Squared    Cubed");
		System.out.println("======   =======    =====");

	
		for	(int i = 1; i <= sqrcub; i++) {
			int sqr2 = i*i;
			int cub3 = i*i*i;
			System.out.println(i + "\t\t\t" + sqr2  + "\t\t\t" + cub3);
		} 

		System.out.println(sqrcub);
		
		System.out.println("Would you like to continue?");	
		String userInput = scanner.next();

	}
	// scanner.close()
}
}
		
	



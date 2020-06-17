import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter points x,y");
		double x = sc.nextInt();
		double y = sc.nextInt();
		
			if ( x*x +y*y<16) {
				System.out.println("+");
			}else {
				System.out.println("-");
			}
	}


	}



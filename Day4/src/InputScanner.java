import java.util.Scanner;

public class InputScanner {
	void a() {
		System.out.println("hey");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Favourite no.");
		InputScanner is = new InputScanner();
		
		int a=sc.nextInt();
		is.a();
		System.out.println("Your Fav No. is:"+ a);
		sc.close();
	}

}

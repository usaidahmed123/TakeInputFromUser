import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputBufferedString {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(I);
		System.out.println("type your Name");
		String n = br.readLine();
		System.out.println("ur buffered typed Name is : "+n);
	}

}

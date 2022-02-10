import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputBufferReader {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(I);
		System.out.println("type a number");
		int n = Integer.parseInt(br.readLine());
		System.out.println("ur buffered type input is : "+n);
	}

}

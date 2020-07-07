import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int n=a+b;
		if(n%2==0) {
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}

}

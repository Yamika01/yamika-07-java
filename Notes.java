import java.util.Scanner;

public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int nt=0;
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			nt=nt+n/100;
			n=n%100;
			nt=nt+n/50;
			n=n%50;
			nt=nt+n/10;
			n=n%10;
			nt=nt+n/5;
			n=n%5;
			nt=nt+n/2;
			n=n%2;
			nt=nt+n/1;
			n=n%1;
		
		System.out.println(nt);
		nt=0;
		}
	}

}

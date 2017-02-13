import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=0,j=0;
		int n=a;
		while(n>0)
		{
			i=n%10;
			j=j*10+i;
			n=n/10;
		}
		if(j==a)
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT A PALINDROME");
		}

	}

}

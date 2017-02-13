import java.util.*;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("the prime number between 1 and 100:");
Scanner sc=new Scanner(System.in);
for(int n=1;n<=100;n++)
{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			break;
		}
		else if(i==n-1)
		{
			System.out.println(n);
		}
	}
}

	}

}

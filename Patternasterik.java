import java.util.Scanner;


public class patternasterik {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of rows to be displayed:");
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();

for(int i=0;i<row;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print("\t*");
	}
	System.out.println("\n");
}

	}

}
	



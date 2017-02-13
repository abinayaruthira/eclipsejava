import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of rows to be displayed:");
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int count=0;
for(int i=0;i<row;i++)
{
	for(int j=0;j<=i;j++)
	{
		count=count+1;
		System.out.print("\t"+count);
	}
	System.out.println("\n");
}

	}

}

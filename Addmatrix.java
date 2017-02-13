import java.util.Scanner;
public class Addmatrix {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the matrix of a and b:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();



System.out.println("the X matrix is:");
int x[][]=new int[a][b];
for(int i=0;i<a;i++)
{
	for(int j=0;j<b;j++)
	{
		x[i][j]=sc.nextInt();
	    System.out.print("\t"+x[i][j]);	
		
	}
	
	System.out.println("\n");
}


System.out.println("the Y matrix is:");
int y[][]=new int[a][b];
for(int i=0;i<a;i++)
{
	for(int j=0;j<b;j++)
	{
		y[i][j]=sc.nextInt();
				
		System.out.print("\t"+y[i][j]);
	}
	System.out.println("\n");
		}

int c[][]=new int[a][b];
System.out.println("the addition of x and y is: ");
for(int i=0;i<a;i++)
{
	for(int j=0;j<b;j++)
	{
		c[i][j]=x[i][j]+y[i][j];
		System.out.print("\t"+c[i][j]);
	}
	System.out.println("\n");
}

	}

}

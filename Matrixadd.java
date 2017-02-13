import java.util.*;
public class Matrixadd {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the matrix of a and b:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int x[][]={{1,2,3},{4,5,6},{7,8,9}};
int y[][]={{7,8,9},{4,5,6},{1,2,3}};


System.out.println("the X matrix is:");
for(int i=0;i<a;i++)
{
	for(int j=0;j<b;j++)
	{
		
	System.out.print("\t"+x[i][j]);	
		
	}
	
	System.out.println("\n");
}

System.out.println("the Y matrix is:");
for(int i=0;i<a;i++)
{
	for(int j=0;j<b;j++)
	{
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

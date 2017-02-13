import java.util.*;
public class Transpose {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the matrix a and b:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();


System.out.println("enter the X matrix:");
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

System.out.println("the transpose of X matrix is");
int y[][]=new int[a][b];
for(int i=0;i<a;i++)
{
	for(int j=0;j<b;j++)
	{
		y[i][j]=x[j][i];
		System.out.print("\t"+y[i][j]);
	}
	System.out.println("\n");
}
	}

}

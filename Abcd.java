import java.util.Scanner;


public class Abcd {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		System.out.println("enter the String :");
		Scanner sc=new Scanner(System.in);
		s=sc.next();

int a=s.length();
char c[]=new char[a];
for (int j=0;j<a;j++)
{
	c[j]=s.charAt(j);
	System.out.print("\t"+c[j]);
		
}
System.out.println("\nenter the number of rows to be displayed:");
Scanner z=new Scanner (System.in);
int n=z.nextInt();
for (int i=0;i<n;i++)
{
for(int j=0;j<a;)
{
	System.out.print("\t");
	System.out.print(c[j]);
	j++;
	System.out.print(c[j-1]);
	
}
System.out.println("\n");

}
		
	
	
	
	
	
	
	
	}

}

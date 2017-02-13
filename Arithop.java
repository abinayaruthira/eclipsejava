import java.util.*;

import com.sun.swing.internal.plaf.basic.resources.basic;
public class Arithop {

	
	public static void main(String[] args)throws NumberFormatException {
		// TODO Auto-generated method stub
		String s=new String();
System.out.println("enter the String:");
Scanner sc=new Scanner(System.in);
s=sc.next();
int a=s.length();
char c[]=new char[a];
String b=new String();

for(int i=0;i<a;i++)
{
	c[i]=s.charAt(i);
	System.out.print(c[i]);

}

System.out.println("\n");
int x=0;

for(int i=0;i<a;i++)
{

if(Character.isDigit(c[i]))
{	
	b+=c[i];
	
 x=Integer.parseInt(b);
 

}
System.out.println(x);
	}

int temp=x;
int add=0,inti=0;
while (temp>0)
{
	inti=temp%10;
	add+=inti;
	temp=temp/10;
	
}
System.out.println(add);

}
}

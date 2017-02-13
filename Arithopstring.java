import java.util.Scanner;
import java.lang.*;
import javafx.util.converter.CharacterStringConverter;


public class Arithopstring {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		System.out.println("enter the String:");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		int a=s.length();
		System.out.println("the length of the string is:"+a);
		char c[]=new char[a];
		String b=new String();
		c=s.toCharArray();
		for(int i=0;i<a;i++)
		{
		if(Character.isDigit(c[i]))
		{
			try
		{
			
		
		b+=c[i];
		System.out.println(b);
		int x=Integer.parseInt(b);
		System.out.println(x);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
		}
		}
		
	
	
		

	}

}

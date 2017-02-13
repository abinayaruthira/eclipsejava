import java.util.*;
import java.lang.*;
public class Worddisplay {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ram loves India";
		int a=s.length();
System.out.println(a);
int x=s.indexOf("loves");
System.out.println("the index of word loves is:"+x);
String y=new String();
String sp[]=s.split("\\s");
for(int i=0;i<sp.length;i++)
{
System.out.println(sp[i]);
}

System.out.println(sp[1]);
	}

}

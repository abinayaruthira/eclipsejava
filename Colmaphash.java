import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Colmaphash {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> telephonedir=new HashMap<String,Integer>();
		telephonedir.put("john",234567);
		telephonedir.put("raju", 678543);
		telephonedir.put("ramesh",213765);
		telephonedir.put("sita",758943);
		telephonedir.put("radha",265987);
		System.out.println(telephonedir);
		
		for(Map.Entry m:telephonedir.entrySet())
		{
			System.out.println("key:"+m.getKey()+" and value:"+m.getValue());
		}
		
		
		System.out.println("enter the key(name):");
		Scanner sc=new Scanner(System.in);
		String k=sc.next();
		System.out.println(telephonedir.get(k));
		
		for(Map.Entry m:telephonedir.entrySet())
		{
			if(telephonedir.get(m).equals(k))
			{
				System.out.println(m.getValue());
			}
		}
		
		/*System.out.println("enter the phone number:");
		int v=sc.nextInt();
		System.out.println(telephonedir.get(v));*/
	
	
	}

}

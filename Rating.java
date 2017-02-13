import java.util.*;
public class Rating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("enter the number of customers");	
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float average=0;

String name[]=new String[a];
float rating[]=new float[a];

for(int i=0;i<a;i++)
{
	
	System.out.println("customer name"+"\trating");
	name[i]=sc.next();
	rating[i]=sc.nextFloat();
	average+=rating[i]/a;
	
}

System.out.println("the average rating for android mobile is:"+average);
	}

}

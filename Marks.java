import java .util.*;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student count:");
		int ar=sc.nextInt();
		String name[]=new String[ar];
		int rollno[]=new int[ar];
		int c[]=new int[ar];
		int cp[]=new int[ar];
		int java[]=new int[ar];
		int html[]=new int[ar];
		int sql[]=new int[ar];
		for(int i=0;i<ar;i++)
		{
			System.out.println("name"+"\trollno"+"\tcmark"+"\tcpmark"+"\tjavamark"+"\thtmlmark"+"\tsql");
		name[i]=sc.next();                          //details of student and their marks
		rollno[i]=sc.nextInt();
		c[i]=sc.nextInt();
		cp[i]=sc.nextInt();
		java[i]=sc.nextInt();
		html[i]=sc.nextInt();
		sql[i]=sc.nextInt();

		}
		for(int i=0;i<ar;i++)
		{
			int totalmarks[]=new int[ar];
			int percentage[]=new int[ar];
			System.out.println("total marks"+"\tpercentage");
			
			totalmarks[i]=c[i]+cp[i]+java[i]+html[i]+sql[i];                      //total marks in all subject
			
			percentage[i]=(totalmarks[i]*100)/500;                                       
			System.out.println(" "+totalmarks[i]+"\t "+percentage[i]);              //average
			
			if(percentage[i]>=85&&percentage[i]<=100)                                    //display grade
			{
				System.out.println("A+ grade");
			}
			else if(percentage[i]>=75&&percentage[i]<=84)
			{
				System.out.println("A grade");
			}
			else if(percentage[i]>=65&&percentage[i]<=75)
			{
				System.out.println("B grade");
			}
			else if(percentage[i]>=50&&percentage[i]<=64)
			{
				System.out.println("C grade");
			}
			
			else if(percentage[i]<=50)
			{
				System.out.println("FAIL");
			}
			
		}

	}

}

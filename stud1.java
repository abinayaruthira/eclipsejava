import java.util.*;
public class stud1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the student count:");
int ar=sc.nextInt();
String name[]=new String[ar];
int rollno[]=new int[ar];
int age[]=new int[ar];
String gen[]=new String[ar];
int c[]=new int[ar];
int cp[]=new int[ar];
int java[]=new int[ar];
int html[]=new int[ar];
for(int i=0;i<ar;i++)
{
	System.out.println("name"+"\tage"+"\tgender"+"\trollno"+"\tcmark"+"\tcpmark"+"\tjavamark"+"\thtmlmark");
name[i]=sc.next();                          //details of student and their marks
age[i]=sc.nextInt();
gen[i]=sc.next();
rollno[i]=sc.nextInt();
c[i]=sc.nextInt();
cp[i]=sc.nextInt();
java[i]=sc.nextInt();
html[i]=sc.nextInt();

}
for(int i=0;i<ar;i++)
{
	int totalmarks[]=new int[ar];
	int avg[]=new int[ar];
	System.out.println("total marks"+"\taverage");
	
	totalmarks[i]=c[i]+cp[i]+java[i]+html[i];                      //total marks in all subject
	
	avg[i]=totalmarks[i]/4;                                       
	System.out.println(" "+totalmarks[i]+"\t "+avg[i]);              //average
	
	if(avg[i]>=90&&avg[i]<=100)                                    //display grade
	{
		System.out.println("A grade");
	}
	else if(avg[i]>=80&&avg[i]<=90)
	{
		System.out.println("B grade");
	}
	else if(avg[i]>=70&&avg[i]<=80)
	{
		System.out.println("C grade");
	}
	else if(avg[i]>=60&&avg[i]<=70)
	{
		System.out.println("D grade");
	}
	else if(avg[i]>=50&&avg[i]<=60)
	{
		System.out.println("E grade");
	}
	else if(avg[i]>=1&&avg[i]<=50)
	{
		System.out.println("FAIL");
	}
	else
	{
		System.out.println("absent");
	}
}
int max=age[0];
 int count=0;
for(int i=0;i<ar-1;i++)                                                    //eldest student in the batch
{
	if(max<=age[i+1])
	{
		max=age[i+1];
		count=i+1;
	}
}

System.out.println("the eldest student in the batch is: "+name[count]+"\tand the age is:"+age[count]);

int max1=c[0];
int countc=0;
for(int i=0;i<ar-1;i++)                                                //highest mark in c exam
{
	if(max1<=c[i+1])
	{
	max1=c[i+1];
	countc=i+1;
    }
	
}
System.out.println("the highest mark in c is: "+name[countc]+"\tand the mark is:"+cp[countc]);



int max2=cp[0];
int countcp=0;
for(int i=0;i<ar-1;i++)                                             //highest mark in c plus exam
{
	
	if(max2<=cp[i+1])
	{
	max2=cp[i+1];
	countcp=i+1;
    }
}
System.out.println("the highest mark in cp is: "+name[countcp]+"\tand the mark is:"+cp[countcp]);

	


int max3=java[0];
int countj=0;
for(int i=0;i<ar-1;i++)                                              //highest mark in java exam
{
	
	if(max3<=java[i+1])
	{
	max3=java[i+1];
	countj=i+1;
    }
}
	System.out.println("the highest mark in java is: "+name[countj]+"\tand the mark is:"+java[countj]);
	


int max4=html[0];
int counth=0;
for(int i=0;i<ar-1;i++)                                              //highest mark in html exam
{
	
	if(max4<=html[i+1])
	{
	max4=html[i+1];
	counth=i+1;
    }
	
}
System.out.println("the highest mark in html is: "+name[counth]+"\tand the mark is:"+html[counth]);


int genm=0;
int genf=0;
for(int i=0;i<ar-1;i++)                                             //no.of male student and no.of female student in the list
{
	if(gen[i].equalsIgnoreCase("male"))
	{
		genm=genm+1;
	}
	else if(gen[i].equalsIgnoreCase("female"))
	{
		genf=genf+1;
		
	}
	else
	{
		System.out.println("no data");
	}
}
System.out.println("the number of male is:"+genm+"\tthe number of female is:"+genf);

}
}

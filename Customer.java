import java.util.*;
	
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number of customers in the list:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String cus_name[]=new String[a];
		int price[]=new int[a];
		int quan_pro[]=new int[a];
		int salary=10000;
		
		for(int i=0;i<a;i++)
		{
			System.out.println("cus-name"+"\tprice-pro"+"\tquantity-pro");
			cus_name[i]=sc.next();
			price[i]=sc.nextInt();
			quan_pro[i]=sc.nextInt();
			
		}
		for(int i=0;i<a;i++)
		{
			int tot_pur[]=new int[a];
			int percentage[]=new int[a];
		    tot_pur[i]=price[i]*quan_pro[i];
		    percentage[i]=(tot_pur[i]*100)/10000;
		System.out.println("total purchase amount"+tot_pur[i]+"\tpercentage spent on purchase"+percentage[i]);
		
			
			
		}

	}

}

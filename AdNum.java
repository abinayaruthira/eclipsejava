import java.util.*;
import javax.lang.*;
public class AdNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=1,i,j,k,t,num;
		int [][]a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value: ");
		num=sc.nextInt();
		a=new int[num][num];
		for(i=0,k=num-1,t=0;i<num&&t<num;t++,k--)
		{
			for(j=0;j<num;j++)
			{
				a[i][j]=v;
				v++;
			}
			if(t%2==0)
			{
				i=i+k;
			}
			else
			{
				i=i-k;
			}
		}
		for(i=0;i<num;i++)
		{
			for(j=0;j<num;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}

}

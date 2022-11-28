import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=input.nextInt();
		int i=1,j=1,x=0;
		System.out.print(i+" ");
		System.out.print(j+" ");
		while(x<=num)
		{
			int sum=i+j;
			System.out.print(sum+" ");
			i=j;
			j=sum;
			x++;
			//temp=sum+j;
			//System.out.println(temp);
		}
	
	}
}	
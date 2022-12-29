import java.util.Scanner;
public class AtmExp
{
  public static void main(String args[])
  {
	Scanner input = new Scanner (System.in);
	int balance = 400000;
	System.out.println("Enter your name:");
	String name = input.nextLine();
	System.out.println("Enter your Password:");
	int pwd = input.nextInt();
	System.out.println("Enter your option: \n1.Withdraw \n2.Deposit \n3.Balance \n4.Exit");
	int option = input.nextInt();
	switch(option)
	{
		case 1 : 
			System.out.println("Enter your amount");
			int amount = input.nextInt();
			if(amount < balance)
			{
			    System.out.println("Receive your amount");
				balance = amount - balance;
			}
			break;	
		case 2:
			System.out.println("Enter your deposit amount");
			int deposit = input.nextInt();
			balance = deposit + balance;
			System.out.println(balance);
			break;
		case 3:
			System.out.println(balance);
			break;
		case 4:
			System.out.println("Thankyou, visit again");
			break;
	}
  }
}  

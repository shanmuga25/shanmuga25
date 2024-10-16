import java.util.*;
class ATM_PROJECT 
{
	public static void main(String[] args) 
	{
		long Account_number=9876543210L;
		int pin=1234;
		int balance=10000;
		
		int addamount=0;
		int takeamount=0;
		
		String name;
		
		Scanner sc=new Scanner(System.in);
		
		//we have to take an input by user
		
		System.out.println("enter your Account number:");
		long account_no = sc.nextLong();
		
		if(Account_number==account_no)
		{
			System.out.println("-----------");
		}
			else
		{
				System.out.println("wrong account_no");
		}
				
			
		
		System.out.println("enter your pin number:");
		int password = sc.nextInt();
		
		if(password == pin)
		{
			System.out.println("Enter your name:");
			name=sc.next();
			System.out.println("welcome:"+name);
			System.out.println("=========================");
			
			while(true)
			{
				System.out.println("press 1 to check your balance");
				System.out.println("press 2 to add amount");
				System.out.println("press 3 to take amount");
				System.out.println("press 4 to take resipt");
				System.out.println("press 5 to exit");
				
				int opt=sc.nextInt();
				switch(opt)
				{
					case 1:
						System.out.println("\t\t\tyour current balance is==" +balance);
					break;
					
					case 2:
						System.out.println("\t\t\tHow much amount did you want to DEPOSITE in your account");
					    addamount=sc.nextInt();
						
						System.out.println("successfully credited");
						System.out.println("............................");
						balance= addamount + balance;
						//10000=100+10000
						//balance=10100
						break;
						
						case 3:
							System.out.println("\t\t\tHow much amount did you want to WITHDRAW in your account");
						    takeamount=sc.nextInt();
							
							if(takeamount>balance)
					{
								System.out.println("your balace is insufficient");
								System.out.println("try less than your available balance");
					}
					
					else 
					{
						System.out.println("successfully taken");
						System.out.println("............................");
						balance=balance-takeamount;
						//balance=10100-100
						//balance=10000
					}
					break;
					
					case 4:
						
					    System.out.println("-----------------------------------------");
					
						System.out.println("WELCOME TO AXIS BANK ATM");
						System.out.println("available balance ==>>" + balance);
						System.out.println("amount deposit    ==>>" + addamount);
						System.out.println("amount taken      ==>>" + takeamount);
						System.out.println("Thank you for coming...");
						System.out.println("----------------------------------------");
					
					break;
					
					default:
						System.out.println("press the number below 5");
					break;
				}
				
					
					if(opt == 5)
					{
					System.out.println("Thankyou");
					break;
					}
					
				}
			}
			
			else 
			{
				System.out.println("wrong pin number");
			}
		}
	}


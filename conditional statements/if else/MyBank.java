import java.util.Scanner;
class MyBank
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String username1 = null;
		String password1 = null;
		String address = null;
		long contact = 0;
		double balance = 0.0;
		
		for( ; ; )
		{
			System.out.println();
			System.out.println("     WelcomeTO    ");
			System.out.println("  Laxmi Chit Funds ");
			System.out.println();
			System.out.println("1.Existing User");
			System.out.println("2.Create Account");
			System.out.println();
			System.out.println("Enter the option: ");
			int opt = sc.nextInt();
			
			System.out.println();
			
			if(opt == 1)
			{
				if(username1==null){
					System.out.println("create your account first");
					continue;
				}
				System.out.println("Login");
				System.out.println();
				
				for(int i= 3; i>=1; i--)
				{
					System.out.print("Username : ");
					String username = sc.next().toUpperCase();
					System.out.println();
					System.out.print("Password : ");
					String password = sc.next();
					System.out.println();
					
					if(username.equals(username1) && password.equals(password1))
					{
						home:
						for( ; ; )
						{
							System.out.println();
							System.out.println("  HOME PAGE ");
							System.out.println();
							System.out.println("1.DEPOSIT");
							System.out.println("2.WITHDRAW");
							System.out.println("3.CHECK BALANCE");
							System.out.println("4.MINI STATEMENT");
							System.out.println("5.LOGOUT");
							System.out.println();
							System.out.print("enter your option: ");
							int opt1 = sc.nextInt();
							System.out.println();
							switch(opt1)
							{
								case 1://deposit
								{
									System.out.println("   Deposit ");
									System.out.println();
									System.out.print("enter the amount to deposit : ");
									double depositAmt = sc.nextDouble();
									balance += depositAmt;
									System.out.println();
									System.out.println("Amount Deposited Successfully");
									break;
									
								}
								case 2://withdraw
								{
									System.out.println("   Withdraw ");
									System.out.println();
									System.out.print("enter the amount to Withdraw : ");
									double withdrawAmt = sc.nextDouble();
									System.out.print("enter pin");
									String pass  = sc.next();
									if(pass.equals(password1))
									{
										if(withdrawAmt <= balance)
										{
											balance -= withdrawAmt;
											System.out.println();
											System.out.println("Amount Debited Successfully");
										}else{
											System.out.println("Insufficient Funds");
										}
									}else{
										System.out.println("wrong pin");
									}
									break;
								}
								case 3://balance
								{
									System.out.println("   Check Balance ");
									System.out.println();
									for(int j = 3; j>=1 ; j--)
									{
										System.out.print("enter pin : ");
										String pass1  = sc.next();
										if(pass1.equals(password1))
										{
											System.out.println("Account Balance : "+balance+ " rs");
											continue home;
										}else{
											System.out.println();
											System.out.println("wrong pin");
											System.out.println("Attempt left : "+(j-1));
									
										}
									}
									System.out.println("Your Account has been blocked for 24 hours.");
									System.exit(0);
									
									break;
								}
								case 4://mini statement
								{
									System.out.println("MINI Statement");
									break;
								}
								case 5:
								{
									System.out.println("thank you for visiting us.....");
									System.out.println("HAVE A GREAT DAY");
									System.exit(0);
								}
							}
							
						}
					}else{
						System.out.println("Invalid cred");
						System.out.println("Attempt left : "+(i-1));
						
						
					}
					
					
				}
			}else if(opt == 2){
					System.out.print("Username : ");
					username1 = sc.next().toUpperCase();
					System.out.println();
					
					System.out.print("Password : ");
					password1 = sc.next();
					System.out.println();
					sc.nextLine();
					System.out.print("Address : ");
					address = sc.nextLine();
					System.out.println();
					
					System.out.print("Mobile no : ");
					contact = sc.nextLong();
					System.out.println();
					
					System.out.print("Deposit Amount : ");
					balance = sc.nextDouble();
					System.out.println();
					
					System.out.println("Account Created Successfully");
					
			}else{
				System.out.println("Invalid Option");
			}
			System.out.println();
		
		}
	}
}
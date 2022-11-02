package StringPrograms;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=100000,withdraw,deposit;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Automated teller machine");
			System.out.println("Chosse 1 for withdraw");
			System.out.println("Choose 2 for deposit");
			System.out.println("Choose 3 for check balance");
			System.out.println(" choose 4 for exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the money to withdrawn");
				withdraw=sc.nextInt();
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					System.out.println("Please colect your money");
					System.out.println("total balance is--"+balance);
					break;
				}
				else
				{
					System.out.println("insufficint money");
					
				}
				System.out.println("");
				break;
			
				
			}
		}
		

	}

}

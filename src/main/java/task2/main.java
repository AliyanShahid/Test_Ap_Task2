package task2;




import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n;
		int balance=0,tmp=0;
		int user;
		System.out.print("******Welcome To Bank Management System********\n\n");
		String name;
		String address;
		String phn;
		System.out.println("1. Create Account");
		System.out.println("2. Close Account");
		System.out.println("3. Login ");
		System.out.println("4. Account Details ");
		System.out.println("5. Display Account Details");
		System.out.println("6. Display Deductions \n");
		System.out.println("7. Quit");
		System.out.print("Enter Your Choice : ");
		n=myObj.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter Your Name : ");
			name=myObj.next();
			System.out.print("Enter Your Address : ");
			address=myObj.next();
			System.out.println("Enter you Phone Number : ");
			phn=myObj.next();
		case 2:
			System.out.println("Enter Your Name : ");
		
				
	case 3: // depositetem.out.print("Enter your account Number : ");
		tmp=myObj.nextInt();
		System.out.print("Enter Amount Of Money : ");
		balance=myObj.nextInt();
		System.out.println("\t Successfully Deposited.");
		}
		System.out.println("Wrong Accoount Number.");
		
		
		/*System.out.println("                   Enter Login Password               ");
		String name = myObj.nextLine();
		System.out.print("Password : " + name);*/
		}
	}

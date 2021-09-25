package task2;
public class create_account extends Account{
	
	create_account(String n,int acc_num,int b,String a_t){ // pass name and account type
	name=n;
	Acc_num=acc_num;
	Acc_Balance=b;
	acc_type=a_t;
	}
	public create_account(){
	super();
	}
	void insert(String n,int acc_num,String a_t){ // input user name, account number and type
	name=n;
	acc_type=a_t;
	Acc_num=acc_num; // generate random number
	Acc_Balance=0;
	}
	void display_details(){
	System.out.println("Depositor Name :" +name);
	System.out.println("Account Number : "+Acc_num);
	System.out.println("Account Balance : "+Acc_Balance);
	System.out.println("Account Type : "+acc_type);
	}
   public int deposite(int acc_num,int money){
	Acc_Balance=money;
	return Acc_Balance;
	}
	public int withdraw(int withd){
	Acc_Balance=withd;
	return Acc_Balance;
	}
	} // end class

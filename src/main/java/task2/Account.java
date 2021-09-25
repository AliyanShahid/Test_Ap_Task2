package task2;
public class Account{
	 
    
	String name,acc_type;
	int Acc_num,Acc_Balance;
	public Account(){
	}
	public int get_balance()
	{
		return Acc_Balance;
	}
	public void set_balance(int bal)
	{
		Acc_Balance=bal;
	}
	
	Account(String n,int acc_num,int b,String a_t){
	name=n;
	Acc_num=acc_num;
	Acc_Balance=b;
	acc_type=a_t;
	}
	} // end class

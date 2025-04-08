class BankAccount{
	private String userName;
	private String bankName;
	private long accno;
	private String ifsc;
	private int pin;
	private double balance;
	
	public BankAccount(String userName, String bankName, long accno, String ifsc, int pin){
		this.userName = userName;
		this.bankName = bankName;
		this.accno = accno;
		this.ifsc = ifsc;
		this.pin = pin;
	}
	public void showdetails(){
		System.out.println(this.getUser());
		System.out.println(this.getBankName());
		System.out.println(this.getAccno());
		System.out.println(this.getIFSC());
		System.out.println(this.getBal(this.accno,this.pin));
		System.out.println("-------------------------");	
	}
	//getters
	public String getUser(){
		return userName;
	}
	public String getBankName(){
		return bankName;
	}
	public long getAccno(){
		return accno;
	}
	public String getIFSC(){
		return ifsc;
	}
	public double getBal(long accno, int pin){
		if(this.accno == accno && this.pin == pin){
			return balance;
		}
		else
		{
			System.out.println("invalid credentials");
			return 0;
		}
	}
	
	//setters
	public void setPin(long accno, int oldPIN,int newPin){
		if(this.accno == accno && this.pin == oldPIN){
			pin = newPin;
			System.out.println("pin updated");
		}
		else
		{
			System.out.println("invalid credentials");
		}
	}
	
	public void credit(long accno, int pin, double amt){
		if(this.accno == accno && this.pin == pin){
			if(amt > 0){
				balance += amt;
				System.out.println("amount credited");
			}
			else{
				System.out.println("invalid amount");
			}
		}
		else{
			System.out.println("invalid credentials");
		}
	}
	
	public void debit(long accno, int pin, double amt){
		if(this.accno == accno && this.pin == pin){
			if(amt > 0 ){
				if(balance-amt > 1000){
					balance -= amt;
					System.out.println("amount debited");
				}
				else{
					System.out.println("insufficient balance");
				}
			}
			else{
				System.out.println("invalid amount");
			}
		}
		else{
			System.out.println("invalid credentials");
		}
	}
	
}
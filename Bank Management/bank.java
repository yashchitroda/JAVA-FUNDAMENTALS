import java.util.*;	// util package
class bank	// class bank
{
	String name,type;	// var sting
	double accno,bal = 500.0;	// var double
	void details()	// method details
	{
		Scanner sc = new Scanner(System.in);	//scanner object
		System.out.println("Enter Account Number : ");	//print statement
		accno = sc.nextDouble();	//double input
		System.out.println("Enter Name of Depositor : ");//print statement
		name = sc.next();
		System.out.println("Enter Account Type : ");//print statement
		type = sc.next();
	}
	void deposit(int amount)// method deposit
	{
		double updatedbalance = bal + amount;
		System.out.println("bal Before Deposit : " + bal);//print bal
		
		bal = updatedbalance;
		System.out.println("bal After Deposit : " + updatedbalance);//print updatedbalance
	}
    void withdraw(int amount)// method widthdraw
	{
		if(bal<500)// if statement
		System.out.println("Insufficient bal");//print statement
		else if(amount>500)// else-if statement
		System.out.println("Available bal is : " + bal);//print statement
		else// else statement
		{
			double updatedbalance = bal - amount;
			System.out.println("bal Before Withdrawal : " + bal);//print statement
			
			bal = updatedbalance;
			System.out.println("bal After Withdrawal : " + updatedbalance);//print statement
	  }
	}
	void display()//method display
  	{
		System.out.println("bal is : " + bal);//print statement
	}
	public static void main(String args[])// main method
 	{
	bank b = new bank();// bank object
  	Scanner sc = new Scanner(System.in);//scanner object
  	int exp,amount;// var dclaration
  do
  {
   System.out.println("Select:\n\n1  Enter Details \n\n2  Deposit value  \n\n3  Withdraw value  \n\n4  Check Balance \n\n5  --Exit-- \n\n6  Abort Transaction...");//print statement
   exp = sc.nextInt();// int input
   switch(exp)	//switch statement
   {
		case 1:	//case 1
    {
		 b.details();
	   break;	//break statement
	  }
	  case 2://case 2
	  {
		  System.out.println("Enter Deposit Amount : ");//print statement
		  amount = sc.nextInt();// int input
		  b.deposit(amount);//object instantiation and passing parameters
		  break;//break statement
	  }
	  case 3://case 3
	  {
		  System.out.println("Enter Withdrawal Amount : ");//print statement
		  amount = sc.nextInt();// int input
		  b.withdraw(amount);//object instantiation and passing parameters
		  break;//break statement
	  }
	  case 4://case 4
	  {
		  b.display();
		  break;//break statement
	  }
	  case 5://case 5
	  {
	  	  System.out.println("exited sucessfully : ");//print statement
	  	  break;//break statement
	  }
	  case 6://case 6
	  {
	  	  System.out.println("Transaction aborted successfully : ");//print statement
	  	  break;//break statement
	  }

  }
 }while(exp==10);// stop while value == 10
}
}

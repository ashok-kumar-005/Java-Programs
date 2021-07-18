import java.util.*;

class Transaction {
// Instance variable
public double balance;

// Constructors
public Transaction() {
balance = 1000;
}

// Instance methods
public void deposit(double amount) {
balance += amount;
}

public void withdraw(double amount)
{
double newbalance=amount-balance;
if(newbalance>balance)
{
balance -= amount;
}
else
{
System.out.println("Balance not sifficient");
}
}

public double getBalance() {
return balance;
}

}
class TransactionMainClass
{
public static void main(String []args)
{
Transaction tr=new Transaction();
Scanner in = new Scanner(System.in);
int choice;
double amt;
do {
System.out.println("1. Deposit");
System.out.println("2. Withdrawal");
System.out.println("3. Check balance");
System.out.print("4. Exit\n");
choice=in.nextInt();
switch (choice)
{
case 1:
System.out.print("Amount to deposit: ");
amt = in.nextDouble();
tr.deposit(amt);
break;
case 2:
System.out.print("Amount for Withdrawal ");
amt = in.nextDouble();
tr.withdraw(amt);
break;
case 3:double amt2=tr.getBalance();
System.out.println("Balance is:"+amt2);
break;
default:break;
}
} while (choice!=4);
}

}
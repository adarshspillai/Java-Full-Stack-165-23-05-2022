package polymorphismassignment;
public class Account2 { 
private int accountNumber; 
private double balance = 0.0; 
public Account2(int accountNumber, double balance) { 
super(); 
this.accountNumber = accountNumber; 
this.balance = balance; 
} 
public Account2(int accountNumber) { 
super(); 
this.accountNumber = accountNumber; 
} 
public int getAccountNumber() { 
return accountNumber; 
}
public double getBalance() { 
return balance; 
} 
public void setBalance(double balance) { 
this.balance = balance; 
} 
void credit(double amount) { 
balance = balance + amount; 
} 
void debit(double amount) { 
if (balance <= amount) { 
System.out.println("Insufficient balance"); 
} else { 
balance = balance - amount; 
} 
} 
public String toString() { 
return "A/C no:" + accountNumber + " Balance" + balance; } 
public static void main(String[] args) { 
Account2 a2 = new Account2(548754219); 
a2.setBalance(550000.0); 
System.out.println(a2.toString()); 
a2.credit(3000); 
System.out.println(a2.getBalance()); 
a2.debit(2000); 
System.out.println(a2.getBalance()); 
} 
}

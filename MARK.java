public class mark{
public static void main (srting [] args){
    int x = 5;
    int y = 7;
    int sum = x + y;
    system.out.println("sum");
}

}

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        }else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        }else {
            System.out.println("Withdrawal amount must be positive and less than or equal to balance.");
        }
    }
}

/*
Which field is private?
Why are they private?
Which methods provide access?
Where is validation performed?
Why shouldn't the balance be public?

answers to above questions

1. Which field is private?
accountNumber and balance are private fields.
2. Why are they private?
They are private to achieve encapsulation and protect the data from direct and uncontrolled access.
3. Which methods provide access?
getAccountNumber() and getBalance() provide read access. deposit() and withdraw() control changes to the balance.
4. Where is validation performed?
Validation is performed inside the deposit() and withdraw() methods using if conditions.
5. Why shouldn't the balance be public?
The balance should not be public because other parts of the program could change it directly without validation. Making it private protects the account data and maintains control over transactions.



•	Define encapsulation.
•	Explain the importance of data hiding.
•	Identify Java access modifiers.
•	Differentiate between private, default/package-private, protected, and public.
•	Create classes using encapsulation.
•	Use getters and setters correctly.
•	Apply validation when modifying object data.
•	Explain why fields are generally declared private.

. Define Encapsulation
Encapsulation is the process of wrapping data (variables) and methods that operate on that data into a single class, while restricting direct access to the data.
In Java, encapsulation is commonly achieved by:
•	Declaring fields as private. 
•	Providing getters to read data. 
•	Providing setters to modify data. 
________________________________________
2. Explain the Importance of Data Hiding
Data hiding means preventing direct access to the internal data of an object.
It is important because it:
1.	Protects data from unauthorized or incorrect access. 
2.	Prevents accidental modification of important values. 
3.	Allows validation before data is changed. 
4.	Improves security of the program. 
5.	Makes programs easier to maintain because internal implementation can be changed without affecting other classes. 
Example: A bank account balance should not be changed directly by other classes.
________________________________________
3. Identify Java Access Modifiers
Java has four main access levels:
1.	private 
2.	default/package-private — when no modifier is written 
3.	protected 
4.	public 
________________________________________
4. Differentiate Between the Access Modifiers
Modifier	Same Class	Same Package	Subclass	Other Packages
private	✓	✗	✗	✗
default/package-private	✓	✓	✗*	✗
protected	✓	✓	✓	✓**
public	✓	✓	✓	✓
* A subclass in the same package can access package-private members because it is in the same package.
** A subclass in another package can access protected members through inheritance.
Exam definitions:
•	Private: Can only be accessed within the same class. 
•	Default/Package-private: Can be accessed by classes in the same package. 
•	Protected: Can be accessed within the same package and by subclasses. 
•	Public: Can be accessed from anywhere the class itself is accessible. 
________________________________________
5. Create a Class Using Encapsulation
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
}
Here, accountNumber and balance are private, so other classes cannot directly change them.
________________________________________
6. Use Getters and Setters Correctly
A getter is a method used to read or return the value of a private field.
Example:
public double getBalance() {
    return balance;
}
A setter is a method used to change or update the value of a private field.
Example:
public void setBalance(double balance) {
    this.balance = balance;
}
Simple rule to remember:
Getter = Get/Read data
Setter = Set/Change data
________________________________________
7. Apply Validation When Modifying Object Data
Validation means checking whether a new value is acceptable before storing it.
Example:
public void setBalance(double balance) {
    if (balance >= 0) {
        this.balance = balance;
    } else {
        System.out.println("Balance cannot be negative.");
    }
}
If someone tries:
account.setBalance(-500);
the setter rejects the invalid value.
Exam point: Validation in setters helps maintain the correct and valid state of an object.
________________________________________
8. Explain Why Fields Are Generally Declared Private
Fields are generally declared private because:
1.	It protects the data from direct access. 
2.	It prevents unwanted modification. 
3.	It allows the programmer to control how data is accessed. 
4.	It allows validation before changing values. 
5.	It improves security and reliability. 
6.	It supports encapsulation and data hiding. 
7.	It makes the program easier to maintain. 


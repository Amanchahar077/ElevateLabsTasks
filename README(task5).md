Bank Account Simulation - Java OOP
===================================

Objective:
----------
This project simulates basic bank operations such as deposit, withdrawal, 
checking balance, and viewing transaction history using Java Object-Oriented Programming.

Tools Required:
---------------
- Java (JDK 8 or higher)
- VS Code / IntelliJ / Eclipse (or any IDE)
- Terminal / Command Prompt

How It Works:
-------------
1. The program starts by creating a bank account with:
   - Account holder's name
   - Initial balance

2. The program provides a menu-driven interface with the following options:
   - 1: Deposit money
   - 2: Withdraw money
   - 3: Check balance
   - 4: View transaction history
   - 0: Exit the program

3. All transactions (deposit/withdrawal attempts) are recorded in the account's transaction history.

Features:
---------
- Deposit method (adds money if amount > 0).
- Withdraw method (deducts money if balance is sufficient).
- Maintains account balance.
- Maintains transaction history with details of each operation.
- Menu-driven interface for user interaction.

How to Run:
-----------
1. Save the file as `Main.java`.
2. Open a terminal/command prompt and navigate to the file's directory.
3. Compile the program:
   javac Main.java
4. Run the program:
   java Main
5. Follow the on-screen menu instructions.

Example Run:
------------
Enter account holder name: Aman
Enter initial balance: 1000

--- Bank Menu ---
1. Deposit
2. Withdraw
3. Check Balance
4. Transaction History
0. Exit
Enter choice: 1
Enter deposit amount: 500
(Current balance updated to 1500)

Enter choice: 2
Enter withdrawal amount: 200
(Current balance updated to 1300)

Enter choice: 4
Transaction history for Aman:
Account created with balance: 1000
Deposited: 500 | Balance: 1500
Withdrew: 200 | Balance: 1300

Enter choice: 0
Exiting... Thank you!

---------------------------------------
Developed as part of Java OOP practice.

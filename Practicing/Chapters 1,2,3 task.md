### 🎯 Your Comprehensive Practice Task

**Create a Java program called `SmartCalculator.java` that acts as an interactive, menu-driven calculator with a special feature.**

This program will require you to use:

- Variables, data types, and operators from Chapter 2.
- The `Scanner` class for input from Chapter 2.
- Conditional statements (`if`, `if-else`, `switch`) from Chapter 3.
- The `Math` class for calculations and random number generation from Chapters 2 & 3.
- Basic program structure, compilation, and execution from Chapter 1.

---

### 📋 Program Requirements:

1.  **Display a Welcome Message:** Use `println` statements to display a welcome message and the program's name when it starts.

2.  **Main Menu:** Present the user with a menu of options. Store the user's choice in a variable.

    ```
    Please choose an operation:
    1. Add two numbers
    2. Subtract two numbers
    3. Multiply two numbers
    4. Divide two numbers
    5. Generate a random number within a range
    6. Exit
    Enter your choice (1-6):
    ```

3.  **Process User Choice:** Use a `switch` statement to handle the user's menu choice (options 1-6).

4.  **Perform Calculations (for options 1-4):**

    - For choices 1-4, prompt the user to enter two numbers (`double` values).
    - Perform the corresponding calculation (addition, subtraction, multiplication, division).
    - **Important for Division (Option 4):** Use an `if` statement to check if the second number (the divisor) is zero. If it is, print an error message "Error: Cannot divide by zero!" instead of performing the calculation. This practices logic errors from Chapter 1.
    - Print the result in a user-friendly format (e.g., `"The result is: <result>"`).

5.  **Generate Random Number (Option 5):**

    - For choice 5, prompt the user to enter a lower bound and an upper bound (two integers).
    - Use `Math.random()` to generate a random integer within that range (inclusive). _(Hint: You'll need to cast the result and use the formula from Chapter 3)_.
    - Print the generated number. `"Your random number is: <number>"`

6.  **Exit (Option 6):** For choice 6, print a goodbye message (e.g., `"Thank you for using SmartCalculator! Goodbye."`) and use `System.exit(0);` to terminate the program.

7.  **Handle Invalid Input:** Use the `default` case in your `switch` statement to handle any input that is not between 1-6. Print an error message: `"Invalid choice. Please restart the program and select a number between 1 and 6."`

8.  **Code Quality:**
    - Use meaningful variable names following Java naming conventions (camelCase).
    - Add comments to explain sections of your code.
    - Use constants where appropriate (e.g., you could define menu options as `final` variables).

---

### 🔍 Example Output (for a single run):

```
Welcome to the SmartCalculator!
--------------------------------
Please choose an operation:
1. Add two numbers
2. Subtract two numbers
3. Multiply two numbers
4. Divide two numbers
5. Generate a random number within a range
6. Exit
Enter your choice (1-6): 1

Enter the first number: 12.5
Enter the second number: 3.2
The result is: 15.7
```

```
... (menu would show again if you used a loop, but since we haven't covered loops, the program will just end after one operation. This is fine for this task!)
```

### ✅ What This Practices:

- **Chapter 1:** Program structure, `main` method, `System.out.println`, comments.
- **Chapter 2:** Variables (`int`, `double`), `Scanner` input, arithmetic operators, `Math.random()`, constants.
- **Chapter 3:** `switch` statement, `if` and `if-else` for input validation (division by zero, menu choice), relational operators (`==`), logical thinking.

This task forces you to integrate all the fundamental concepts you've learned so far into a single, functional application. Good luck

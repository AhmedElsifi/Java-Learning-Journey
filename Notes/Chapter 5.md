# 📘 Java Learning Journey

### Chapter 5 - Loops

---

✍️ **Prepared by:** Ahmed Elsifi

<div style="page-break-after: always;"></div>

## 📘 Introduction to Loops

Loops are used to **execute a block of code repeatedly**. They help avoid repetitive code and make programs efficient and readable.

---

## 🔁 Types of Loops in Java

### 1. `while` Loop

- **Checks condition first**, then executes the body.
- Use when the number of iterations is **not known in advance**.

**Syntax:**

```java
while (condition) {
    // body
}
```

### 2. `do-while` Loop

- **Executes the body first**, then checks the condition.
- **Guaranteed to run at least once**.

**Syntax:**

```java
do {
    // body
} while (condition);
```

### 3. `for` Loop

- Used when the number of iterations **is known**.
- Combines **initialization**, **condition**, and **increment/decrement** in one line.

**Syntax:**

```java
for (initialization; condition; update) {
    // body
}
```

---

<div style="page-break-after: always;"></div>

## 🔄 `while` vs `do-while`

| Feature         | `while` Loop       | `do-while` Loop  |
| --------------- | ------------------ | ---------------- |
| Condition Check | Before execution   | After execution  |
| Minimum Runs    | 0                  | 1                |
| Use Case        | Unknown iterations | At least one run |

---

## ⚙️ Loop Control Statements

### 1. `break`

- **Exits the loop immediately**.
- Used to terminate early when a condition is met.

**Example:**

```java
while (true) {
    if (condition) break;
}
```

### 2. `continue`

- **Skips the rest of the current iteration** and moves to the next.
- Useful for skipping specific values.

**Example:**

```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) continue;
    System.out.println(i); // prints only odd numbers
}
```

---

## 🎯 Other Loop Concepts

### Sentinel Value

- A special value used to **terminate input** in a loop.
- Example: `0` to end a number input sequence.

<div style="page-break-after: always;"></div>

### Input/Output Redirection

- **Input redirection**: Read from a file instead of the keyboard:  
  `java Program < input.txt`
- **Output redirection**: Write output to a file:  
  `java Program > output.txt`

### Nested Loops

- A loop inside another loop.
- Commonly used for multi-dimensional data (e.g., matrices).

**Example:**

```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.println(i + ", " + j);
    }
}
```

---

## ⚠️ Common Errors & Tips

- **Infinite Loop**: Condition never becomes false.
- **Off-by-One Error**: Loop runs one time too many or too few.
- **Floating-Point Precision**: Avoid using `float`/`double` in loop conditions due to rounding errors.
- **Semicolon After Loop Header**:  
  `for (int i = 0; i < 10; i++);` → body is empty!

---

## 🧠 When to Use Which Loop

| Loop Type          | When to Use                        |
| ------------------ | ---------------------------------- |
| `while`            | Number of iterations unknown       |
| `do-while`         | Must execute at least once         |
| `for`              | Number of iterations known         |
| `break`/`continue` | To exit early or skip an iteration |

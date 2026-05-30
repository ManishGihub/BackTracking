# BackTracking

A collection of Java programs that demonstrate the power of the **Backtracking Algorithm** through classic recursion-based problems.

## 📖 About

Backtracking is an algorithmic technique used to solve problems incrementally by trying possible solutions and abandoning those that fail to satisfy the problem's constraints.

This repository contains implementations of popular backtracking problems in Java, along with examples and outputs for better understanding.

---

## 📂 Problems Included

### 1. N-Queens Problem

**Problem Statement:**

Place `N` queens on an `N × N` chessboard such that no two queens attack each other.

#### Features

* Generates all possible valid board configurations.
* Uses recursive backtracking to explore placements.
* Stores and returns all valid solutions.

#### Example

For `N = 4`:

```text
Solution 1:
..Q.
Q...
...Q
.Q..

Solution 2:
.Q..
...Q
Q...
..Q.
```

#### Time Complexity

```text
O(N!)
```

---

### 2. String Permutations

**Problem Statement:**

Print all possible permutations of a given string using recursion and backtracking.

#### Example

Input:

```text
abc
```

Output:

```text
abc
acb
bac
bca
cab
cba
```

#### Time Complexity

```text
O(N × N!)
```

---

## 🛠️ Technologies Used

* Java
* Recursion
* Backtracking

---

## 📚 Concepts Covered

* Recursive Problem Solving
* Decision Trees
* State Space Search
* Constraint Satisfaction
* Backtracking Optimization

---

## 🚀 How to Run

### Clone the Repository

```bash
git clone https://github.com/<your-username>/BackTracking.git
```

### Navigate to the Project

```bash
cd BackTracking
```

### Compile Java Files

```bash
javac FileName.java
```

### Run

```bash
java FileName
```

---

## 🎯 Learning Objectives

This repository helps in understanding:

* How backtracking works internally.
* Recursive exploration of solution spaces.
* Constraint checking techniques.
* Classic coding interview problems.

---

## 🤝 Contributions

Contributions, optimizations, and additional backtracking problems are welcome.

Feel free to fork the repository and submit a pull request.

---

## ⭐ Support

If you find this repository useful, consider giving it a **star** to support the project.

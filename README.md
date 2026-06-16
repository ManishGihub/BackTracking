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

### 3. Sudoku Solver

**Problem Statement:**

Solve a partially filled `9 × 9` Sudoku puzzle by filling the empty cells (`.`) while satisfying the following constraints:

1. Each digit `1-9` appears exactly once in every row.
2. Each digit `1-9` appears exactly once in every column.
3. Each digit `1-9` appears exactly once in every `3 × 3` sub-grid.

#### Features

* Solves Sudoku puzzles using recursive backtracking.
* Validates row, column, and sub-grid constraints before placing a number.
* Efficiently explores possible solutions and backtracks when necessary.
* Prints the completed Sudoku board.

#### Example

Input:

```text
5 3 . . 7 . . . .
6 . . 1 9 5 . . .
. 9 8 . . . . 6 .
8 . . . 6 . . . 3
4 . . 8 . 3 . . 1
7 . . . 2 . . . 6
. 6 . . . . 2 8 .
. . . 4 1 9 . . 5
. . . . 8 . . 7 9
```

Output:

```text
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
```

#### Time Complexity

```text
O(9^(n))
```

where `n` is the number of empty cells.

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
* Permutation Generation
* Sudoku Solving Algorithms
* Chessboard Placement Problems

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
* Problem decomposition using recursion.
* Solving classic coding interview problems.
* Optimization through pruning invalid states.

---

## 🤝 Contributions

Contributions, optimizations, and additional backtracking problems are welcome.

Feel free to fork the repository and submit a pull request.

---

## ⭐ Support

If you find this repository useful, consider giving it a **star** to support the project.

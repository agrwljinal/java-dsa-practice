# Count Digits of a Number

## Problem Statement
Given an integer `n`, count the total number of digits present in the number.

### Example
Input:
12345

Output:
5

Input:
7

Output:
1

## Approach
The number is repeatedly divided by 10 until it becomes 0. Each division removes the last digit. A counter is incremented during every iteration to keep track of the number of digits.

Steps:
1. Read the integer `n`.
2. Repeatedly divide `n` by 10.
3. Increment a counter after each division.
4. Stop when `n` becomes 0.
5. Print the counter.

## Time Complexity
O(log₁₀ n)

## Space Complexity
O(1)

## Concepts Used
- Loops
- Integer Division
- Basic Mathematics

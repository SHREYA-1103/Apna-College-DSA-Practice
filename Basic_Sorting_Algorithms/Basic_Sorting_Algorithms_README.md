# Basic Sorting Algorithms

This folder contains Java, Python and C++ implementations of fundamental sorting algorithms including Bubble Sort, Selection Sort, Insertion Sort, and Counting Sort, as covered in the Alpha course of Apna College.

---

## 1. **Bubble Sort**
**Problem:**  
Sort the array using the Bubble Sort algorithm, which repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

**Example:**  
Input: `[5, 3, 8, 4, 2]`  
Output: `[2, 3, 4, 5, 8]`

**Dry Run:**  
Initial array: [5, 3, 8, 4, 2]  
- Pass 1:  
  - 5 > 3 → swap → [3, 5, 8, 4, 2]  
  - 5 < 8 → no swap  
  - 8 > 4 → swap → [3, 5, 4, 8, 2]  
  - 8 > 2 → swap → [3, 5, 4, 2, 8]  
- Pass 2:  
  - 3 < 5 → no swap  
  - 5 > 4 → swap → [3, 4, 5, 2, 8]  
  - 5 > 2 → swap → [3, 4, 2, 5, 8]  
- Pass 3:  
  - 3 < 4 → no swap  
  - 4 > 2 → swap → [3, 2, 4, 5, 8]  
- Pass 4:  
  - 3 > 2 → swap → [2, 3, 4, 5, 8]

**Approach:**  
Repeatedly compare and swap adjacent elements to move the largest unsorted element to its correct position.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

## 2. **Selection Sort**
**Problem:**  
Sort the array using the Selection Sort algorithm by repeatedly selecting the smallest (or largest) element from the unsorted part and moving it to the sorted part.

**Example:**  
Input: `[5, 3, 8, 4, 2]`  
Output: `[2, 3, 4, 5, 8]`

**Dry Run:**  
Initial array: [5, 3, 8, 4, 2]  
- i = 0 → min = 2 → swap with 5 → [2, 3, 8, 4, 5]  
- i = 1 → min = 3 → already in place  
- i = 2 → min = 4 → swap with 8 → [2, 3, 4, 8, 5]  
- i = 3 → min = 5 → swap with 8 → [2, 3, 4, 5, 8]

**Approach:**  
For each position, find the minimum element from the unsorted part and place it at the beginning of that part.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

## 3. **Insertion Sort**
**Problem:**  
Sort the array by inserting each element into its correct position in the sorted part.

**Example:**  
Input: `[5, 3, 8, 4, 2]`  
Output: `[2, 3, 4, 5, 8]`

**Dry Run:**  
Initial array: [5, 3, 8, 4, 2]  
- i=1: 3 < 5 → shift 5 → insert 3 → [3, 5, 8, 4, 2]  
- i=2: 8 > 5 → no shift  
- i=3: 4 < 8 → shift 8, 5 → insert 4 → [3, 4, 5, 8, 2]  
- i=4: 2 < 8, 5, 4, 3 → shift all → insert 2 → [2, 3, 4, 5, 8]

**Approach:**  
Traverse from left to right and keep the left part sorted by shifting elements and inserting the current value in its correct sorted position.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

## 4. **Counting Sort**
**Problem:**  
Sort an array of non-negative integers using the Counting Sort algorithm.

**Example:**  
Input: `[4, 2, 2, 8, 3, 3, 1]`  
Output: `[1, 2, 2, 3, 3, 4, 8]`

**Dry Run:**  
- Find max = 8  
- Create count array of size max+1: [0…8]  
- Count occurrences:  
  - count[1] = 1, count[2] = 2, count[3] = 2, count[4] = 1, count[8] = 1  
- Construct sorted array using count array:
  → [1, 2, 2, 3, 3, 4, 8]

**Approach:**  
Count the occurrences of each element and then construct the sorted array using these counts.

**Time Complexity:** O(n + k)  
**Space Complexity:** O(k)  
*(where `k` is the maximum value in the array)*

---

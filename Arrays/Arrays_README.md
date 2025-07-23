# Arrays

This folder contains Java, Python and C++ implementations of essential array-based problems covered in the Alpha DSA course by Apna College. Each file addresses a specific problem with a well-structured approach, along with time and space complexity analysis.

---

## 1. **Best Time To Buy And Sell Stock**
**Problem:**  
You are given an array `prices[]` where `prices[i]` denotes the price of a stock on day `i`. You are allowed to make one transaction: buy once and sell once. Your goal is to maximize the profit.

**Approach:**  
Traverse the array while keeping track of the minimum price encountered so far and the maximum profit. For each price, calculate the profit if you were to sell at that point, and update the maximum profit accordingly.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 2. **Binary Search**
**Problem:**  
Search for a given target value in a sorted array using the binary search algorithm.

**Approach:**  
Use a two-pointer approach to repeatedly divide the array in half by comparing the middle element to the target. Adjust the search boundaries based on whether the target is smaller or greater than the mid-element.

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)

---

## 3. **Count Pairs In Array**
**Problem:**  
Count the total number of unique pairs (i, j) such that `i < j` in the array.

**Approach:**  
Use nested loops. The outer loop iterates over the first element of the pair, and the inner loop picks the second element. Count all such combinations.

**Time Complexity:** O(n²) or O(1)
**Space Complexity:** O(1)

---

## 4. **Kadanes Algorithm (for Max subarray Sum)**
**Problem:**  
Find the contiguous subarray within a one-dimensional array of numbers which has the largest sum.

**Approach:**  
Kadane’s Algorithm maintains a running maximum sum ending at the current index. If the running sum becomes negative, it is reset to 0. Update the overall maximum sum during traversal.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 5. **Largest Number**
**Problem:**  
Find the largest number in an array.

**Approach:**  
Iterate through the array while maintaining the maximum value seen so far. Update it when a larger value is found.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 6. **Linear Search**
**Problem:**  
Search for a target value in an array using linear search.

**Approach:**  
Traverse the array from the beginning. Compare each element with the target and return the index if a match is found.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 7. **Max SubArray Sum (Bruteforce Approach)**
**Problem:**  
Find the maximum sum of all possible subarrays using brute force.

**Approach:**  
Use three nested loops. The outer two loops pick start and end indices of subarrays, and the innermost loop calculates the sum of each subarray.

**Time Complexity:** O(n³)  
**Space Complexity:** O(1)

---

## 8. **Pairs In Array**
**Problem:**  
Print all possible unique pairs (i, j) such that `i < j`.

**Approach:**  
Use nested loops to generate every pair and print them.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

## 9. **Prefix Sum**
**Problem:**  
Compute prefix sum of an array which allows fast calculation of subarray sums.

**Approach:**  
Create a prefix sum array where `prefix[i] = prefix[i-1] + arr[i]`. This allows you to compute the sum of any subarray in O(1) using: `sum = prefix[end] - prefix[start-1]`.

**Time Complexity:** O(n²)  
**Space Complexity:** O(n)

---

## 10. **Print SubArrays**
**Problem:**  
Print all the subarrays of a given array.

**Approach:**  
Use two nested loops where the outer loop fixes the start index and the inner loop iterates from start to end, printing each subarray.

**Time Complexity:** O(n³)  
**Space Complexity:** O(1)

---

## 11. **Reverse An Array**
**Problem:**  
Reverse the given array in place.

**Approach:**  
Swap elements from both ends moving toward the center using two pointers.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 12. **Smallest Number**
**Problem:**  
Find the smallest number in the array.

**Approach:**  
Iterate through the array, keeping track of the minimum value seen so far.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 13. **Subarray Sum**
**Problem:**  
Print the sum of all possible subarrays.

**Approach:**  
Use two loops to fix the subarray start and end. Calculate and print the sum of each subarray.

**Time Complexity:** O(n³)  
**Space Complexity:** O(1)

---

## 14. **Trapping Rainwater**
**Problem:**  
Given an elevation map, compute how much water it can trap after raining.

**Approach:**  
Use two auxiliary arrays to store the max height to the left and right of each element. The trapped water at index `i` is `min(left[i], right[i]) - height[i]`.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

# Arrays

This folder contains Java, Python and C++ implementations of essential array-based problems covered in the Alpha DSA course by Apna College. Each file addresses a specific problem with a well-structured approach, along with time and space complexity analysis.

---

## 1. **Best Time To Buy And Sell Stock**
**Problem:**  
You are given an array `prices[]` where `prices[i]` denotes the price of a stock on day `i`. You are allowed to make one transaction: buy once and sell once. Your goal is to maximize the profit.

**Example:**  
Input: `[7, 1, 5, 3, 6, 4]`  
Output: `5`

**Dry Run:**  
Array = [7, 1, 5, 3, 6, 4]  
- initialize `buyPrice = ∞`, `maxProfit = 0`
- Day 0: price = 7 → `buyPrice = 7`
- Day 1: price = 1 → `buyPrice = 1` (lower)
- Day 2: price = 5 → profit = 5 - 1 = 4 → `maxProfit = 4`
- Day 3: price = 3 → profit = 3 - 1 = 2 → `maxProfit = 4`
- Day 4: price = 6 → profit = 6 - 1 = 5 → `maxProfit = 5`
- Day 5: price = 4 → profit = 4 - 1 = 3 → `maxProfit = 5`

**Approach:**  
Traverse the array while keeping track of the minimum price encountered so far and the maximum profit. For each price, calculate the profit if you were to sell at that point, and update the maximum profit accordingly.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 2. **Binary Search**
**Problem:**  
Search for a given target value in a sorted array using the binary search algorithm.

**Example:**  
Input: [1, 3, 5, 7, 9], key = 5  
Output: 2

**Dry Run:**  
- low = 0, high = 4  
- mid = 2 → arr[2] = 5  
- 5 == 5 → return 2

**Approach:**  
Use a two-pointer approach to repeatedly divide the array in half by comparing the middle element to the target. Adjust the search boundaries based on whether the target is smaller or greater than the mid-element.

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)

---

## 3. **Count Pairs In Array**
**Problem:**  
Count the total number of unique pairs (i, j) such that `i < j` in the array.

**Example:**  
Input: `[1, 1, 1, 1]`  
Output: `6`

**Dry Run:**  
Array = [1, 1, 1, 1]  
- Initialize `count = 0`, map = {}
- i=0: map[1]=0 → count=0 → map[1]=1  
- i=1: map[1]=1 → count=1 → map[1]=2  
- i=2: map[1]=2 → count=3 → map[1]=3  
- i=3: map[1]=3 → count=6 → map[1]=4

**Approach:**  
Use nested loops. The outer loop iterates over the first element of the pair, and the inner loop picks the second element. Count all such combinations.

**Time Complexity:** O(n²) or O(1)
**Space Complexity:** O(1)

---

## 4. **Kadanes Algorithm (for Max subarray Sum)**
**Problem:**  
Find the contiguous subarray within a one-dimensional array of numbers which has the largest sum.

**Example:**  
Input: `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`  
Output: `6`

**Dry Run:**  
- Initialize `maxSum = -2`, `currentSum = -2`  
- Compare with 1 → `currentSum = max(1, -2+1) = 1`, `maxSum = 1`  
- -3 → `currentSum = -2`, `maxSum = 1`  
- 4 → `currentSum = 4`, `maxSum = 4`  
- -1 → `currentSum = 3`, `maxSum = 4`  
- 2 → `currentSum = 5`, `maxSum = 5`  
- 1 → `currentSum = 6`, `maxSum = 6`  
- -5 → `currentSum = 1`, `maxSum = 6`  
- 4 → `currentSum = 5`, `maxSum = 6`

**Approach:**  
Kadane’s Algorithm maintains a running maximum sum ending at the current index. If the running sum becomes negative, it is reset to 0. Update the overall maximum sum during traversal.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 5. **Largest Number**
**Problem:**  
Find the largest number in an array.

**Example:**  
Input: [5, 9, 2, 4, 11]  
Output: 11

**Dry Run:**  
- Initialize `max = -inf`  
- Compare with 9 → update `max = 9`  
- Compare with 2 → no change  
- Compare with 4 → no change  
- Compare with 11 → update `max = 11`

**Approach:**  
Iterate through the array while maintaining the maximum value seen so far. Update it when a larger value is found.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 6. **Linear Search**
**Problem:**  
Search for a target value in an array using linear search.

**Example:**  
Input: [4, 2, 6, 1], key = 6  
Output: 2

**Dry Run:**  
- Check 4 → no match  
- Check 2 → no match  
- Check 6 → match found at index 2 → return 2

**Approach:**  
Traverse the array from the beginning. Compare each element with the target and return the index if a match is found.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 7. **Max SubArray Sum (Bruteforce Approach)**
**Problem:**  
Find the maximum sum of all possible subarrays using brute force.

**Example:**  
Input: `[1, -2, 6, -1, 3]`  
Output: `8`

**Dry Run:**  
- Loop through all subarrays  
- `[1]` → sum = 1 → `max = 1`  
- `[1, -2]` → sum = -1  
- `[1, -2, 6]` → sum = 5  
- `[1, -2, 6, -1]` → sum = 4  
- `[1, -2, 6, -1, 3]` → sum = 7  
- `[-2]` → sum = -2  
- `[-2, 6]` → sum = 4  
- `[-2, 6, -1]` → sum = 3  
- `[-2, 6, -1, 3]` → sum = 6  
- `[6]` → sum = 6  
- `[6, -1]` → sum = 5  
- `[6, -1, 3]` → sum = 8 → update `max = 8`  
- `[-1, 3]` → sum = 2  
- `[3]` → sum = 3

**Approach:**  
Use three nested loops. The outer two loops pick start and end indices of subarrays, and the innermost loop calculates the sum of each subarray.

**Time Complexity:** O(n³)  
**Space Complexity:** O(1)

---

## 8. **Pairs In Array**
**Problem:**  
Print all possible unique pairs (i, j) such that `i < j`.

**Example:**  
Input: [1, 2, 3]  
Output: (1,2), (1,3), (2,3)

**Dry Run:**  
- i=0: j=1 → (1,2), j=2 → (1,3)  
- i=1: j=2 → (2,3)

**Approach:**  
Use nested loops to generate every pair and print them.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

## 9. **Prefix Sum**
**Problem:**  
Compute prefix sum of an array which allows fast calculation of subarray sums.

**Example:**  
Input: `[1, -2, 6, -1, 3]`  
Output: `8`

**Dry Run:**  
- Compute prefix: `[1, -1, 5, 4, 7]`  
- For i = 0 to 4:  
  - j = 0 → sum = prefix[0] = 1 → `max = 1`  
  - j = 1 → sum = prefix[1] = -1  
  - j = 2 → sum = prefix[2] = 5  
  - j = 3 → sum = prefix[3] = 4  
  - j = 4 → sum = prefix[4] = 7  
- For i = 1 to 4:  
  - j = 1 → sum = prefix[1] - prefix[0] = -2  
  - j = 2 → sum = 6 - 1 = 5  
  - j = 3 → sum = 5 - 1 = 4  
  - j = 4 → sum = 7 - 1 = 6  
- For i = 2 to 4:  
  - j = 2 → sum = prefix[2] - prefix[1] = 6 - (-1) = 7  
  - j = 3 → sum = prefix[3] - prefix[1] = 4 - (-1) = 5  
  - j = 4 → sum = 7 - (-1) = 8 → update `max = 8`

**Approach:**  
Create a prefix sum array where `prefix[i] = prefix[i-1] + arr[i]`. This allows you to compute the sum of any subarray in O(1) using: `sum = prefix[end] - prefix[start-1]`.

**Time Complexity:** O(n²)  
**Space Complexity:** O(n)

---

## 10. **Print SubArrays**
**Problem:**  
Print all the subarrays of a given array.

**Example:**  
Input: [1, 2, 3]  
Output:  
(1), (1,2), (1,2,3),  
(2), (2,3),  
(3)

**Dry Run:**  
- start=0: end=0 → [1], end=1 → [1,2], end=2 → [1,2,3]  
- start=1: end=1 → [2], end=2 → [2,3]  
- start=2: end=2 → [3]

**Approach:**  
Use two nested loops where the outer loop fixes the start index and the inner loop iterates from start to end, printing each subarray.

**Time Complexity:** O(n³)  
**Space Complexity:** O(1)

---

## 11. **Reverse An Array**
**Problem:**  
Reverse the given array in place.

**Example:**  
Input: [1, 2, 3, 4]  
Output: [4, 3, 2, 1]

**Dry Run:**  
- Swap arr[0] and arr[3] → [4, 2, 3, 1]  
- Swap arr[1] and arr[2] → [4, 3, 2, 1]

**Approach:**  
Swap elements from both ends moving toward the center using two pointers.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 12. **Smallest Number**
**Problem:**  
Find the smallest number in the array.

**Example:**  
Input: `[5, 9, 2, 4, 11]`  
Output: `2`

**Dry Run:**  
- Initialize `min = ∞`  
- Compare with 5 → `min = 5`  
- Compare with 9 → no change  
- Compare with 2 → update `min = 2`  
- Compare with 4 → no change  
- Compare with 11 → no change

**Approach:**  
Iterate through the array, keeping track of the minimum value seen so far.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 13. **Subarray Sum**
**Problem:**  
Print the sum of all possible subarrays.

**Example:**  
Input: `[1, 2, 3]`  
Output:  
1  
3  
6  
2  
5  
3

**Dry Run:**  
Array = [1, 2, 3]  
- i=0  
  - j=0 → sum = 1  
  - j=1 → sum = 1+2 = 3  
  - j=2 → sum = 1+2+3 = 6  
- i=1  
  - j=1 → sum = 2  
  - j=2 → sum = 2+3 = 5  
- i=2  
  - j=2 → sum = 3

**Approach:**  
Use two loops to fix the subarray start and end. Calculate and print the sum of each subarray.

**Time Complexity:** O(n³)  
**Space Complexity:** O(1)

---

## 14. **Trapping Rainwater**
**Problem:**  
Given an elevation map, compute how much water it can trap after raining.

**Example:**  
Input: `[4, 2, 0, 6, 3, 2, 5]`  
Output: `9`

**Dry Run:**
`height = [4, 2, 0, 6, 3, 2, 5]`  
- `leftMax = [4, 4, 4, 6, 6, 6, 6]`  
- `rightMax = [6, 6, 6, 6, 5, 5, 5]`

Water trapped at each index:  
- i=0 → min(4,6) - 4 = 0  
- i=1 → min(4,6) - 2 = 2  
- i=2 → min(4,6) - 0 = 4  
- i=3 → min(6,6) - 6 = 0  
- i=4 → min(6,5) - 3 = 2  
- i=5 → min(6,5) - 2 = 3  
- i=6 → min(6,5) - 5 = 0  
- Total trapped water = 2 + 4 + 2 + 3 = 9

**Approach:**  
Use two auxiliary arrays to store the max height to the left and right of each element. The trapped water at index `i` is `min(left[i], right[i]) - height[i]`.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

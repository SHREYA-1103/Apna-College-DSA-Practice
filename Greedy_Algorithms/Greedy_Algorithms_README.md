# Greedy Algorithms

This folder contains Java, Python, and C++ implementations of classic Greedy Algorithm problems covered in the Alpha DSA course by Apna College.

---

## 1. **Activity Selection**
**Problem:**  
Given `n` activities with their start and end times, select the maximum number of activities that can be performed by a single person assuming that a person can only work on a single activity at a time.

**Example:**  
Start = `[10, 12, 20]`  
End = `[20, 25, 30]`  
**Output:** `2`

**Dry Run:**  
- Pair activities: `[(10, 20), (12, 25), (20, 30)]`
- Sort by end time → already sorted
- Select `(10, 20)` → `lastEnd = 20`
- Next: `(12, 25)` → `12 < 20` → skip
- Next: `(20, 30)` → `20 ≥ 20` → select → count = 2

**Approach:**  
Sort activities by end time. Select the next activity only if its start time ≥ end time of the last selected activity.

**Time Complexity:** `O(n log n)`  
**Space Complexity:** `O(1)`

---

## 2. **Chocola Problem**
**Problem:**  
Given an `m x n` chocolate and costs for cutting it horizontally and vertically, minimize the cost to break the chocolate into 1x1 pieces.

**Example:**  
Horizontal = `[2, 1]`  
Vertical = `[3, 1]`  
**Output:** `12`

**Dry Run:**  
- Sort: Horizontal = `[2, 1]`, Vertical = `[3, 1]`
- Step 1: 3 (vertical) → `3 × 1 = 3`  
- Step 2: 2 (horizontal) → `2 × 2 = 4`  
- Step 3: 1 (vertical) → `1 × 2 = 2`  
- Step 4: 1 (horizontal) → `1 × 3 = 3`  
- **Total cost = 3 + 4 + 2 + 3 = 12**

**Approach:**  
Sort costs descending. Always cut with the highest cost first. Multiply by number of segments in the other direction.

**Time Complexity:** `O(m log m + n log n)`  
**Space Complexity:** `O(1)`

---

## 3. **Fractional Knapsack**
**Problem:**  
Given `n` items with values and weights, and a knapsack capacity `W`, find the maximum value. You can take fractional parts of items.

**Example:**  
Values = `[60, 100, 120]`  
Weights = `[10, 20, 30]`, `W = 50`  
**Output:** `240.0`

**Dry Run:**  
- Value/weight ratios = `[6, 5, 4]`
- Sorted order: Item1, Item2, Item3  
- Take Item1: Full → `value = 60`, remaining = 40  
- Take Item2: Full → `value = 100`, remaining = 20  
- Take 2/3 of Item3 → `value = 120 * (20/30) = 80`  
- **Total value = 60 + 100 + 80 = 240**

**Approach:**  
Sort items by value/weight ratio. Take full items until capacity is exhausted, then take a fraction.

**Time Complexity:** `O(n log n)`  
**Space Complexity:** `O(1)`

---

## 4. **Indian Coins**
**Problem:**  
Given coin denominations and an amount, return the minimum number of coins needed to make that amount.

**Example:**  
Coins = `[1, 2, 5, 10, 20, 50, 100, 500, 2000]`  
Amount = `590`  
**Output:** `[500, 50, 20, 20]`

**Dry Run:**  
- 590 - 500 = 90  
- 90 - 50 = 40  
- 40 - 20 = 20  
- 20 - 20 = 0  
- **Coins used: [500, 50, 20, 20]**

**Approach:**  
Sort coins descending. At each step, pick the largest denomination ≤ remaining amount.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 5. **Job Sequencing**
**Problem:**  
Given jobs with deadlines and profits, schedule them to maximize total profit.

**Example:**  
Jobs = `[(J1, 2, 100), (J2, 1, 19), (J3, 2, 27), (J4, 1, 25), (J5, 3, 15)]`  
**Output:** `142`

**Dry Run:**  
- Sort by profit: `J1(100), J3(27), J4(25), J2(19), J5(15)`  
- Slots: `[_, _, _]`  
- J1 → slot 2 → placed  
- J3 → slot 1 → placed  
- J4, J2 → no free slots  
- J5 → slot 3 → placed  
- **Jobs taken: J1, J3, J5 → profit = 100 + 27 + 15 = 142**

**Approach:**  
Sort jobs by descending profit. Schedule each job in the latest possible free slot ≤ its deadline.

**Time Complexity:** `O(n²)`  
**Space Complexity:** `O(n)`

---

## 6. **Max Length Chain of Pairs**
**Problem:**  
Find max length chain from pairs where `(a, b)` is followed by `(c, d)` only if `b < c`.

**Example:**  
Pairs = `[(5, 24), (15, 25), (27, 40), (50, 60)]`  
**Output:** `3`

**Dry Run:**  
- Sorted by end time: same  
- (5,24) → select → `lastEnd = 24`  
- (15,25) → 15 < 24 → skip  
- (27,40) → 27 > 24 → select → `lastEnd = 40`  
- (50,60) → 50 > 40 → select  
- **Chain length = 3**

**Approach:**  
Sort by second element. Select next pair if start > end of previous.

**Time Complexity:** `O(n log n)`  
**Space Complexity:** `O(1)`

---

## 7. **Min Absolute Difference in Pairs**
**Problem:**  
Given two equal-length arrays, pair elements to minimize total absolute difference.

**Example:**  
A = `[4, 1, 8, 7]`, B = `[2, 3, 6, 5]`  
**Output:** `6`

**Dry Run:**  
- Sort A → `[1, 4, 7, 8]`  
- Sort B → `[2, 3, 5, 6]`  
- |1-2| = 1  
- |4-3| = 1  
- |7-5| = 2  
- |8-6| = 2  
- **Total = 1 + 1 + 2 + 2 = 6**

**Approach:**  
Sort both arrays and pair elements at same index.

**Time Complexity:** `O(n log n)`  
**Space Complexity:** `O(1)`

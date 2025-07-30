# Linked List 

This folder contains Java implementations of key Linked List problems commonly practiced in the Alpha DSA course by Apna College. 

---

## 1. **Check if Linked List is Palindrome**
**Problem:**  
Determine whether the given singly linked list is a palindrome.

**Example:**  
Input: `1 → 2 → 2 → 1`  
**Output:** `true`

**Dry Run:**  
- Step 1: Find mid → `2`  
- Step 2: Reverse second half → `1 → 2`  
- Step 3: Compare halves  
  - First half: `1 → 2`  
  - Reversed second half: `1 → 2` → match  
- Return `true`

**Approach:**  
Use slow and fast pointers to find the middle. Reverse the second half and compare both halves.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 2. **Detecting Cycle in Linked List**
**Problem:**  
Detect if a cycle exists in the linked list.

**Example:**  
Input: `1 → 2 → 3 → 4 → 2 (cycle)`  
**Output:** `true`

**Dry Run:**  
- Slow at `1`, Fast at `1`  
- Move: Slow → `2`, Fast → `3`  
- Move: Slow → `3`, Fast → `2`  
- Move: Slow → `4`, Fast → `4` → pointers meet  
- Cycle exists

**Approach:**  
Use Floyd’s cycle detection algorithm (Tortoise and Hare method).

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 3. **Find and Remove Nth Node From End**
**Problem:**  
Remove the Nth node from the end of the linked list.

**Example:**  
Input: `1 → 2 → 3 → 4 → 5`, `n = 2`  
**Output:** `1 → 2 → 3 → 5`

**Dry Run:**  
- Move fast `n=2` steps ahead → at `3`  
- Move both fast and slow  
  - Fast: `4`, Slow: `2`  
  - Fast: `5`, Slow: `3`  
- Remove node after slow (`4`)  
- Result: `1 → 2 → 3 → 5`

**Approach:**  
Use two pointers. First pointer moves `n` steps ahead, then move both until fast reaches end.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 4. **Iterative Search in Linked List**
**Problem:**  
Search for a key in the linked list using iteration.

**Example:**  
Input: `1 → 4 → 5`, key = `4`  
**Output:** `true`

**Dry Run:**  
- Start at head → `1` → no match  
- Move to `4` → match → return true

**Approach:**  
Iterate through the list and check each node’s value.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 5. **Merge Sort on Linked List**
**Problem:**  
Sort a linked list using merge sort.

**Example:**  
Input: `4 → 2 → 1 → 3`  
**Output:** `1 → 2 → 3 → 4`

**Dry Run:**  
- Step 1: Split → `4 → 2` and `1 → 3`  
- Step 2: Sort both halves recursively → `2 → 4`, `1 → 3`  
- Step 3: Merge → `1 → 2 → 3 → 4`

**Approach:**  
Use divide and conquer. Find mid, recursively sort halves, and merge.

**Time Complexity:** `O(n log n)`  
**Space Complexity:** `O(log n)` (recursion stack)

---

## 6. **Recursive Search in Linked List**
**Problem:**  
Search a key in the linked list using recursion.

**Example:**  
Input: `1 → 2 → 3`, key = `3`  
**Output:** `true`

**Dry Run:**  
- Call on `1` → no match → recurse  
- Call on `2` → no match → recurse  
- Call on `3` → match → return true

**Approach:**  
Base case: head is null or matches key. Recur for next node.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)` (stack)

---

## 7. **Removing Cycle from Linked List**
**Problem:**  
Remove a cycle if present in the linked list.

**Example:**  
Input: `1 → 2 → 3 → 4 → 2 (cycle)`  
**Output:** `1 → 2 → 3 → 4 → null`

**Dry Run:**  
- Detect cycle with Floyd’s algorithm  
- Set one pointer to head  
- Move both until next pointers match  
- Set previous node’s next to `null`

**Approach:**  
Use Floyd’s algorithm to detect and then remove the cycle.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 8. **Reverse Doubly Linked List**
**Problem:**  
Reverse a doubly linked list.

**Example:**  
Input: `1 ⇄ 2 ⇄ 3`  
**Output:** `3 ⇄ 2 ⇄ 1`

**Dry Run:**  
- At `1`: swap prev and next → move to prev (`2`)  
- At `2`: swap → move to prev (`3`)  
- At `3`: swap → prev is null → head = `3`

**Approach:**  
Traverse and swap `prev` and `next` for each node.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 9. **Reverse Singly Linked List**
**Problem:**  
Reverse a singly linked list.

**Example:**  
Input: `1 → 2 → 3`  
**Output:** `3 → 2 → 1`

**Dry Run:**  
- prev = null, curr = `1`  
- Step 1: `next = 2`, `1.next = null`, prev = `1`  
- Step 2: `next = 3`, `2.next = 1`, prev = `2`  
- Step 3: `next = null`, `3.next = 2`, prev = `3`  
- Return head = `3`

**Approach:**  
Use iteration to reverse pointers as you traverse.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 10. **Self Implemented Linked List**
**Problem:**  
Create a self-designed linked list class with basic operations.

**Example Operations:**  
- Insert at head  
- Insert at tail  
- Delete node  
- Print list

**Approach:**  
Manually implement the Node class and supporting methods.

**Time Complexity:**  
- Insertion: `O(1)`  
- Deletion/Search: `O(n)`

**Space Complexity:** `O(n)`

---

## 11. **ZigZag Linked List**
**Problem:**  
Rearrange a linked list in a zigzag manner: `L0 → Ln → L1 → Ln-1 → …`

**Example:**  
Input: `1 → 2 → 3 → 4 → 5`  
**Output:** `1 → 5 → 2 → 4 → 3`

**Dry Run:**  
- Step 1: Find mid → `3`  
- Step 2: Reverse second half → `5 → 4`  
- Step 3: Merge →  
  - `1 → 5`  
  - `2 → 4`  
  - `3`

**Approach:**  
Find middle, reverse second half, and merge both halves alternately.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

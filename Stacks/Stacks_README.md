# Stacks

This folder contains Java, Python and C++ implementations of classic Stack problems as covered in the Alpha DSA course by Apna College.

---

## 1. **Duplicate Parentheses**
**Problem:**  
Check whether the given expression contains duplicate parentheses.

**Example:**  
Input: `"((a+b)+(c))"`  
**Output:** `false`

**Dry Run:**  
- Encounter `)`  
- Count and pop until `(`
- Check stack top: if it's `(` and `count==0` → duplicate exists  
- Otherwise no duplicate

**Approach:**  
Use a stack to check characters. If a closing parenthesis has another opening right before, it’s duplicate.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

## 2. **Max Area In Histogram**
**Problem:**  
Find the area of the largest rectangle in the histogram.

**Example:**  
Input: `[2,1,5,6,2,3]`  
**Output:** `10`

**Dry Run:**  
- Use stack to find NSL and NSR 
- NSL[] = `{-1, -1, 1, 2, 1, 4}`
- NSR[] = `{1, 6, 4, 4, 6, 6}` 
- width = NSR[i] - NSL[i] - 1 = `{1, 6, 2, 1, 4, 1}`
- Calculate area using height × width = `{2, 6, 10, 6, 8, 3}` between boundaries and track max
- `max = 10`

**Approach:**  
Find nearest smaller to left/right using stacks, then compute max area.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

## 3. **Next Greater Element**
**Problem:**  
Find the next greater element for every element in the array.

**Example:**  
Input: `[4, 5, 2, 25]`  
**Output:** `[5, 25, 25, -1]`

**Dry Run:**  
- Use stack from right  
- Store elements and update NGR using top of stack - remove smaller elements to get the nearest greater element

**Approach:**  
Traverse array from end, use stack to track potential NGEs.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

## 4. **Push At Bottom**
**Problem:**  
Push an element at the bottom of a stack using recursion.

**Example:**  
Input: `stack = [1, 2, 3]`, `data = 0`  
**Output:** `[0, 1, 2, 3]`

**Dry Run:**  
- Pop all elements  
- Insert `0`  
- Push back all popped elements

**Approach:**  
Use recursion to reach bottom and then insert the element.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)` (recursion stack)

---

## 5. **Reverse Stack**
**Problem:**  
Reverse a stack using recursion.

**Example:**  
Input: `[1, 2, 3]`  
**Output:** `[3, 2, 1]`

**Dry Run:**  
- Pop all elements  
- Insert each at bottom recursively

**Approach:**  
Use recursion to pop elements and reinsert them at bottom.

**Time Complexity:** `O(n^2)`  
**Space Complexity:** `O(n)`

---

## 6. **Reverse String Using Stack**
**Problem:**  
Reverse a string using stack.

**Example:**  
Input: `"hello"`  
**Output:** `"olleh"`

**Dry Run:**  
- Push all characters  
- Pop and append to form a new string

**Approach:**  
Use a stack to reverse characters by LIFO order.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

## 7. **Stack Using ArrayList**
**Problem:**  
Implement a stack using Java’s ArrayList.

**Example Operations:**  
- Push  
- Pop  
- Peek  
- isEmpty

**Approach:**  
Wrap ArrayList and define push/pop/peek manually.

**Time Complexity:**  
- All Operations: `O(1)`

**Space Complexity:** `O(n)`

---

## 8. **Stack Using JCF**
**Problem:**  
Use Java’s in-built `Stack` class to perform stack operations.

**Example Operations:**  
- `push()`, `pop()`, `peek()`, `isEmpty()`

**Approach:**  
Use `java.util.Stack` directly for operations.

**Time Complexity:**  
- All operations: `O(1)`

**Space Complexity:** `O(n)`

---

## 9. **Stack Using LinkedList**
**Problem:**  
Implement a stack using Java’s `LinkedList`.

**Example Operations:**  
- Push  
- Pop  
- Peek
- isEmpty

**Approach:**  
Use LinkedList's built-in methods (`addFirst`, `removeFirst`, `getFirst`).

**Time Complexity:**  
- All Operations: `O(1)`

**Space Complexity:** `O(n)`

---

## 10. **Stock Span Problem**
**Problem:**  
Find the stock span for each day (days before it with a lower stock price).

**Example:**  
Input: `[100, 80, 60, 70, 60, 75, 85]`  
**Output:** `[1, 1, 1, 2, 1, 4, 6]`

**Dry Run:**  
- For each day, use stack to find index of previous greater  
- Span = current index - previous greater index

**Approach:**  
Use stack to track next greater on the left.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

## 11. **Valid Parentheses**
**Problem:**  
Check if parentheses in a string are valid.

**Example:**  
Input: `"({[]})"`  
**Output:** `true`

**Dry Run:**  
- Push opening brackets  
- Match closing with top of stack

**Approach:**  
Use stack to validate correct matching of brackets.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

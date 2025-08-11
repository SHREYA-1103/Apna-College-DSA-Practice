# Queues

This folder contains Java implementations of classic Queue problems as covered in the Alpha DSA course by Apna College.

---

## 1. **Circular Queue Using Arrays**
**Problem:**  
Implement a circular queue using arrays.

**Example:**  
Operations: `enqueue(1)`, `enqueue(2)`, `enqueue(3)`, `dequeue()`, `enqueue(4)`

**Dry Run:**  
- Initial: `front = -1, rear = -1`  
- `enqueue(1)` → `front = 0, rear = 0` → `[1, _, _]`  
- `enqueue(2)` → `rear = 1` → `[1, 2, _]`  
- `enqueue(3)` → `rear = 2` → `[1, 2, 3]`  
- `dequeue()` → remove `1`, `front = 1` → `[_, 2, 3]`  
- `enqueue(4)` → `rear = 0` (wrap around) → `[4, 2, 3]`

**Approach:**  
Use a fixed-size array with modular arithmetic:  
- `rear = (rear + 1) % size` for enqueue  
- `front = (front + 1) % size` for dequeue  
- Handle full/empty conditions separately.

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(n)`

---

## 2. **Deque Using JCF**
**Problem:**  
Use Java’s `Deque` interface to perform double-ended queue operations.

**Example:**  
Operations: `addFirst(1)`, `addLast(2)`, `removeFirst()`, `addFirst(3)`

**Dry Run:**  
- Start: `[]`  
- `addFirst(1)` → `[1]`  
- `addLast(2)` → `[1, 2]`  
- `removeFirst()` → `[2]`  
- `addFirst(3)` → `[3, 2]`

**Approach:**  
Use `java.util.ArrayDeque` which allows O(1) insertion/removal from both ends.  
- `addFirst()`/`removeFirst()` for front operations  
- `addLast()`/`removeLast()` for rear operations.

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(n)`

---

## 3. **First Non-Repeating Letter**
**Problem:**  
Given a stream of characters, print the first non-repeating character at every insertion.

**Example:**  
Input: `"aabc"`  
**Output:** `a -1 b b`

**Dry Run:**  
- Read `a`: queue = [`a`], freq[`a`] = 1 → first non-repeating = `a`  
- Read `a`: queue = [`a`, `a`], freq[`a`] = 2 → remove `a`, queue empty → `-1`  
- Read `b`: queue = [`b`], freq[`b`] = 1 → `b`  
- Read `c`: queue = [`b`, `c`], freq[`b`] = 1 → `b`

**Approach:**  
Maintain a queue of potential non-repeating characters and a frequency map.  
- On reading a char, increment frequency and enqueue  
- While queue front is repeating, dequeue.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)` (fixed char set)

---

## 4. **Implement Queue Using Deque**
**Problem:**  
Implement a queue using deque.

**Example:**  
Operations: `enqueue(1)`, `enqueue(2)`, `dequeue()`

**Dry Run:**  
- Start: `[]`  
- `enqueue(1)` → addLast → `[1]`  
- `enqueue(2)` → addLast → `[1, 2]`  
- `dequeue()` → removeFirst → `[2]`

**Approach:**  
Use `Deque` methods:  
- Enqueue → `addLast()`  
- Dequeue → `removeFirst()`  
- Peek → `getFirst()`

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(n)`

---

## 5. **Implement Stack Using Deque**
**Problem:**  
Implement a stack using deque.

**Example:**  
Operations: `push(1)`, `push(2)`, `pop()`

**Dry Run:**  
- Start: `[]`  
- `push(1)` → addLast → `[1]`  
- `push(2)` → addLast → `[1, 2]`  
- `pop()` → removeLast → `[1]`

**Approach:**  
Use deque as stack:  
- Push → `addLast()`  
- Pop → `removeLast()`  
- Peek → `getLast()`

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(n)`

---

## 6. **Interleave Two Halves Of Queue**
**Problem:**  
Given a queue with even number of integers, interleave its two halves.

**Example:**  
Input: `[1, 2, 3, 4]`  
Output: `[1, 3, 2, 4]`

**Dry Run:**  
- Original queue: `[1, 2, 3, 4]`  
- Move first half to temp queue: temp = `[1, 2]`, main = `[3, 4]`  
- Interleave:  
  - Dequeue from temp → `1`, enqueue to main → `[3, 4, 1]`  
  - Dequeue from main → `3`, enqueue → `[4, 1, 3]`  
  - Repeat until interleaved → `[1, 3, 2, 4]`

**Approach:**  
Split queue into two halves, then alternately enqueue elements from both halves.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

## 7. **Queue Reversal**
**Problem:**  
Reverse a queue.

**Example:**  
Input: `[1, 2, 3]`  
Output: `[3, 2, 1]`

**Dry Run:**  
- Dequeue all elements recursively → remove `1`, call reverse on `[2, 3]`  
- Remove `2`, call reverse on `[3]`  
- Remove `3`, call reverse on `[]` (base case)  
- Enqueue `3`, enqueue `2`, enqueue `1`

**Approach:**  
Use recursion or stack to reverse queue.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)` (call stack)

---

## 8. **Queue Using Arrays**
**Problem:**  
Implement a queue using arrays.

**Example:**  
Operations: `enqueue(1)`, `enqueue(2)`, `dequeue()`

**Dry Run:**  
- Start: `front = 0, rear = -1`  
- `enqueue(1)` → rear = 0 → `[1]`  
- `enqueue(2)` → rear = 1 → `[1, 2]`  
- `dequeue()` → remove from front = 0 → `[_, 2]`, front = 1

**Approach:**  
Use array with front/rear pointers. Shift not required if circular queue used.

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(n)`

---

## 9. **Queue Using JCF**
**Problem:**  
Use Java’s Queue interface.

**Example:**  
Operations: `add(1)`, `add(2)`, `remove()`

**Dry Run:**  
- Start: `[]`  
- `add(1)` → `[1]`  
- `add(2)` → `[1, 2]`  
- `remove()` → `[2]`

**Approach:**  
Use `LinkedList` implementation of `Queue`.

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(n)`

---

## 10. **Queue Using Linked List**
**Problem:**  
Implement a queue using linked list.

**Example:**  
Operations: `enqueue(1)`, `enqueue(2)`, `dequeue()`

**Dry Run:**  
- Start: `head = null, tail = null`  
- Enqueue `1` → head = tail = Node(1)  
- Enqueue `2` → tail.next = Node(2), tail = Node(2)  
- Dequeue → remove head, head = Node(2)

**Approach:**  
Maintain head and tail pointers.

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(n)`

---

## 11. **Queue Using Stack**
**Problem:**  
Implement a queue using two stacks.

**Example:**  
Operations: `enqueue(1)`, `enqueue(2)`, `dequeue()`

**Dry Run:**  
- Enqueue(1) → push to s1 → s1 = [1]  
- Enqueue(2) → push to s1 → s1 = [1, 2]  
- Dequeue → if s2 empty, pop all from s1 to s2 → s1 = [], s2 = [2, 1] → pop from s2 = 1

**Approach:**  
Two stacks: s1 for enqueue, s2 for dequeue.

**Time Complexity:** Amortized O(1)  
**Space Complexity:** `O(n)`

---

## 12. **Stack Using Queue**
**Problem:**  
Implement a stack using a queue.

**Example:**  
Operations: `push(1)`, `push(2)`, `pop()`

**Dry Run:**  
- Push(1) → enqueue to q → `[1]`  
- Push(2) → enqueue to q → `[1, 2]` → rotate → dequeue `1`, enqueue `1` → `[2, 1]`  
- Pop → dequeue front = `2`

**Approach:**  
Push with rotation to maintain LIFO.

**Time Complexity:** Push: O(n), Pop: O(1)  
**Space Complexity:** `O(n)`

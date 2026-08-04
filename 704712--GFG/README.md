# Median in a Row-Wise Sorted Matrix

## Problem Statement

Given a **row-wise sorted** matrix `mat[][]` of size `n × m`, where both the number of rows and columns are **odd**, find and return the **median** of all the elements in the matrix.

> Each row is sorted in non-decreasing order.

---

## Examples

### Example 1

**Input**
```text
mat = [
  [1, 3, 5],
  [2, 6, 9],
  [3, 6, 9]
]
```

**Output**
```text
5
```

**Explanation**

Sorted elements:
```text
[1, 2, 3, 3, 5, 6, 6, 9, 9]
```

Median = **5**

---

### Example 2

**Input**
```text
mat = [
  [2, 4, 9],
  [3, 6, 7],
  [4, 7, 10]
]
```

**Output**
```text
6
```

**Explanation**

Sorted elements:
```text
[2, 3, 4, 4, 6, 7, 7, 9, 10]
```

Median = **6**

---

### Example 3

**Input**
```text
mat = [
  [3],
  [4],
  [8]
]
```

**Output**
```text
4
```

---


   ```

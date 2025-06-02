# LeetCode Practice Project

A Java project structure specifically designed for practicing LeetCode problems.

## Project Structure

```
src/main/java/com/leetcode/
├── arrays/       # Array-related problems
├── strings/      # String manipulation problems
├── linkedlist/   # Linked list problems
├── trees/        # Tree and graph problems
├── dp/           # Dynamic programming problems
├── graph/        # Graph algorithms
├── math/         # Mathematical problems
├── design/       # Design problems
└── utils/        # Utility classes (ListNode, TreeNode, etc.)
```

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven

### Running Tests
```bash
mvn test
```

## How to Add a New Problem

1. Identify the category of the problem (arrays, strings, etc.)
2. Create a new Java class in the appropriate package
3. Implement your solution
4. Create a corresponding test class in the test directory

## Example

### Problem Solution
```java
// src/main/java/com/leetcode/arrays/TwoSum.java
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Your solution here
    }
}
```

### Test
```java
// src/test/java/com/leetcode/arrays/TwoSumTest.java
class TwoSumTest {
    @Test
    void example1() {
        // Your test here
    }
}
```

## Utility Classes

The project includes common data structures used in LeetCode problems:

- `ListNode`: For linked list problems
- `TreeNode`: For binary tree problems

These utility classes include helper methods to convert between arrays and the data structure, making it easier to test your solutions.

## Tips for LeetCode Practice

1. **Understand the problem**: Make sure you understand the constraints and requirements before coding.
2. **Start with a brute force solution**: Get a working solution first, then optimize.
3. **Test with examples**: Use the examples provided in the problem and add your own test cases.
4. **Analyze time and space complexity**: Practice identifying the complexity of your solutions.
5. **Review and refactor**: Look for ways to improve your solution after solving the problem.

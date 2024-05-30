## Description
#  [1. Two Sum](https://leetcode.com/problems/two-sum/description/)

> Given an array of integers, return `indices` of the two numbers such that they add up to a specific target.
>
> You may assume that each input would have `exactly` one solution, and you may not use the same element twice.
>
> ### Example :
> ```
> Given nums = [2, 7, 11, 15], target = 9,
> Because nums[0] + nums[1] = 2 + 7 = 9,
> return [0, 1].
> ```

---

## Solution
### Brute Force Solution: O(N^2)
=== "Python"
    ```python linenums="1"
    --8<-- "Array/two_sum_bruteforce.py"
    ```
=== "Go"
    ```go linenums="1"
    --8<-- "TwoSum/main.go"
    ```

=== "Java"
    ```java linenums="1"
    --8<-- "JavaSolutions/Leetcode/src/Array/TwoSumBruteForce.java"
    ```

### Optimised Solution: O(N)
=== "Python"
    ```python linenums="1"
    --8<-- "Array/two_sum_optimised.py"
    ```

=== "Java"
    ```java linenums="1"
    --8<-- "JavaSolutions/Leetcode/src/Array/TwoSumOptimised.java"
    ```


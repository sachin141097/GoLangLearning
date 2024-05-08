## Description
Given an array Arr of size N, print the second largest distinct element from an array. If the second largest element doesn't exist then return -1.


Example 1:
Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.


Example 2:
Input: 
N = 3
Arr[] = {10, 5, 10}
Output: 5
Explanation: The largest element of 
the array is 10 and the second 
largest element is 5.


## Solution
### Time Complexity: O(2N)
=== "Python"
    ```python linenums="1"
    --8<-- "Array/find_second_largest_in_array.py"
    ```
=== "Go"
    ```go linenums="1"
    --8<-- "SecondLargestBruteForce/main.go"
    ```
### Time Complexity: O(N)
=== "Python"
    ```python linenums="1"
    --8<-- "Array/find_second_largest_optimised.py"
    ```
=== "Go"
    ```go linenums="1"
    --8<-- "SecondLargestInArray/main.go"
    ```
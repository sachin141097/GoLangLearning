## Description
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example:<br>
Input: nums= [0,1,0,3,12]<br>
Output: [1,3,12,0,0]


## Solution
### Brute Force Solution
=== "Python"
    ```python linenums="1"
    --8<-- "Array/move_zeros_to_end.py"
    ```

=== "Go"
    ```go linenums="1"
    --8<-- "MoveZeros/main.go"
    ```

### Optimised Solution
=== "Python"
    ```python linenums="1"
    --8<-- "Array/move_zeros_to_end_optimised.py"
    ```

=== "Go"
    ```go linenums="1"
    --8<-- "MoveZerosOptimised/main.go"
    ```
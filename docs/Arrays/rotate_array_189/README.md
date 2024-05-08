## Description

<p>Given an integer array <code>nums</code>&nbsp;rotate the array to the right by <code>k</code> steps,where <code>k</code> is non-negative.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4,5,6,7], k = 3
<strong>Output:</strong> [5,6,7,1,2,3,4]
<strong>Explanation:</strong>
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
</pre>

## Solution
=== "Python"
    ```python linenums="1"
    --8<-- "Array/right_rotate_array.py"
    ```
=== "Go"
    ```go linenums="1"
    --8<-- "RightRotateArray/main.go"
    ```
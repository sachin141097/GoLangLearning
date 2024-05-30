## Description
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:<br>
Input: nums = [1,1,1], k = 2<br>
Output: 2<br>
<br>
Example 2:<br>
Input: nums = [1,2,3], k = 3<br>
Output: 2
 

Constraints:<br>
1 <= nums.length <= 2 * 10^4<br>
-1000 <= nums[i] <= 1000<br>
-10^7 <= k <= 10^7<br>

## Solution
### Time Complexity: O(N)
=== "Python"
    ```python linenums="1"
    --8<-- "Array/subarray_with_sum_k.py"
    ```
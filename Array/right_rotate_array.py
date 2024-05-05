def right_rotate(arr, rotations):
    """
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

    Example 1:

    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    Example 2:

    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation:
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]

    Args:
        arr (list): Array of integers
        rotations (int): Number of rotations
    """
    n = len(arr)
    rotations = rotations % n
    print(f"Value of rotations is {rotations}")
    temp = []
    for i in range(n - rotations, n):
        temp.append(arr[i])
    # shift the elements to right
    for i in range(n - 1, rotations - 1, -1):
        arr[i] = arr[i - rotations]
    for i in range(0, len(temp)):
        arr[i] = temp[i]


if __name__ == "__main__":
    arr = list(map(int, input("Enter array element separated by space:").split()))
    rotations = int(input(f"Enter the number of rotations"))
    right_rotate(arr, rotations)
    print(f"Value of arr after rotating it {rotations} times is {arr}")

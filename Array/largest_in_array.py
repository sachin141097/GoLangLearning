def find_largest(arr):
    """
    The function finds the largest element from the given array
    """
    largest = arr[0]
    for i in range(1, len(arr)):
        if arr[i] > largest:
            largest = arr[i]
    return largest


if __name__ == "__main__":
    arr = list(map(int, input(f"Enter the array element separated by space:").split()))
    largest = find_largest(arr)
    print(f"The largest element in the array is {largest}")

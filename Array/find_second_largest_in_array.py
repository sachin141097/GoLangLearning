def find_second_largest(arr):
    n = len(arr)
    largest = arr[0]
    second_largest = -1
    # First Pass
    for i in range(0, n):
        if arr[i] > largest:
            largest = arr[i]
    # Second Pass
    for i in range(0, n):
        if arr[i] > second_largest and arr[i] != largest:
            second_largest = arr[i]
    return second_largest


if __name__ == "__main__":
    arr = list(
        map(int, input(f"Enter the array elements separated by space: ").split())
    )
    second_largest = find_second_largest(arr)
    print(f"Value of second largest element in array is {second_largest}")

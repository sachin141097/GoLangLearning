def is_sorted(arr):
    n = len(arr)
    for i in range(0, n - 1):
        if arr[i + 1] < arr[i]:
            return False
    return True


if __name__ == "__main__":
    arr = list(
        map(int, input(f"Enter the array elements separated by space: ").split())
    )
    print(f"Array is sorted {is_sorted(arr)}")

def move_zeros(arr):
    n = len(arr)
    j = -1
    for i in range(0, n):
        # point j to first zero element
        if arr[i] == 0:
            j = i
            break
    # if j remains -1 that means array doesn't have any zero element
    if j != -1:
        for i in range(j + 1, n):
            if arr[i] != 0:
                arr[i], arr[j] = arr[j], arr[i]
                j += 1


if __name__ == "__main__":
    arr = list(
        map(int, input(f"Enter the array elements separated by space: ").split())
    )
    move_zeros(arr)
    print(f"Value of array after moving zeros at the end is {arr}")

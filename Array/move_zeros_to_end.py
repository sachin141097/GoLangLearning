def move_zeros(arr):
    n = len(arr)
    temp = []
    for i in range(n):
        if arr[i] != 0:
            temp.append(arr[i])
    for i in range(0, len(temp)):
        arr[i] = temp[i]
    for i in range(len(temp), n):
        arr[i] = 0


if __name__ == "__main__":
    arr = list(map(int, input(f"Enter array elements separated by space: ").split()))
    move_zeros(arr)
    print(f"Value of arr after moving zeros at the end is {arr}")

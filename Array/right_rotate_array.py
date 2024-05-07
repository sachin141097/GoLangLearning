def right_rotate(arr, rotations):
    n = len(arr)
    rotations = rotations % n
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

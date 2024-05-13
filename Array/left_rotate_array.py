def left_rotate(arr, rotations):
    n = len(arr)
    rotations = rotations % n
    temp = []
    for i in range(0, rotations):
        temp.append(arr[i])
    for i in range(rotations, n):
        arr[i - rotations] = arr[i]
    for i in range(n - rotations, n):
        arr[i] = temp[i - (n - rotations)]


if __name__ == "__main__":
    arr = list(map(int, input(f"Enter array elements separated by space: ").split()))
    rotations = int(input(f"Enter the number of rotations: "))
    left_rotate(arr, rotations)
    print(f"Value of arr after rotating it {rotations} times is {arr}")

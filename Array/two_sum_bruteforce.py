def find_two_sum(arr):
    n = len(arr)
    for i in range(len(arr)):
        for j in range(len(arr)):
            if i == j:
                continue
            if arr[i] + arr[j] == target:
                return [i, j]


if __name__ == "__main__":
    arr = list(map(int, input(f"Enter array elements seaparated by space: ").split()))
    target = int(input(f"Enter the value of target element"))
    print(f"Indexes of element that sum upto target are: {find_two_sum(arr)}")

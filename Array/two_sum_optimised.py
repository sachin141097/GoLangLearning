def find_two_sum(arr):
    m = {}
    for i in range(len(arr)):
        complement = target - arr[i]
        if m.get(complement) is not None:
            return [m.get(complement), i]
        m[arr[i]] = i
    return []


if __name__ == "__main__":
    arr = list(map(int, input(f"Enter array elements seaparated by space: ").split()))
    target = int(input(f"Enter the value of target element"))
    print(f"Indexes of element that sum upto target are: {find_two_sum(arr)}")

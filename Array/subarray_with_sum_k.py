def subarray_with_sum_k(arr, k):
    n = len(arr)
    sum = 0
    no_of_subarrays = 0
    prefix_sum_count = {0: 1}
    for i in range(n):
        sum += arr[i]
        if prefix_sum_count.get(sum - k):
            no_of_subarrays += prefix_sum_count.get(sum - k)
        prefix_sum_count[sum] = prefix_sum_count.get(sum, 0) + 1
    return no_of_subarrays


if __name__ == "__main__":
    arr = list(map(int, input(f"Enter array elements separated by space: ").split()))
    k = int(input(f"Enter the value of k: "))
    no_of_subarrays = subarray_with_sum_k(arr, k)
    print(f"Number of subarray whose sum is {k} are {no_of_subarrays}")

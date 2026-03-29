def insertion_sort(arr):
    for i in range(0, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1

        arr[j + 1] = key
    return arr

nums = [2, 5, 8, 3, 9, 4, 1]
print(insertion_sort(nums))

def quicksort(arr, low, high):
    if (low >= high):
        return
    
    pivot_index = partition(arr, low, high)
    quicksort(arr, low, pivot_index - 1)
    quicksort(arr, pivot_index + 1, high)
    return arr
    
def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1
    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1

nums = [2, 8, 5, 3, 9, 4, 1]
print(quicksort(nums, 0, len(nums) - 1))
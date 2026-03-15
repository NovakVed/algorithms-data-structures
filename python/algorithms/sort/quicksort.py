import random

def quicksort(arr, l, r):
    if l >= r:
        return
    
    pi = partition(arr, l, r)
    quicksort(arr, l, pi - 1)
    quicksort(arr, pi + 1, r)
    return arr

def partition(arr, l, r):
    pi = random.randint(l, r)
    arr[pi], arr[r] = arr[r], arr[pi]
    i = l - 1
    for j in range(l, r):
        if arr[j] <= arr[r]:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[r] = arr[r], arr[i + 1]
    return i + 1

nums = [2, 8, 5, 3, 9, 4, 1]
print(quicksort(nums, 0, len(nums) - 1))
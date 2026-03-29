import random


def quicksort(l, r, arr):
    if r <= l:
        return
    
    p = partition(l, r, arr)
    quicksort(l, p - 1, arr)
    quicksort(p + 1, r, arr)
    return arr

def partition(l, r, arr):
    p = random.randint(l, r)
    arr[p], arr[r] = arr[r], arr[p]
    i = l - 1
    for j in range(l, r):
        if arr[j] <= arr[r]:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[r] = arr[r], arr[i + 1]
    return i + 1

nums = [2, 5, 8, 1, 9, 4, 3]
print(quicksort(0, len(nums) - 1, nums))
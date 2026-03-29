def selection_sort(arr):
    for i in range(0, len(arr)):
        smallest = i
        for j in range(i + 1, len(nums)):
            if arr[j] < arr[smallest]:
                smallest = j
                
        if i is not smallest:
            arr[i] ^= arr[smallest]
            arr[smallest] ^= arr[i]
            arr[i] ^= arr[smallest]
    return arr

nums = [2, 5, 8, 3, 9, 4, 1]
print(selection_sort(nums)) 
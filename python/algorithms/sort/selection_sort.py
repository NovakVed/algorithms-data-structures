def selectionSort(nums):
    for i in range(0, len(nums)):
        smallestIndex = i
        for j in range(i + 1, len(nums)):
            if nums[j] < nums[smallestIndex]:
                smallestIndex = j
        
        # nums[i], nums[smallestIndex] = nums[smallestIndex], nums[i] # tuple swap
        if i != smallestIndex:
            nums[i] ^= nums[smallestIndex]
            nums[smallestIndex] ^= nums[i]
            nums[i] ^= nums[smallestIndex]

    return nums

nums = [2, 8, 5, 3, 9, 4, 1]
print(selectionSort(nums))
def binary_search(list, target):
    l = 0
    r = len(list) - 1
    while l <= r:
        m = (l + r) // 2
        if list[m] == target:
            return True
        if list[m] > target:
            r = m - 1
        else:
            l = m + 1

    return False

print(binary_search([1,2,3,4,5,6,7,8,9,10,11,12], 9))
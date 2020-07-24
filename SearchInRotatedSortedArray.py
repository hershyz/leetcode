# https://leetcode.com/problems/search-in-rotated-sorted-array/
# Difficulty: MEDIUM

def search(nums, target):
    i = 0
    while (i < len(nums)):
        if (nums[i] == target):
            return i
        i+=1
    return -1

print(search([4, 5, 6, 7, 0, 1, 2], 0))

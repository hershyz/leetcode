# https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
# Difficulty: EASY

def findSpecialInteger(arr):

    threshold = len(arr) / 4
    nums = []
    frequency = []

    i = 0
    while (i < len(arr)):
        
        if (arr[i] in nums):
            frequency[len(frequency) - 1] = frequency[len(frequency) - 1] + 1
        if (arr[i] not in nums):
            nums.append(arr[i])
            frequency.append(1)
        
        i = i + 1

    j = 0
    while (j < len(frequency)):
        if (frequency[j] > threshold):
            return nums[j]
        j = j + 1

    return -1


arr = [1,2,2,3]
print(findSpecialInteger(arr))

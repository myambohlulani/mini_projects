def maximumDifference(nums):
    array = []

    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[j] > nums[i]:
                difference = nums[j] - nums[i]
                array.append(difference)

    if not array:
        return -1
    else:
        max_difference = max(array)
        return max_difference

test_cases = [7,1,5,4]
print(maximumDifference(test_cases)) # Ouput 4
print(maximumDifference([9,4,3,2])) # output = -1
print(maximumDifference([1,5,2,10])) # output = 9
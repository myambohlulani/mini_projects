# binary search and merge sort
# Myambo Hlulani

from random import randint
array = []

for number in range(10):
	num = randint(1, 30)
	if num not in array:
		array.append(num)

def merge_sort(array):
    if len(array) < 2:
        return array

    median = len(array) // 2
    left = merge_sort(array[:median])
    right = merge_sort(array[median:])

    return merge(left, right)

def merge(first, last):
    result = []
    i = 0
    j = 0

    while len(first) > i and len(last) > j:
        if last[j] >= first[i]:
            result.append(first[i])
            i += 1
        else:
            result.append(last[j])
            j += 1
    result.extend(first[i:])
    result.extend(last[j:])

    return result

array = merge_sort(array)

def binary_search(array, target, left, right):
    if left > right:
        return - 1
    middle = (left + right) // 2

    if array[middle] == target:
        return middle
    if array[middle] > target:
        return binary_search(array, target, left, middle - 1)
    return binary_search(array, target, middle + 1, right)

target = randint(1, 30)
print(target, array)
print(binary_search(array, target, 0, len(array) - 1))
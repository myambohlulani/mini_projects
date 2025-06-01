# mini project 1
# binary search and selection sort
# Hlulani Myambo

from random import randint

array = []

# creating random numbers and append them within the array
for number in range(10):
	num = randint(1, 30)
	if num not in array:
		array.append(num)

# implementation of selection sort
def selection_sort(array):
	for outer in range(len(array)):
		minimum = outer
		for inner in range(1 + outer, len(array)):
			if array[minimum] > array[inner]:
				minimum = inner
		array[minimum], array[outer] = array[outer], array[minimum]

	return array

# implementation of binary_search
def binary_search(array, target, left, right):
	if left > right:
		return -1

	middle = (left + right) // 2

	if array[middle] == target:
		return middle
	if array[middle] > target:
		return binary_search(array, target, left, middle - 1)

	return binary_search(array, target, middle + 1, right)

sorted_array = selection_sort(array)
target = randint(1, 30)

index = binary_search(sorted_array, target, 0, len(sorted_array) - 1)

if __name__ == '__main__':
	print(f'Sorted Array: {sorted_array}\nTarget: {target}')
	if index != -1:
		print(f"The number {target} exists and is found at index {index}.")
	else:
		print(f'The number {target} does not exists within the array.')
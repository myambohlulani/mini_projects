# implementation of quick sort and binary search

from random import randint

class QuickSort(object):
    def quick_sort(self, array, low, high):
        if high > low:
            pivot_index = self.partition(array, low, high)
            self.quick_sort(array, low, pivot_index - 1)
            self.quick_sort(array, pivot_index + 1, high)

    def partition(self, array, low, high):
        pivot = array[high]
        i = low

        for j in range(low, high):
            if pivot >= array[j]:
                array[i], array[j] = array[j], array[i]
                i += 1
        array[i], array[high] = array[high], array[i]

        return i

class BinarySearch(object):
    def binary_search(self, array, target, left, right):
        median = (left + right) // 2

        if left > right:
            return - 1
        if array[median] == target:
            return median
        if array[median] > target:
            return self.binary_search(array, target, left, median - 1)
        return self.binary_search(array, target, median + 1, right)

def main():
    quick_sort: QuickSort = QuickSort()
    binary_search: BinarySearch = BinarySearch()

    # test_case
    unsorted_array = []

    for _ in range(20):
        num = randint(1, 30)
        if num not in unsorted_array:
            unsorted_array.append(num)

    target = randint(1, 30)

    # pointers
    LEFT = 0
    RIGHT = len(unsorted_array) - 1

    # unsorted array output
    print(f'Target: {target}\nUnsorted Array: {unsorted_array}')

    # sorting array
    quick_sort.quick_sort(unsorted_array, LEFT, RIGHT)
    # sorted array output
    print(f'Sorted Array: {unsorted_array}')

    # searching for target
    index = binary_search.binary_search(unsorted_array, target, LEFT, RIGHT)

    if index != -1:
        print(f"The number {target} exists in the array and is found in index {index}.")
        return

    print(f"The number {target} is not found within the array.")

if __name__ == '__main__':
    main()

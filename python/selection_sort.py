def selection_sort(array):
    suffix_sort = 0
    while suffix_sort != len(array):
        for i in range(suffix_sort, len(array)):
            if array[suffix_sort] > array[i]:
                array[suffix_sort], array[i] = array[i], array[suffix_sort]
            suffix_sort += 1

def selection_sort2(array):
    for outer in range(len(array)):
        minimum = outer
        for inner in range(outer + 1, len(array)):
            if array[minimum] > array[inner]:
                minimum = inner
        array[minimum], array[outer] = array[outer], array[minimum]

    return array
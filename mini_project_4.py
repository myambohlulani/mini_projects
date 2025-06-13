
# Ntokoto => otokotN
name = ""

def reversing(string): # string = Ntotoko
    # empty string
    if not string:
        return ''

    # string having only 1 element
    if len(string) == 1:
        return string[0]

    # recursive call
    return reversing(string[1:]) + string[0]
    # otokotN

    # otokot + N // string = tokoto
    # otoko + t // string = okoto
    # otok + o //string = koto
    # oto + k // string = oto
    # ot + o // string = to
    # o + t // string = o
    # o

print(reversing("Ntokoto"))
print(reversing(""))

# if
# while
# for
# def

sum_ = 0

for i in range(1, 11):
    sum_ += i

print(sum_)

def hello():
    global hell
    hell = True
    return hell

hell = False

hello()
print(hell)

def my_array(lst):
    lst = [9, 9, 9, 9]
    return lst

array = [0, 0, 0, 0]

my_array(array)
print(array)

def mystery_function(a=2):
    global b
    for i in range(12):
        a *= a * i
        b = a

b = 13
mystery_function(b)

print(b)

# b = 13, a = 13, i = 0 , a = 13 * 13 * 0 = 0
# a = 0, b = 0, i = 1
#

# check if a number is in the array
def search(array, target, index = 0):
    print(target, array, index)
    # empty array
    if not array:
        return False

# array have 1 element [10] target = 1
    if len(array) == 1:
        return array[0] == target

    # [1, 2, 3] target = 2
    # the rest of elements
    if array[0] == target:
        return True
    return search(array[1:], target, index + 1)

array = [10, 11, -6, 9, 5, 7, 8, 12, 90, 47, 112, 30, 20, 900, 91, -50]
target = 112

print(search(array, target))

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

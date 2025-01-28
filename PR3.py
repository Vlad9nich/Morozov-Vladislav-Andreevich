def find_minimum(a, b, c): # вариант 5
    if a <= b and a <= c:
        minimum = a
    elif b <= a and b <= c:
        minimum = b
    else:
        minimum = c
    print("Наименьшее число:", minimum)
find_minimum(5, 3, 8)
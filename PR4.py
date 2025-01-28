def summacubov(n): # вариант 5
    summa = 0  
    for i in range(1, n + 1):
        summa += i ** 3  
    print("Сумма кубов от 1 до", n, "равна:", summa)
n = int(input("Введите натуральное число n: "))
summacubov(n)
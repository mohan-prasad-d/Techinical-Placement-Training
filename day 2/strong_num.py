
from math import factorial


def is_strong_number(num):
    digits = str(num)
    factorial_sum = sum(factorial(int(digit)) for digit in digits)
    return factorial_sum == num

number = int(input("Enter a number: "))
if is_strong_number(number):
    print(f"{number} is a strong number.")
else:
    print(f"{number} is not a strong number.")

num = int(input("Enter a number: "))

def is_palindrome(num):
    str_n = str(num)
    return str_n == str_n[::-1]

if is_palindrome(num):
    print(f"{num} is a palindrome.")
else:
    print(f"{num} is not a palindrome.")

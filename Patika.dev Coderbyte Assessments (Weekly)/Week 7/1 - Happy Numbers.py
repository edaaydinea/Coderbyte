def HappyNumbers(num):
    # code goes here
    if num == 1 or num == 7:
        return "true"

    Sum, x, = num, num
    while Sum > 9:
        Sum = 0
        while x > 0:
            digit = x % 10
            Sum += digit * digit
            x = x // 10

        if Sum == 1:
            return "true"
        return "false"

    if sum == 7:
        return "true"
    return "false"


# keep this function call here
print(HappyNumbers(input()))
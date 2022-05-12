def HappyNumbers(num):
    # code goes here
    result = 0

    while num > 0:
        result += (num % 10) ** 2
        num = num // 10

    if result == 1:
        return "true"
    elif result < 10:
        return "false"
    else:
        return HappyNumbers(result)


# keep this function call here
print(HappyNumbers(input()))

def CheckNums(num1, num2):
    # code goes here
    if num1 == num2:
        return "-1"
    elif num2 > num1:
        return "true"
    else:
        return "false"


# keep this function call here
print(CheckNums(input(), input()))

import re


def EvenPairs(strParam):
    numbers = re.split(r'[a-zA-Z]',strParam)
    numbers = filter(None, numbers)

    for number in numbers:
        if len(number) < 2:
            continue

        for index in range(1, len(number)):
            if int(number[:index]) % 2 == 0 and int(number[index:]) % 2 == 0:
                return "True"

    return "False"


# keep this function call here
print(EvenPairs(input()))
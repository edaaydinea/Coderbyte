def SimpleEvens(num):
    # code goes here
    try:
        string_num = str(num)
        return "true" if all(int(char) % 2 == 0 for char in string_num) else "false"

    except ValueError:
        return -1


# keep this function call here
print(SimpleEvens(input()))

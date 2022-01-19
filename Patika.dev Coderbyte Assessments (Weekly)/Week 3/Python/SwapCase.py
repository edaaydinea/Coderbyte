def SwapCase(strParam):
    # code goes here
    output = ""
    for char in strParam:
        if char.isupper():
            output += char.lower()
        elif char.islower():
            output += char.upper()
        else:
            output += char

    return output


# keep this function call here
print(SwapCase(input()))

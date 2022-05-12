import re


def PalindromeTwo(strParam):
    strParam = strParam.lower()
    strParam = re.sub(r"[\W_]", "", strParam)

    # code goes here
    if strParam == strParam[::-1]:
        return "true"
    else:
        return "false"


# keep this function call here
print(PalindromeTwo(input()))

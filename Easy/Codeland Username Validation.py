import re


def CodelandUsernameValidation(strParam):
    # code goes here
    valid = "false"

    if strParam[0].isalpha():
        if 4 < len(strParam) < 25:
            if strParam[-1] != '_':
                if re.match('^[a-zA-Z0-9_]+$', strParam):
                    valid = "true"

    # code goes here
    return valid


# keep this function call here
print(CodelandUsernameValidation(input()))

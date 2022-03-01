def FindIntersection(strArr):
    setOne = set(strArr[0].split(", "))
    setTwo = set(strArr[1].split(", "))

    result = sorted(list(setOne.intersection(setTwo)), key=lambda str: int(str))

    return ','.join(result) if len(result) > 0 else False


# keep this function call here
print(FindIntersection(input()))
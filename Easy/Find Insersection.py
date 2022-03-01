def FindIntersection(strArr):
    # code goes here
    a = map(int, strArr[0].split(", "))
    b = map(int, strArr[1].split(", "))
    c = list(set(a) & set(b))
    c.sort()
    return ",".join(map(str, c))


# keep this function call here
print(FindIntersection(input()))

import itertools

def ParallelSums(arr):
    # code goes here

    combinations = set(itertools.combinations(arr, len(arr) // 2))

    for a in combinations:
        a_sum = sum(a)
        b = arr[:]

        for i in a:
            b.remove(i)
        b_sum = sum(b)

        if a_sum == b_sum:
            result = compose(list(a),b)
            return result

    return -1


def compose(a,b):
    a.sort()
    b.sort()

    if a[0] <= b[0]:
        return ",".join(str(x) for x in a + b)
    else:
        return ",".join(str(x) for x in b + a)


# keep this function call here
print(ParallelSums(input()))
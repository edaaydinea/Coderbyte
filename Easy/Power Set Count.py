from itertools import chain,combinations

def PowerSetCount(arr):

    # code goes here
    try:
        power_set = list(chain(*map(lambda x: combinations(arr, x), range(0, len(arr) + 1))))
        return len(power_set)
    except(AttributeError, TypeError):
        return -1

# keep this function call here
print(PowerSetCount(input()))
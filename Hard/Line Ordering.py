from itertools import permutations


def LineOrdering(strArr):
    # code goes here
    people = set()
    output = []
    for condition in strArr:
        condition = condition.replace("&#60;", "<")
        people.add(condition[0])
        people.add(condition[2])

    permutation = list(permutations(people))

    for path in permutation:
        add = True
        for condition in strArr:
            if condition[1] == ">":
                if path.index(condition[0]) < path.index(condition[-1]):
                    add = False
            else:
                if path.index(condition[0]) > path.index(condition[-1]):
                    add = False

        if add:
            output.append(path)

    return len(output)


# keep this function call here 
print(LineOrdering(input()))
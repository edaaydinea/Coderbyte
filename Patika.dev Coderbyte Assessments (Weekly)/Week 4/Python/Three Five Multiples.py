def ThreeFiveMultiples(num):

    multiples_list = []

    for number in range(1, num):
        if number % 5 == 0 or number % 3 == 0:
            multiples_list.append(number)

    # code goes here
    return sum(multiples_list)

# keep this function call here
print(ThreeFiveMultiples(input()))
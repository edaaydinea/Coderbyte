from itertools import combinations

def all_subsets(arr):
    return list(combinations(arr[1:],2))

def TwoSum(arr):
    # code goes here
    try:
        possible_combinations = list(all_subsets(arr))
        valid_pair_list = []
        string_pair_list = []

        for pair in possible_combinations:
            if sum(pair) == arr[0]:
                valid_pair_list.append(pair)

        if len(valid_pair_list) != 0:
            for pair in valid_pair_list:
                string_pair_list.append(",".join(str(number) for number in pair))

            return " ".join(string_pair for string_pair in string_pair_list)

        else:
            return -1

    except(AttributeError, TypeError):
        return -2

# keep this function call here
print(TwoSum(input()))
def ArrayCouples(arr):
    pairs_with_id = []
    pairs = []
    all_pairs_with_id = []
    correct_pairs = []

    for element_id in range(0, len(arr) - 1, 2):
        pairs_with_id.append(([arr[element_id], arr[element_id + 1]], element_id))
        pairs.extend([arr[element_id], arr[element_id + 1]])
    for element_id in range(0, len(arr) - 1):
        all_pairs_with_id.append(([arr[element_id], arr[element_id + 1]], element_id))

    for pair in pairs_with_id:
        for pair_reversed in all_pairs_with_id:
            if pair[1] != pair_reversed[1]:
                if pair[0][::-1] == pair_reversed[0]:
                    correct_pairs.extend(pair[0])
                    break

    result = []

    for element in pairs:
        if element not in correct_pairs:
            result.append(element)

    if len(result) != 0:
        return ",".join(str(element) for element in result)

    return "yes"


# keep this function call here
print(ArrayCouples(input()))

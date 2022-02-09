def KnightJumps(strParam):
    # code goes here
    x = int(strParam[1])
    y = int(strParam[-2])

    possible_moves = [(x - 2, y + 1), (x - 2, y - 1), (x + 2, y + 1), (x + 2, y - 1), (x - 1, y + 2), (x - 1, y - 2),
                      (x + 1, y + 2), (x + 1, y - 2)]

    result = 0
    for move in possible_moves:
        if 1 <= move[0] <= 8 and 1 <= move[1] <= 8:
            result += 1

    return str(result)


# keep this function call here
print(KnightJumps(input()))

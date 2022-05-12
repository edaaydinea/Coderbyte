def BlackjackHighest(strArr):
    # code goes here
    values_blackjack = {"two": 2, "three": 3, "four": 4, "five": 5, "six": 6,
                        "seven": 7, "eight": 8, "nine": 9, "ten": 10,
                        "jack": 10, "queen": 10, "king": 10, "ace": 11}

    positioning_card = {"two": 2, "three": 3, "four": 4, "five": 5, "six": 6,
                        "seven": 7, "eight": 8, "nine": 9, "ten": 10,
                        "jack": 11, "queen": 12, "king": 13, "ace": 1}

    sum_val = 0
    highest_card_val = 0
    highest_card = ""

    for card in strArr:
        sum_val += values_blackjack[card]

        if positioning_card[card] > highest_card_val:
            highest_card_val = positioning_card[card]
            highest_card = card

    as_is_one = False
    if "ace" in strArr:
        if sum_val > 21:
            as_is_one = True
        else:
            highest_card = "ace"

    if as_is_one:
        sum_val -= 10

    if sum_val > 21:
        return "above {}".format(highest_card)
    elif sum_val == 21:
        return "blackjack {}".format(highest_card)
    else:
        return "below {}".format(highest_card)


# keep this function call here
print(BlackjackHighest(input()))

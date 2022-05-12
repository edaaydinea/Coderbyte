def LetterCount(strParam):
    # code goes here
    greatest = -1
    greatestCount = 0

    def findRepeats(word):
        repetition = 0
        storage = {}

        for letter in list(word):
            try:
                storage[letter] += 1
            except:
                storage[letter] = 1

        for i in storage:
            if storage[i] > 1:
                repetition += storage[i]

        return repetition

    array = strParam.split()

    for word in array:
        count = findRepeats(word)
        if count > greatestCount:
            greatest = word
            greatestCount = count

    return greatest


# keep this function call here
print(LetterCount(input()))

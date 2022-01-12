def StepWalking(num):
    # code goes here
    if num == 1:
        return 1
    elif num == 2:
        return 2
    else:
        return StepWalking(num - 1) + StepWalking(num - 2)


# keep this function call here 
print(StepWalking(input()))

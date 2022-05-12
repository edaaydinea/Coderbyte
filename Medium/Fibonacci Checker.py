def FibonacciChecker(num):
    # code goes here
    fn = fn_1 = 0
    fn_2 = 1

    while fn <= num:
        if fn == num:
            return "yes"
        fn = fn_1 + fn_2
        fn_2 = fn_1
        fn_1 = fn
    return "no"


# keep this function call here
print(FibonacciChecker(input()))

def NearestSmallerValues(arr):
    # code goes here
    output_arr = [-1]

    for num_id in range(1, len(arr)):

        appended_smaller = False

        for num in reversed(arr[:num_id]):
            if num <= arr[num_id]:
                output_arr.append(num)
                appended_smaller = True
                break

        if appended_smaller == False:
            output_arr.append(-1)

    return " ".join(str(num) for num in output_arr)


# keep this function call here
print(NearestSmallerValues(input()))

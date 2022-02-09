import re
from datetime import datetime


def CountingMinutes(strParam):
    # code goes here
    hours_format = "%I:%M%p"

    start, end = re.split(r"-", strParam)[0], re.split(r"-", strParam)[1]

    time_diff = datetime.strptime(end, hours_format) - datetime.strptime(start, hours_format)

    total_minutes = time_diff.seconds // 60

    return total_minutes


# keep this function call here
print(CountingMinutes(input()))

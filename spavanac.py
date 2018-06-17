hour, min = list(map(int, input().split()))

if min > 45:
    min -= 45
else:
    min += 15
    if hour != 0:
        hour -= 1
    else:
        hour = 23

print("{} {}".format(hour, min))
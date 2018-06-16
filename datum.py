day, month = input().split()
day = int(day)
month = int(month)

31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31

if month > 1:
    day += 31
if month > 2:
    day += 28
if month > 3:
    day += 31
if month > 4:
    day += 30
if month > 5:
    day += 31
if month > 6:
    day += 30
if month > 7:
    day += 31
if month > 8:
    day += 31
if month > 9:
    day += 30
if month > 10:
    day += 31
if month > 11:
    day += 30

if day % 7 == 0:
    print("Wednesday")
if day % 7 == 1:
    print("Thursday")
if day % 7 == 2:
    print("Friday")
if day % 7 == 3:
    print("Saturday")
if day % 7 == 4:
    print("Sunday")
if day % 7 == 5:
    print("Monday")
if day % 7 == 6:
    print("Tuesday")

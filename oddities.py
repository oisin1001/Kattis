numLines = int(input())

for i in range(numLines):
    value = int(input())
    if value % 2 == 0:
        print("{} is even".format(value))
    else:
        print("{} is odd".format(value))
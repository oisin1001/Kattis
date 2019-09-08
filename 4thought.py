def findEquation(target, symbols):
    for first in symbols:
        for second in symbols:
            for third in symbols:
                if eval("4{}4{}4{}4=={}".format(first, second, third, target)):
                    if first == "//":
                        first = "/"
                    if second == "//":
                        second = '/'
                    if third == "//":
                        third = "/"
                    print("4 {} 4 {} 4 {} 4 = {}".format(first, second, third, target))
                    return
    print("no solution")
    return

numCases = int(input())
symbols = ["+", "-", "*", "//"]

for i in range(numCases):
    target = int(input())
    findEquation(target, symbols)
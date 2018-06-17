numPairs = int(input())

for i in range(numPairs):
    if i != 0:
        print()
    first = input()
    second = input()
    result = ""
    print(first)
    print(second)

    for i in range(len(first)):
        if first[i] != second[i]:
            result += "*"
        else:
            result += "."
    print(result)
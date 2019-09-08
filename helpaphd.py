numCases = int(input())

for i in range(numCases):
    sum = input()
    if "=" in sum:
        print("skipped")
    else:
        print(eval(sum))
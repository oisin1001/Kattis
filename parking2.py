'''2
4
24 13 89 37 -> 13 24 37 89
6
7 30 41 14 39 42'''

testCases = int(input())

for i in range(testCases):
    numShops = int(input())
    shops = sorted(list(map(int, input().split())))
    total = 0

    for j in range(1, numShops):
        total += shops[j] - shops[j-1]
    total += shops[numShops-1] - shops[0]
    print(total)
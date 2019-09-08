numCases = int(input())

for i in range(numCases):
    numGuests = int(input())
    guests = sorted(list(map(int, input().split())))

    for j in range(0, numGuests, 2):
        if j == numGuests - 1:
            print("Case #{}: {}".format(i+1, guests[j]))
            break
        if guests[j] != guests[j+1]:
            print("Case #{}: {}".format(i+1, guests[j]))
            break
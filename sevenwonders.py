cards = input()
total = 0
numTablets, numCards, numGears = 0, 0, 0

for card in cards:
    if card == "T":
        numTablets += 1
    if card == "C":
        numCards += 1
    if card == "G":
        numGears += 1

total += min(numCards, numGears, numTablets) * 7
total += numTablets ** 2
total += numCards ** 2
total += numGears ** 2

print(total)
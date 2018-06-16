hands, trump = input().split()
cards = 4 * int(hands)
total = 0

for i in range(cards):
    current = input()
    value, suit = current[0],current[1]

    if value == "J":
        if suit == trump:
            total += 20
        else:
            total += 2
    
    if value == "9":
        if suit == trump:
            total += 14
        
    if value == "T":
        total += 10

    if value == "Q":
        total += 3

    if value == "K":
        total += 4

    if value == "A":
        total += 11

print(total)
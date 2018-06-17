cups = [1, 0, 0]

moves = input()

for move in moves:
    if move == "A":
        tmp = cups[0]
        cups[0] = cups[1]
        cups[1] = tmp
    if move == "B":
        tmp = cups[2]
        cups[2] = cups[1]
        cups[1] = tmp
    if move == "C":
        tmp = cups[2]
        cups[2] = cups[0]
        cups[0] = tmp

print(cups.index(1) + 1)
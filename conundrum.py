word = input()
days = 0

for i in range(len(word)):
    c = word[i]
    if i % 3 == 0:
        if c != "P":
            days += 1
    elif i % 3 == 1:
        if c != "E":
            days += 1
    else:
        if c != "R":
            days += 1

print(days)
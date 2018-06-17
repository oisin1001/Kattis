message = input().split()
words = []

for word in message:
    if word not in words:
        words.append(word)
    else:
        print("no")
        exit()

print("yes")
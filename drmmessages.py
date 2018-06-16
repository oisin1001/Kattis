alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def rotate(word):
    value = findValue(word)
    for i in range(len(word)):
        c = word[i]
        index = alpha.find(c)
        index = value + index
        index = index % 26
        word = word[:i] + alpha[index] + word[i+1:]
    return word

def findValue(word):
    sum = 0
    for c in word:
        sum += alpha.find(c)
    return sum

encrypted = input()

first = encrypted[:len(encrypted) // 2]
second = encrypted[len(encrypted) // 2:]

first = rotate(first)
second = rotate(second)

for i in range(len(first)):
    firstChar = first[i]
    secondChar = second[i]

    firstIndex = alpha.find(firstChar)
    secondIndex = alpha.find(secondChar)

    index = firstIndex + secondIndex
    index = index % 26
    print(alpha[index], end="")

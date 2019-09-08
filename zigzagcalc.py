word = input()

result = 0

for i in reversed(range(1, len(word))):
    result += abs(ord(word[i]) - ord(word[i-1]))

print(result)
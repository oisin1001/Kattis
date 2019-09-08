def isVowel(l):
    if l == "a" or l == "e" or l == "i" or l == "o" or l == "u":
        return True
    return False

line = input()
result = ""

for i in range(len(line)):
    if isVowel(line[i]):
        result = line[:i] + line[i+2:]
        i += 2
print(result)
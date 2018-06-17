import re

word = input()

firstResult = word.count("_") / len(word)


numUpper = len(re.findall(r'[A-Z]',word))
numLower = len(re.findall(r'[a-z]',word))


secondResult = numLower / len(word)
thirdResult = numUpper / len(word)

finalResult = 1.0 - firstResult - secondResult - thirdResult

print(firstResult)
print(secondResult)
print(thirdResult)
print(finalResult)
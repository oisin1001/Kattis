numLines = int(input())
numbers = []

for i in range(numLines):
    value = input()
    base = int(value[:-1])
    exp = int(value[-1])
    numbers.append(base ** exp)

print(sum(numbers))
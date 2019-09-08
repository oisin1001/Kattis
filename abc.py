numbers = list(map(int, input().split()))
order = input()

numbers = sorted(numbers)
result = []

for i in range(len(order)):
    if order[i] == "A":
        result.append(numbers[0])
    if order[i] == "B":
        result.append(numbers[1])
    if order[i] == "C":
        result.append(numbers[2])

print("{} {} {}".format(result[0], result[1], result[2]))
numBats = int(input())
numbers = list(map(int, input().split()))
sum = 0
amount = 0

for num in numbers:
    if num >= 0:
        sum += num
        amount += 1

print(sum/amount)
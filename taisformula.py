numberOfLines = int(input())
answer = 0.0

first, second = list(map(float, input().split()))
for i in range(numberOfLines-1):
    newFirst, newSecond = list(map(float, input().split()))
    answer += ((newSecond + second) / 2) * (newFirst - first)
    first, second = newFirst, newSecond
print(answer/1000)
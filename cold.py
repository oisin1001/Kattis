numdays = int(input())

numbers = list(map(int, input().split()))
ans = 0

for temp in numbers:
    if temp < 0:
        ans += 1

print(ans)
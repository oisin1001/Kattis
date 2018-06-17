def sumDigits(num):
    sum = 0
    while (num > 0):
        sum += num % 10
        num = num // 10
    return sum

L = int(input())
D = int(input())
X = int(input())
N = 0
M = 0

for N in range(L, D+1):
    if sumDigits(N) == X:
        break

for M in range(D, L-1, -1):
    if sumDigits(M) == X:
        break

print("{}\n{}".format(N, M))
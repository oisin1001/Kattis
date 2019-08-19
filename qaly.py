numLines = int(input())
result = 0.0

for i in range(numLines):
    s = input()
    numbers = list(map(float, s.split()))
    result += (numbers[0] * numbers[1])

print("%.3f" % result)


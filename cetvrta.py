firstPoint = input().split()
secondPoint = input().split()
thirdPoint = input().split()

answer = []

for i in range(2):
    if firstPoint[i] == secondPoint[i]:
        answer.append(thirdPoint[i])

    if thirdPoint[i] == secondPoint[i]:
        answer.append(firstPoint[i])

    if thirdPoint[i] == firstPoint[i]:
        answer.append(secondPoint[i])

print("{} {}".format(answer[0], answer[1]))
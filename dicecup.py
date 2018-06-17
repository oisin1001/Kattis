firstDie, secondDie = list(map(int, input().split()))

if firstDie < secondDie:
    for i in range(firstDie, secondDie+1):
        print(1 + i)
else:
    for i in range(secondDie, firstDie+1):
        print(1 + i)
numberOfLines = int(input())

for line in range(numberOfLines):
    turtlePopulationList = list(map(int, input().split()))
    answer = 0

    for i in range(len(turtlePopulationList)-2):
        if turtlePopulationList[i+1] - (2*turtlePopulationList[i]) > 0:
            answer += turtlePopulationList[i+1] - (2*turtlePopulationList[i])
    
    print(answer)
numCases = int(input())

for i in range(numCases):
    case, base, goal = list(map(int, input().split()))
    equation = []
    for i in range(goal):
        equation.append(1)
    yoke = 1
    numTimes = 1

    while yoke < goal:
        print(equation)
        if equation.count(yoke) >= base:
            for i in range(base):
                equation.remove(yoke)
            equation.append(yoke * base)
            numTimes += 1
        else:
            yoke = yoke * base
    
    print(numTimes)
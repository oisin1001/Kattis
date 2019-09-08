import math

inp = input().split()
radius = float(inp[0])
totalDots = int(inp[1])
dotsIn = int(inp[2])

while radius != 0 and totalDots != 0 and dotsIn != 0:
    trueArea = math.pi * radius * radius
    squareArea = 4 * radius * radius
    estArea = squareArea * (dotsIn/totalDots)
    print(trueArea, estArea)
    inp = input().split()
    radius = float(inp[0])
    totalDots = int(inp[1])
    dotsIn = int(inp[2])
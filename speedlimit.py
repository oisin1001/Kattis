numParts = int(input())

while numParts != -1:
    total = 0
    lastTime = 0
    for i in range(numParts):
        speed, time = input().split()
        speed = int(speed)
        time = int(time)
        total += speed * (time - lastTime)
        lastTime = time
    print("{} miles".format(total))
    numParts = int(input())
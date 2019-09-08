numCases = int(input())

for i in range(numCases):
    entered = input().split()
    beats = int(entered[0])
    seconds = float(entered[1])
    
    heartRate = 60 * beats / seconds
    minHeartRate = 60 * (beats-1) / seconds
    maxHeartRate = 60 * (beats+1) / seconds

    print("{} {} {}".format(minHeartRate, heartRate, maxHeartRate))
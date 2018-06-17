allowance = int(input())
megabytes = allowance
numLines = int(input())

for i in range(numLines):
    usage = int(input())
    megabytes -= usage
    megabytes += allowance
print(megabytes)
numberOfLines = int(input())

for currentLine in range(numberOfLines):
    caseNumber, base, value = list(map(int, input().split()))
    answer = 0

    while value != 0:
        currentNumber = value % base
        answer += currentNumber ** 2
        value = value // base
    
    print(f"{caseNumber} {answer}")
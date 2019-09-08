origNumRows, origNumCols, rowMultiple, colMultiple = list(map(int, input().split()))

newNumCols = origNumCols * colMultiple
newNumRows = origNumRows * rowMultiple

for i in range(origNumRows):
    line = input()
    for j in range(rowMultiple):
        for char in line:
            for i in range(colMultiple):
                print(char, end="")
        print()
def rotate(grid):
    return [list(l[::-1]) for l in zip(*grid)]

firstRow = input().split()
secondRow = input().split()
thirdRow = input().split()
fourthRow = input().split()

grid = [firstRow, secondRow, thirdRow, fourthRow]
newgrid = []
print(grid)

direction = input()

if direction == "0":
    grid = rotate(grid)
    grid = rotate(grid)
    grid = rotate(grid)
if direction == "1":
    grid = rotate(grid)
    grid = rotate(grid)
if direction == "2":
    grid = rotate(grid)

print(grid)

''' 2 2 4 0
    0 8 32 64
    0 16 64 1024
    2 4 2 1024'''
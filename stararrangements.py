numStars = int(input())

def solvable(first, second):
    for i in range(1,(numStars+1)//2):
        j = i-1
        if i*first + j*second == numStars:
            return True
        j = i
        if i*first + j*second == numStars:
                return True
    return False

print("{}:".format(numStars))

for i in range(2, numStars):
    if solvable(i, i-1):
        print("{},{}".format(i, i-1))
    if solvable(i, i):
        print("{},{}".format(i, i))
numStars = int(input())

def solvable(number):
    #print("Number is {}".format(number))
    for i in range(1,numStars//2):
       # print(i)
        if i*number + i*number == numStars:
            print("{}, {}".format(i, i))
        if i*number + i*(number-1) == numStars:
            print("{}, {}".format(i, i))
        if i*number + (i-1)*number == numStars:
            print("{}, {}".format(i, i-1))
        if i*number + (i-1)*(number-1) == numStars:
            print("{}, {}".format(i, i-1))

print("{}:".format(numStars))

for i in range(2, numStars):
    solvable(i)
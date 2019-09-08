numStars = int(input())

print("{}:".format(numStars))

for i in range(2, numStars):
    if numStars % (2 * i - 1) == 0 or numStars % (2 * i - 1) == i:
        print("{},{}".format(i, i-1))
    if numStars % i == 0:
        print("{},{}".format(i, i))

'''
* *
 *
* *
 *
* *

* *
* *
* *
* *

* * *
 * *
* * *

* * * *
* * * * '''
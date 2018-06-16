fizz, buzz, numVals = input().split()
fizz = int(fizz)
buzz = int(buzz)

for i in range(1, int(numVals)+1):
    if i % fizz == 0 and i % buzz == 0:
        print("FizzBuzz")
    elif i % fizz == 0:
        print("Fizz")
    elif i % buzz == 0:
        print("Buzz")
    else:
        print(i)
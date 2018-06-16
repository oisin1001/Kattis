name = input()
lastCar = ''

for c in name:
    if c != lastCar:
        print(c, end='')
        lastCar = c
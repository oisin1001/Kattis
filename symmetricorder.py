numberOfNames = int(input())
setNumber = 1

while numberOfNames != 0:
  names = []
  for i in range(numberOfNames):
    names.append(input())

  print(f"SET {setNumber}")

  for i in range(len(names)):
    if i % 2 == 0:
      print(names[i])

  for i in range(len(names)-1, 0, -1):
    if i % 2 == 1:
      print(names[i])
  
  numberOfNames = int(input())
  setNumber += 1

limit, numLines = list(map(int, input().split()))

current, denyCount = 0, 0

for i in range(numLines):
  command = input()

  numberOfPeople = [int(s) for s in command.split() if s.isdigit()]

  if 'enter' in command:
    if current + numberOfPeople[0] > limit:
      denyCount += 1
    else:
      current += numberOfPeople[0]

  if 'leave' in command:
    if current - numberOfPeople[0] < 0:
      current = 0
    else:
      current -= numberOfPeople[0]

print(denyCount)
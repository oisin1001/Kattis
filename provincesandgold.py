s = input()
numbers = list(map(float, s.split()))

amount = (numbers[0]*3) + (numbers[1]*2) + (numbers[2]*1)

result = ''

if amount >= 8:
  result += 'Province or '
elif amount >= 5:
  result += 'Duchy or '
elif amount >= 2:
  result += 'Estate or '


if amount >= 6:
  result += 'Gold'
elif amount >= 3:
  result += 'Silver'
elif amount >= 0:
  result += 'Copper'

print(result)
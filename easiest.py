def calculator(x):
    return sum(map(int, str(x)))

def solve(N):
  for i in range(11, 101):
    if calculator(N) == calculator(N * i):
      return i
  return 100

N = input()

while N != "0":
  print(solve(int(N)))
  
  N = input()
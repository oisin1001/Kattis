scores = []

for i in range(5):
    s = input()
    numbers = list(map(int, s.split()))
    scores.append(sum(numbers))

print("{} {}".format(scores.index(max(scores))+1, max(scores)))
s = input()
articles, impact = list(map(int, s.split()))

citations = (articles * (impact - 1)) + 1
print(citations)
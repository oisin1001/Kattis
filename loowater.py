# link: https://open.kattis.com/problems/loowater

def slayCheck(heads, knights):
    total = 0
    dragon = 0
    curr = -1

    for knight in range(len(knights)):
        if dragon == len(heads):
            break
        curr = i
        if heads[dragon] <= knights[knight]:
            # slayed
            dragon += 1
            total += knights[knight]
    if dragon != len(heads):
        print("Loowater is doomed!")
        return
    print(total)

numHeads, numKnights = map(int, input().split())

while numHeads != 0 and numKnights != 0:
    heads = []
    knights = []

    for i in range(numHeads):
        heads.append(int(input()))
    heads = sorted(heads)

    for i in range(numKnights):
        knights.append(int(input()))
    knights = sorted(knights)

    if numHeads > numKnights:
        print("Loowater is doomed!")
    else:
         slayCheck(heads,knights)

    numHeads, numKnights = map(int, input().split())
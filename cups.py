numCups = int(input())

results = {}

for i in range(numCups):
    inp = input().split()
    digit = 0
    colour = ""

    try:
        digit = int(inp[0])
        digit = digit / 2
        colour = inp[1]
    except ValueError:
        digit = int(inp[1])
        colour = inp[0]
    
    results[digit] = colour

for key in sorted(results):
    print("{}".format(results[key]))
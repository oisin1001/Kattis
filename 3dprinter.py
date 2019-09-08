required = int(input())

binary = bin(required)[2:]
ans = len(binary)+1
if binary.count('1') == 1:
    ans -= 1
print(ans)
first, second = input().split()
first = first[::-1]
second = second[::-1]

if first > second:
    print(first)
else:
    print(second)
left, right = list(map(int, input().split()))
if left + right == 0:
    print("Not a moose")
elif left == right:
    print("Even {}".format(left * 2))
else:
    print("Odd {}".format(max(left, right)* 2))
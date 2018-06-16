original = input()


originalBinary = "{0:b}".format(int(original))
reversedBinary = ''.join(reversed(originalBinary))

print(int(reversedBinary, 2))
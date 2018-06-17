# h/ sin(v degrees)
import math

height, angle = list(map(int, input().split()))

print(math.ceil(height / math.sin(math.radians(angle))))
# My idea for this is to turn the path from directions relative to the robot to directions like up, down, left, right (looking down on top of the robot)

def convert(directions):
    result = ""
    face = ["R", "D", "L", "U"]
    facing = 0

    for letter in directions:
        if letter == "F":
            result += face[facing]
        if letter == "R":
            facing = (facing + 1) % 4
            result += face[facing]
        if letter == "B":
            facing = (facing + 2) % 4
            result += face[facing]
        if letter == "L":
            facing = (facing + 3) % 4
            result += face[facing]
    return result

cases = int(input())

for i in range(cases):
    text = input()
    directions = convert(text)
    print(directions)
    width, height = 2, 3
    
    for move in directions:
        if move == "R":
            width += 1
        if move == "D":
            height += 1
    print(height, width)
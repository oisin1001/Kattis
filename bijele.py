numbers = list(map(int, input().split()))
answers = []

answers.append(1-numbers[0])
answers.append(1-numbers[1])
answers.append(2-numbers[2])
answers.append(2-numbers[3])
answers.append(2-numbers[4])
answers.append(8-numbers[5])

print("{} {} {} {} {} {}".format(answers[0], answers[1], answers[2], answers[3], answers[4], answers[5]))
numTeams = input()
schools = []
results = []

while len(schools) < 12:
    school, team = input().split()

    if school not in schools:
        schools.append(school)
        print("{} {}".format(school, team))
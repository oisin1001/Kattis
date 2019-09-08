numTeams, damaged, reserve = map(int, input().split())
damagedTeams = map(int, input().split())
reserveTeams = map(int, input().split())
teamsList = []

# Key: 0 means damaged and no reserve, 1 means ok and no reserve, 2 means ok and reserve, 3 means damaged and reserve
for i in range(numTeams):
    teamsList.append(1)

for team in damagedTeams:
    teamsList[team-1] = 0

for team in reserveTeams:
    if teamsList[team-1] == 0:
        teamsList[team-1] = 3
    else:
        teamsList[team-1] = 2

for i in range(teamsList):
    if teamsList[i] == 0:
        if teamsList[i-1] == 2:
            teamsList[]


print(teamsList)
'''---oo------- 1
-o--o-oo---- 2
-o----ooo--- 3
oooooooooooo 12
oooooooooo-o 1  '''

def newMove(game):
    for i in range(len(game)-2):
        if game[i] == '-':
            if game[i+1] == 'o' and game[i+2] == 'o':
                newGame = game[:i] + 'o' + game[i + 1:]
                newGame = newGame[:i+1] + '-' + newGame[i + 2:]
                newGame = newGame[:i+2] + '-' + newGame[i + 3:]
                newMove(newGame)
        if game[i] == 'o':
            if game[i+1] == 'o' and game[i+2] == '-':
                newGame = game[:i] + '-' + game[i + 1:]
                newGame = newGame[:i+1] + '-' + newGame[i + 2:]
                newGame = newGame[:i+2] + 'o' + newGame[i + 3:]
                newMove(newGame)
    values.append(game.count('o'))
    return

numGames = input()
values = []

for i in range(int(numGames)):
    game = input()
    newMove(game)
    print(min(values))
    values = []

stave = ["G: ", "F: ", "E: ", "D: ", "C: ", "B: ", "A: ", "g: ", "f: ", "e: ", "d: ", "c: ", "b: ", "a: "]

def addLine():
    stave[0] += " "
    stave[1] += "-"
    stave[2] += ' '
    stave[3] += '-'
    stave[4] += ' '
    stave[5] += '-'
    stave[6] += ' '
    stave[7] += '-'
    stave[8] += ' '
    stave[9] += '-'
    stave[10] += ' '
    stave[11] += ' '
    stave[12] += ' '
    stave[13] += '-'

def addNote(note):
    if "G" in note:
        stave[0] = stave[0][:(len(stave[0])-1)] + "*"
    elif "F" in note:
        stave[1] = stave[1][:(len(stave[1])-1)] + "*"
    elif "E" in note:
        stave[2] = stave[2][:(len(stave[2])-1)] + "*"
    elif "D" in note:
        stave[3] = stave[3][:(len(stave[3])-1)] + "*"
    elif "C" in note:
        stave[4] = stave[4][:(len(stave[4])-1)] + "*"
    elif "B" in note:
        stave[5] = stave[5][:(len(stave[5])-1)] + "*"
    elif "A" in note:
        stave[6] = stave[6][:(len(stave[6])-1)] + "*"
    elif "g" in note:
        stave[7] = stave[7][:(len(stave[7])-1)] + "*"
    elif "f" in note:
        stave[8] = stave[8][:(len(stave[8])-1)] + "*"
    elif "e" in note:
        stave[9] = stave[9][:(len(stave[9])-1)] + "*"
    elif "d" in note:
        stave[10] = stave[10][:(len(stave[10])-1)] + "*"
    elif "c" in note:
        stave[11] = stave[11][:(len(stave[11])-1)] + "*"
    elif "b" in note:
        stave[12] = stave[12][:(len(stave[12])-1)] + "*"
    elif "a" in note:
        stave[13] = stave[13][:(len(stave[13])-1)] + "*"

numberNotes = input()
notesList = input().split()

for i in range(int(numberNotes)):
    note = notesList[i]

    if len(note) > 1:
        duration = note[1]
        for j in range(int(duration)):
            addLine()
            addNote(note[0])
    else:
        addLine()
        addNote(note[0])
    if i != int(numberNotes) -1:
        addLine()

for line in stave:
    print(line)
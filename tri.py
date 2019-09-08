a, b, c = list(map(int, input().split()))

if eval("{}+{}=={}".format(a, b, c)):
    print("{}+{}={}".format(a, b, c))
elif eval("{}-{}=={}".format(a, b, c)):
    print("{}-{}={}".format(a, b, c))
elif eval("{}*{}=={}".format(a, b, c)):
    print("{}*{}={}".format(a, b, c))
elif eval("{}//{}=={}".format(a, b, c)):
    print("{}/{}={}".format(a, b, c))
elif eval("{}=={}+{}".format(a, b, c)):
    print("{}={}+{}".format(a, b, c))
elif eval("{}=={}-{}".format(a, b, c)):
    print("{}={}-{}".format(a, b, c))
elif eval("{}=={}*{}".format(a, b, c)):
    print("{}={}*{}".format(a, b, c))
elif eval("{}=={}//{}".format(a, b, c)):
    print("{}={}/{}".format(a, b, c))

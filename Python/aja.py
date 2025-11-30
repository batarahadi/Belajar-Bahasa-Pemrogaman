import math

def fungsi(x):
    a = 4 - math.sqrt(x)
    b = (16*x) - (x**2)
    return a/b 

print(fungsi(16))
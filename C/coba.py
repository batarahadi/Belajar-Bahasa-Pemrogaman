import numpy as np
import matplotlib.pyplot as plt

animals = ["dog", "cat", "mouse", "elephant", "lion"]
# enumerate() adds counter to an iterable
# for i, namaHewan in enumerate(animals, start=1):
#     print(i,namaHewan)
print(animals)

newList = animals
animals.append("tiger")
print(newList)
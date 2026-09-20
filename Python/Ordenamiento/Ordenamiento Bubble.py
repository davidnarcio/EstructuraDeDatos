arreglo = [61, 21, 51, 11, 41, 31]

print("---Ordenamiento Bubble---")
print("El arreglo original es:", arreglo)

for i in range(len(arreglo) - 1):
    for j in range(len(arreglo) - 1 - i):
        if arreglo[j] > arreglo[j + 1]:
            temp = arreglo[j]
            arreglo[j] = arreglo[j + 1]
            arreglo[j + 1] = temp

print("El arreglo ordenado es:", arreglo)
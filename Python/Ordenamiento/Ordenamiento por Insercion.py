arreglo = [61, 21, 51, 11, 41, 31]

print("---Ordenamiento por Insercion---")
print("El arreglo original es:", arreglo)

for i in range(1, len(arreglo)):
    actual = arreglo[i]
    j = i - 1
    while j >= 0 and arreglo[j] > actual:
        arreglo[j + 1] = arreglo[j]
        j = j - 1
    arreglo[j + 1] = actual

print("El arreglo ordenado es:", arreglo)
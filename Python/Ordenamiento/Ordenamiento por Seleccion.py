arreglo = [61, 21, 51, 11, 41, 31]

print("---Ordenamiento por Seleccion---")
print("El arreglo original es:", arreglo)

for i in range(len(arreglo) - 1):
    menor = i
    for j in range(i + 1, len(arreglo)):
        if arreglo[j] < arreglo[menor]:
            menor = j
    temp = arreglo[i]
    arreglo[i] = arreglo[menor]
    arreglo[menor] = temp

print("El arreglo ordenado es:", arreglo)
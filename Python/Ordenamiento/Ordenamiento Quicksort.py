def quicksort(arreglo, inicio, fin):
    if inicio < fin:
        pivote = arreglo[fin]
        i = inicio - 1
        for j in range(inicio, fin):
            if arreglo[j] <= pivote:
                i = i + 1
                temp = arreglo[i]
                arreglo[i] = arreglo[j]
                arreglo[j] = temp
        temp = arreglo[i + 1]
        arreglo[i + 1] = arreglo[fin]
        arreglo[fin] = temp

        posicion_pivote = i + 1
        quicksort(arreglo, inicio, posicion_pivote - 1)
        quicksort(arreglo, posicion_pivote + 1, fin)


arreglo = [61, 21, 51, 11, 41, 31]

print("---Ordenamiento Quicksort---")
print("El arreglo original es:", arreglo)

quicksort(arreglo, 0, len(arreglo) - 1)

print("El arreglo ordenado es:", arreglo)
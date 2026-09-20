matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print("---Recorrido por filas---")
for i in range(len(matriz)):
    print("Fila", i, ":", end=" ")
    for j in range(len(matriz[i])):
        print(matriz[i][j], end=" ")
    print()
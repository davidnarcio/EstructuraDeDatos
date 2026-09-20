matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print("---Recorrido de matriz 2D---")
for i in range(len(matriz)):
    for j in range(len(matriz[i])):
        print(matriz[i][j], end=" ")
    print()
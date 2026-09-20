matriz3d = [
    [[1, 2], [3, 4]],
    [[5, 6], [7, 8]]
]

print("---Recorrido de matriz 3D---")
for i in range(len(matriz3d)):
    print("Capa", i, ":")
    for j in range(len(matriz3d[i])):
        for k in range(len(matriz3d[i][j])):
            print(matriz3d[i][j][k], end=" ")
        print()
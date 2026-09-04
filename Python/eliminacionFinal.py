inputArr= [11,21,31,41,51,61]
print("--- eliminar al final del array ---")
print("Antes de la eliminacion el array es: ")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
del inputArr[len(inputArr)-1]
print("")
print("Despues de la eliminacion el array es: ")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
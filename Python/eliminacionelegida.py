inputArr= [11,21,31,41,51,61]
print("Antes de la eliminacion el array es: ")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
print("")
elegint=int(input("Que numero quiere eliminar?"))


for j in range(len(inputArr)):
    if inputArr[j]==elegint:
        del inputArr[j]
        print("El numero ha sido eliminado")
        break
else:
    print("El Numero no esta en el array")
print("Despues de la eliminacion el array es: ")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
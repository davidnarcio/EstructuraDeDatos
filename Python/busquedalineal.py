inputArr= [11,21,31,41,51,61]
print("El array es ")
print("--- Recorrido secuencial del array ---")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
    
numbuscar=int(input("Que numero quiere buscar?"))
for j in range(len(inputArr)):
    if inputArr[j]==numbuscar:
        print("El numero esta en el lugar:",j+1)
        break
else:
    print("El numero no esta en el array")
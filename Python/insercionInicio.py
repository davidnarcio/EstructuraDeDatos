inputArr= [11,21,31,41,51,61]
print("--- insecion al inicio del array ---")
print("El array es ")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
numins=int(input("Que numero quiere insertar?"))
inputArr.insert(0,numins)
print("El array con el nuemro insertado es: ")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
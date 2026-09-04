inputArr= [11,21,31,41,51,61]
print("--- insecion al final del array ---")
print("El array es ")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
numins=int(input("\nQue numero quiere insertar?"))
inputArr.insert(len(inputArr),numins)
print("El array con el nuemro insertado es: ")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
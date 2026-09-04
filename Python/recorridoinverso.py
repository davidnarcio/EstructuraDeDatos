inputArr= [11,21,31,41,51,61]
print("El array es ")
print("--- Recorrido inverso del array ---")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
print("")
for j in range(len(inputArr)-1 ,-1,-1):
    print(inputArr[j], end=" ")

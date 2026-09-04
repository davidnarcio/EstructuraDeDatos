arreglo = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print("Busqueda binaria")

numero_buscado = int(input("Que numero quiere buscar? "))

inicio = 0
final = len(arreglo) - 1

while inicio <= final:
    medio = (inicio + final) // 2

    if arreglo[medio] == numero_buscado:
        print("El numero esta en el lugar:", medio + 1)
        break
    elif numero_buscado < arreglo[medio]:
        final = medio - 1
    else:
        inicio = medio + 1
else:
    print("El numero no esta en el array")
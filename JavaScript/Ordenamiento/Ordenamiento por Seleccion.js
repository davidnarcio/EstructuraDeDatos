const arreglo = [61, 21, 51, 11, 41, 31];

console.log("---Ordenamiento por Seleccion---");
console.log("El arreglo original es: " + arreglo.join(" "));

for (let i = 0; i < arreglo.length - 1; i++) {
    let menor = i;
    for (let j = i + 1; j < arreglo.length; j++) {
        if (arreglo[j] < arreglo[menor]) {
            menor = j;
        }
    }
    let temp = arreglo[i];
    arreglo[i] = arreglo[menor];
    arreglo[menor] = temp;
}

console.log("El arreglo ordenado es: " + arreglo.join(" "));
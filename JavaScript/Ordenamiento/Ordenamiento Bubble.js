const arreglo = [61, 21, 51, 11, 41, 31];

console.log("---Ordenamiento Bubble---");
console.log("El arreglo original es: " + arreglo.join(" "));

for (let i = 0; i < arreglo.length - 1; i++) {
    for (let j = 0; j < arreglo.length - 1 - i; j++) {
        if (arreglo[j] > arreglo[j + 1]) {
            let temp = arreglo[j];
            arreglo[j] = arreglo[j + 1];
            arreglo[j + 1] = temp;
        }
    }
}

console.log("El arreglo ordenado es: " + arreglo.join(" "));
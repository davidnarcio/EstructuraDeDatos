function quicksort(arreglo, inicio, fin) {
    if (inicio < fin) {
        let pivote = arreglo[fin];
        let i = inicio - 1;
        for (let j = inicio; j < fin; j++) {
            if (arreglo[j] <= pivote) {
                i = i + 1;
                let temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }
        let temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        let posicionPivote = i + 1;
        quicksort(arreglo, inicio, posicionPivote - 1);
        quicksort(arreglo, posicionPivote + 1, fin);
    }
}

const arreglo = [61, 21, 51, 11, 41, 31];

console.log("---Ordenamiento Quicksort---");
console.log("El arreglo original es: " + arreglo.join(" "));

quicksort(arreglo, 0, arreglo.length - 1);

console.log("El arreglo ordenado es: " + arreglo.join(" "));
const arreglo = [61, 21, 51, 11, 41, 31];

console.log("---Ordenamiento por Insercion---");
console.log("El arreglo original es: " + arreglo.join(" "));

for (let i = 1; i < arreglo.length; i++) {
    let actual = arreglo[i];
    let j = i - 1;
    while (j >= 0 && arreglo[j] > actual) {
        arreglo[j + 1] = arreglo[j];
        j = j - 1;
    }
    arreglo[j + 1] = actual;
}

console.log("El arreglo ordenado es: " + arreglo.join(" "));
const arreglo = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

console.log("---Busqueda binaria---");
console.log("El arreglo es: " + arreglo.join(" "));

const numeroBuscado = parseInt(prompt("Que numero quiere buscar?"));

let inicio = 0;
let final = arreglo.length - 1;
let encontrado = false;

while (inicio <= final) {
    const medio = Math.floor((inicio + final) / 2);

    if (arreglo[medio] === numeroBuscado) {
        console.log("El numero esta en el lugar: " + (medio + 1));
        encontrado = true;
        break;
    } else if (numeroBuscado < arreglo[medio]) {
        final = medio - 1;
    } else {
        inicio = medio + 1;
    }
}

if (!encontrado) {
    console.log("El numero no esta en el array");
}
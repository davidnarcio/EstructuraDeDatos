const arreglo = [11, 21, 31, 41, 51, 61];
const nuevoArreglo = [];

console.log("---Eliminacion al final---");
console.log("El arreglo es: " + arreglo.join(" "));

for (let i = 0; i < arreglo.length - 1; i++) {
    nuevoArreglo[i] = arreglo[i];
}

console.log("El nuevo arreglo es: " + nuevoArreglo.join(" "));
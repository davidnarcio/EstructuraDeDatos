const arreglo = [11, 21, 31, 41, 51, 61];
const nuevoArreglo = [];

console.log("---Eliminacion al inicio---");
console.log("El arreglo es: " + arreglo.join(" "));

for (let i = 1; i < arreglo.length; i++) {
    nuevoArreglo[i - 1] = arreglo[i];
}

console.log("El nuevo arreglo es: " + nuevoArreglo.join(" "));
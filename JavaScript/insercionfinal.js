const arreglo = [11, 21, 31, 41, 51, 61];
const nuevoArreglo = [];

console.log("---Insercion al final---");
console.log("El arreglo es: " + arreglo.join(" "));

const numInsertar = parseInt(prompt("Que numero vas a agregar?"));

for (let i = 0; i < arreglo.length; i++) {
    nuevoArreglo[i] = arreglo[i];
}
nuevoArreglo[arreglo.length] = numInsertar;

console.log("El nuevo arreglo es: " + nuevoArreglo.join(" "));
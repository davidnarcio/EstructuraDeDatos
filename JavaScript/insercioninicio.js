const arreglo = [11, 21, 31, 41, 51, 61];
const nuevoArreglo = [];

console.log("---Insercion al inicio---");
console.log("El arreglo es: " + arreglo.join(" "));

const numInsertar = parseInt(prompt("Que numero vas a agregar?"));

nuevoArreglo[0] = numInsertar;
for (let i = 0; i < arreglo.length; i++) {
    nuevoArreglo[i + 1] = arreglo[i];
}

console.log("El nuevo arreglo es: " + nuevoArreglo.join(" "));
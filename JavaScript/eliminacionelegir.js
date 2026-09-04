const arreglo = [11, 21, 31, 41, 51, 61];
const nuevoArreglo = [];

console.log("---Eliminacion a eleccion---");
console.log("El arreglo es: " + arreglo.join(" "));

const posicion = parseInt(prompt("Escribe la posicion del elemento a eliminar (0 a " + (arreglo.length - 1) + "):"));

for (let i = 0; i < posicion; i++) {
    nuevoArreglo[i] = arreglo[i];
}
for (let i = posicion; i < arreglo.length - 1; i++) {
    nuevoArreglo[i] = arreglo[i + 1];
}

console.log("El nuevo arreglo es: " + nuevoArreglo.join(" "));
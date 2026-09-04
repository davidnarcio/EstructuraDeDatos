const arreglo = [11, 21, 31, 41, 51, 61];

console.log("---Busqueda secuencial---");
console.log("El arreglo es: " + arreglo.join(" "));

const numeroBuscado = parseInt(prompt("Que numero quiere buscar?"));
let encontrado = false;

for (let i = 0; i < arreglo.length; i++) {
    if (arreglo[i] === numeroBuscado) {
        console.log("El numero esta en el lugar: " + (i + 1));
        encontrado = true;
        break;
    }
}

if (!encontrado) {
    console.log("El numero no esta en el array");
}
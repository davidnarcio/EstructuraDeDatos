const arreglo = [11, 21, 31, 41, 51, 61];

console.log("---Recorrido inverso---");
let texto = "";
for (let i = arreglo.length - 1; i >= 0; i--) {
    texto += arreglo[i] + " ";
}
console.log("El arreglo al reves es: " + texto);
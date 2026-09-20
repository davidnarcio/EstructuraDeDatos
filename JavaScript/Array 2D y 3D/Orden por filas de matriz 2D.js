const matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

console.log("---Recorrido por filas---");
for (let i = 0; i < matriz.length; i++) {
    let fila = "Fila " + i + ": ";
    for (let j = 0; j < matriz[i].length; j++) {
        fila += matriz[i][j] + " ";
    }
    console.log(fila);
}
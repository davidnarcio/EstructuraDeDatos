const matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

console.log("---Recorrido por columnas---");
for (let j = 0; j < matriz[0].length; j++) {
    let columna = "Columna " + j + ": ";
    for (let i = 0; i < matriz.length; i++) {
        columna += matriz[i][j] + " ";
    }
    console.log(columna);
}
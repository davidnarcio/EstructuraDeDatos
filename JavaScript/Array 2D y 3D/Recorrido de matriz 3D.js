const matriz3d = [
    [[1, 2], [3, 4]],
    [[5, 6], [7, 8]]
];

console.log("---Recorrido de matriz 3D---");
for (let i = 0; i < matriz3d.length; i++) {
    console.log("Capa " + i + ":");
    for (let j = 0; j < matriz3d[i].length; j++) {
        let fila = "";
        for (let k = 0; k < matriz3d[i][j].length; k++) {
            fila += matriz3d[i][j][k] + " ";
        }
        console.log(fila);
    }
}
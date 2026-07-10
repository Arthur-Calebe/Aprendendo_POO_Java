package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    // se for por exemplo um int[][] dias = new int[3][3] cada "espaço" de um array faz ligação com outro array de 3 "posições"
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, Meses
        // 31, 28, 31, 30  Dias
        int[][] dias = new int[3][3];
        //"Criando" uma matriz 3x3 se fosse: new int [4][4] seria uma matriz 4x4
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        /* | 31  28  31 |
           | 31  28  31 |
           | 31  28  31 |

           no caso nessa formatação de arrays eu criei uma matriz 3x3
           na representação de dias[][] é igual a dias[linha][coluna]
        * */

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
                // isso é pra contar em que linha está e em que coluna tb, serve para descobrir o elemento de cada posição da matriz
            }
        }
        System.out.println("___________________________");

        // criando uma variavel de referencia int[] arrBase
        for(int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }

        // calculando determinante de uma matriz 3x3
        int determinante;
        int diagonal1;
        int diagonal2;
        int diagonal3;

        int diagonal4;
        int diagonal5;
        int diagonal6;

        int det;

        diagonal1 = dias[0][0] * dias[1][1] * dias[2][2];
        diagonal2 = dias[0][1] * dias[1][2] * dias[2][0];
        diagonal3 = dias[0][2] * dias[1][0] * dias[2][1];

        diagonal4 = dias[0][2] * dias[1][1] * dias[2][0];
        diagonal5 = dias[0][0] * dias[1][2] * dias[2][1];
        diagonal6 = dias[0][1] * dias[1][0] * dias[2][2];

        det = (diagonal1 + diagonal2 + diagonal3) - (diagonal4 + diagonal5 + diagonal6);
        System.out.println("A determinante é: "+det);
    }
}

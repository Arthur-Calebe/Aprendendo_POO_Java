package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado o valor de um carro dscubra em quantas vezes ele pode ser parcelado
        // Condição é que o valorParcela >= 1000

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela "+ parcela + " R$ "+ valorParcela);
            }else {
                break;
            }
        }
    }
}

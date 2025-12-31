package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra quantas vezes ele pode ser parcelado.
        // Condição, valorParcelado >= 1000
        double valorTotal = 30000;
        for (int parcela=1;parcela<=valorTotal;parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela +" R$ "+valorParcela);
        }
    }
}

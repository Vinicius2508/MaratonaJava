package maratonajava.introducao;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Vinícius";
        String address = "Francisco Affonso de Melo";
        double salary = 4000.55;
        String date = "31/08/2025";

        System.out.println("Eu "+name+", morando no endereço "+address+",");
        System.out.println("Confirmo que recebi o salário de R$"+salary+", na data "+date);
    }
}

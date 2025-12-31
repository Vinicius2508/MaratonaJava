package maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 5500;
        String mensagemDoar = "Eu vou doar 500 para os Dev";
        String mensagemNaoDoar = "Ainda sou pobre";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}

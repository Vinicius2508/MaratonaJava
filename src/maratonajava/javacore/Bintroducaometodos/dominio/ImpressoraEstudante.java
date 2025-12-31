package maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("---------------------");

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade + " anos");
        System.out.println("Sexo: " + estudante.sexo);

        estudante.nome = "Gohan";
    }
}

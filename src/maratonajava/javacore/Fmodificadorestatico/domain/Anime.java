package maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodio = {1, 2, 3, 4, 5, 67, 8, 9, 10, 11, 12};
    // 0 - Bloco de inicialização estático é executado quando a JVM  carregar classe
    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodio = new int[100];
        for (int i = 0; i < episodio.length; i++) {
            episodio[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for (int episodios: Anime.episodio){
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public int[] getEpisodio() {
        return episodio;
    }

    public String getNome() {
        return nome;
    }
}

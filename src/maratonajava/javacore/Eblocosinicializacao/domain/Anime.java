package maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodio = {1, 2, 3, 4, 5, 67, 8, 9, 10, 11, 12};
    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de iniciallização");
        episodio = new int[100];
        for (int i = 0; i < episodio.length; i++) {
            episodio[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for (int episodios: this.episodio){
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

package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        Livro livro = new Livro("Les Miserables (Barnes & Noble Collectible Classics: Omnibus Edition)", 928);

        System.out.println(gato);
        System.out.println(livro);

        /*int a = 5;
        int b = 3;

        System.out.println("Hello World!" + (a + b));*/
    }
}

class Livro {
    private String nome;
    private Integer nunpage;

    public Livro(String nome, Integer nunpage) {
        this.nome = nome;
        this.nunpage = nunpage;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNunpage() {
        return nunpage;
    }

    public void setNunpage(Integer nunpage) {
        this.nunpage = nunpage;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nunpage=" + nunpage +
                '}';
    }
}
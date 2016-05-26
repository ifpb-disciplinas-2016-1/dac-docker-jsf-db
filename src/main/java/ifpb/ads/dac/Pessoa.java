package ifpb.ads.dac;

import java.time.LocalDate;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 20/05/2016, 10:56:34
 */
public class Pessoa {

    private String nome;
    private int idade = -1;
    private LocalDate nascimento;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    
    

}

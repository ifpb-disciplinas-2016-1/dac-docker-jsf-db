package ifpb.ads.dac;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


//import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 20/05/2016, 10:49:01
 */
@Named
@RequestScoped
public class Controlador implements Serializable{
    
    private Pessoa pessoa =  new Pessoa();
    
    private Pessoas servico = new Pessoas();
    
    private List<Pessoa> todos = new ArrayList<>();
    
    public String redirecinar(){
        
        return "home.xhtml";
    }
    public String salvar(){
        servico.salvar(pessoa);
        todos = servico.todos();
        return "home.xhtml";
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> todos() {
        return servico.todos();
//        return todos;
    }    
//
//    public void setTodos(List<Pessoa> todos) {
//        this.todos = todos;
//    }
    
    
    
}

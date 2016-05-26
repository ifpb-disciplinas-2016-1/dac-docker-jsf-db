package ifpb.ads.dac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 20/05/2016, 11:07:28
 */
public class PessoasEmMemoria implements Pessoas {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void salvar(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public List<Pessoa> todos() {
        return pessoas;
    }
}

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
public class Pessoas {

    private Connection connection;
    private String url = "jdbc:postgresql://192.168.99.100:5432/dac-jsf";
    private String senha = "12345";
    private String usuario = "postgres";

    public Pessoas() {
        initConnection();
    }

    private void initConnection() {
        try {
            connection = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(Pessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salvar(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa (nome) values(?)";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, pessoa.getNome());
            prepareStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Pessoas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Pessoa> todos() {
        List<Pessoa> pessoas = new ArrayList<>();
        String sql = "Select * from pessoa;";
        try {

            PreparedStatement prepareStatement = connection.prepareStatement(sql);

            ResultSet result = prepareStatement.executeQuery();

            while (result.next()) {
                pessoas.add(new Pessoa(result.getString("nome")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pessoas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pessoas;
    }
}

package ifpb.ads.dac;

import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/05/2016, 07:41:02
 */
public interface Pessoas {

    public void salvar(Pessoa pessoa);

    public List<Pessoa> todos();

}

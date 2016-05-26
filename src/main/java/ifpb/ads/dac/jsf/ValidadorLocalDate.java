package ifpb.ads.dac.jsf;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException; 

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/05/2016, 08:16:18
 */

@FacesValidator("validator.LocalDate")
public class ValidadorLocalDate implements Validator{

    @Override
    public void validate(FacesContext context, 
            UIComponent component, Object value) 
            throws ValidatorException {
        
        LocalDate date = (LocalDate) value;
        LocalDate dataComparacao = LocalDate.of(1990, 1, 1);
        
        
        if(date.isBefore(dataComparacao)){
            FacesMessage message = new FacesMessage("Data inferior a 1990");
            FacesMessage message2 = new FacesMessage(FacesMessage.SEVERITY_INFO,"Erro",
                    "Mensagem de Erro 3");
            FacesMessage message3 = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro",
                    "Mensagem de Erro 3");
            FacesMessage message4 = new FacesMessage(FacesMessage.SEVERITY_FATAL,"Erro",
                    "Mensagem de Erro 4");
            List<FacesMessage> lista = Arrays.asList(message, message2, message3, message4);
             throw new ValidatorException(lista);
        }
        
    }

}

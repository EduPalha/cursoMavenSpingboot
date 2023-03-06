package resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testeRestes") //padrão é colocar no plural
public class testeRest {

    @RequestMapping(method = RequestMethod.GET)
    public String listar()
    {
        return "Está tudo OK!";
    }
}

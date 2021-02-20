package oppgave1uke7.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class motorController {

    private final List<motorObjekter> heleliste = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(motorObjekter innKunde){
        heleliste.add(innKunde);
    }
    @GetMapping("/hentAlle")
    public List<motorObjekter> hentAlle(){
        return heleliste;
    }
    @GetMapping("/slette")
    public void slette(){
        heleliste.clear();
    }
}
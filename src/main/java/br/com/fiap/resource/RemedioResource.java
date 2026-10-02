package br.com.fiap.resource;

import br.com.fiap.bo.RemedioBO;
import br.com.fiap.to.RemedioTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //dizendo para o Spring que essa classe funcionara como Controller (MVC)
@RequestMapping("/megafarma") //definindo outro endpoint
public class RemedioResource {
    private RemedioBO remedioBO = new RemedioBO();


    @GetMapping //sempre que minha aplicacao receber uma requisisão do metodo get,
    // será executado a lista para a exibição dos remedios presentes
    public ResponseEntity<List<RemedioTO>> findAll(){
        List<RemedioTO> remedios = remedioBO.findAll();
        if (remedios == null) {
            return ResponseEntity.status(HttpStatus.OK).body(remedios); //configurando o retorno com status ok -200- e
            // a lista de remedios encontrados
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(remedios); //configurando o retorno com status Not_found-404- e
            // a lista de remedios encontrados

        }
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody RemedioTO remedio) {
        try {
            RemedioTO  resultado = remedioBO.save(remedio);
            return ResponseEntity.status(HttpStatus.CREATED).body(remedio);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao salvar remédio");
        }
    }

}

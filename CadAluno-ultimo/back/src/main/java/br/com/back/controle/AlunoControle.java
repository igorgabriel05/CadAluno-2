package br.com.back.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.back.dao.AlunoDAO;
import br.com.back.modelo.AlunoModelo;

@RestController
@CrossOrigin("*")
public class AlunoControle {
    
    @Autowired
    AlunoDAO alunoDAO;

    @GetMapping
    public Iterable<AlunoModelo> listar(){
        return alunoDAO.findAll();
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody AlunoModelo alunoModelo){
        return new ResponseEntity<AlunoModelo>(alunoDAO.save(alunoModelo), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> alterar(@RequestBody AlunoModelo alunoModelo){
        return new ResponseEntity<AlunoModelo>(alunoDAO.save(alunoModelo), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Integer id){
        alunoDAO.deleteById(id);
    }
}

package com.example.demo.controllers;

import com.example.demo.constants.Constant;
import com.example.demo.exceptions.ObjetoAlunoNuloException;
import com.example.demo.models.AlunoModel;
import com.example.demo.models.ErrorResponse;
import com.example.demo.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping(Constant.API_ALUNO)
    public ResponseEntity<List<AlunoModel>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(Constant.API_ALUNO + "/{id}")
    public ResponseEntity<Optional<AlunoModel>> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping(Constant.API_ALUNO)
    public ResponseEntity<AlunoModel> createStudent(@RequestBody AlunoModel aluno) {
        AlunoModel newStudent = service.save(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
    }

    @PutMapping(Constant.API_ALUNO)
    public ResponseEntity<?> updateStudent(AlunoModel aluno) {
        try {
            AlunoModel updatedStudent = service.save(aluno);
            return ResponseEntity.ok(updatedStudent);
        } catch (ObjetoAlunoNuloException e) {
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(new ErrorResponse(""));
        }
    }

    @DeleteMapping(Constant.API_ALUNO + "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

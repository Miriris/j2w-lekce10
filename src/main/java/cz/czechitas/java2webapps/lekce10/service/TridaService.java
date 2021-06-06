package cz.czechitas.java2webapps.lekce10.service;


import cz.czechitas.java2webapps.lekce10.entity.Student;
import cz.czechitas.java2webapps.lekce10.entity.Trida;
import cz.czechitas.java2webapps.lekce10.repository.RodicRepository;
import cz.czechitas.java2webapps.lekce10.repository.StudentRepository;
import cz.czechitas.java2webapps.lekce10.repository.TridaRepository;
import cz.czechitas.java2webapps.lekce10.repository.UcitelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TridaService {

    private final TridaRepository tridaRepository;
    private final StudentRepository studentRepository;
    private final UcitelRepository ucitelRepository;
    private final RodicRepository rodicRepository;


    @Autowired
    public TridaService(TridaRepository tridaRepository, StudentRepository studentRepository, UcitelRepository ucitelRepository, RodicRepository rodicRepository) {
        this.tridaRepository = tridaRepository;
        this.studentRepository = studentRepository;
        this.ucitelRepository = ucitelRepository;
        this.rodicRepository = rodicRepository;
    }


    public List<Trida> seznamTrid() {
        return tridaRepository.findAll();
    }
    public Trida jednaTrida(short id) {
        return tridaRepository.getOne(id);
    }

    public Student jedenStudent(Integer id) {
        return studentRepository.getOne(id);
    }



}

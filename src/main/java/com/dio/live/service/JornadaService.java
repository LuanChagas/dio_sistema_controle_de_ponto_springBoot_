package com.dio.live.service;

import java.util.List;
import java.util.Optional;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JornadaService {
    @Autowired
    JornadaRepository jornadaRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long id) {
        return jornadaRepository.findById(id);
    }

    public JornadaTrabalho Updatesave(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void deleteJornada(Long id) {
        jornadaRepository.deleteById(id);
    }

}

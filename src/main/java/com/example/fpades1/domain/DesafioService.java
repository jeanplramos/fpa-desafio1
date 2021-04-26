package com.example.fpades1.domain;

import java.util.List;
import java.util.stream.Collectors;

import com.example.fpades1.domain.dto.ModuloDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesafioService {
    
    @Autowired
    private DesafioRepository rep;

    public List<ModuloDTO> getModulos() {
        
        return rep.findAll().stream().map(ModuloDTO::create).collect(Collectors.toList());
    }

}

package com.example.fpades1.api;

import java.util.List;

import com.example.fpades1.domain.DesafioService;
import com.example.fpades1.domain.dto.ModuloDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DesafioController {

@Autowired
private DesafioService service;

    @GetMapping
    public ResponseEntity<List<ModuloDTO>> get() {

        return ResponseEntity.ok(service.getModulos());
        
    }
}

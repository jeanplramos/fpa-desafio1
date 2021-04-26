package com.example.fpades1.domain.dto;

import com.example.fpades1.domain.Modulo;

import org.modelmapper.ModelMapper;

import lombok.Data;

@Data
public class ModuloDTO {
    private Integer id;
    private String nome;

    public static ModuloDTO create(Modulo modulo) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(modulo, ModuloDTO.class);
    }
}

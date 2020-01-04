package com.lindsayduncan.pokemon.service;


import com.lindsayduncan.pokemon.model.Type;
import com.lindsayduncan.pokemon.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeRepository typeRepository;

    @Override
    public Optional<Type> findByTypeName(String typeName) {
        return typeRepository.findByTypeName(typeName);
    }
}

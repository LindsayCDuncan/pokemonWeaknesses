package com.lindsayduncan.pokemon.service;


import com.lindsayduncan.pokemon.model.Type;
import com.lindsayduncan.pokemon.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeRepository typeRepository;

    @Override
    public Type findByType(String type) {
        return typeRepository.findByType(type);
    }
}

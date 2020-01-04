package com.lindsayduncan.pokemon.service;

import com.lindsayduncan.pokemon.model.Type;

import java.util.Optional;

public interface TypeService {
    Optional<Type> findByTypeName(String typeName);
}

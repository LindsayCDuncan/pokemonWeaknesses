package com.lindsayduncan.pokemon.service;

import com.lindsayduncan.pokemon.model.Pokemon;
import org.bson.types.ObjectId;

import java.util.Optional;

public interface PokemonService {
    Optional<Pokemon> findByName(String name);
    Optional<Pokemon> findByNumber(String number);
    Iterable listAll();
}

package com.lindsayduncan.pokemon.service;

import com.lindsayduncan.pokemon.model.Pokemon;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface PokemonService {
    Optional<Pokemon> findByName(String name);
    Optional<Pokemon> findByNumber(String number);
    Iterable listAll();
    Map<String, Double> calculateWeaknesses(List types);
}

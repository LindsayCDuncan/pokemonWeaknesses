package com.lindsayduncan.pokemon.repository;

import com.lindsayduncan.pokemon.model.Pokemon;
import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PokemonRepository extends CrudRepository<Pokemon, String> {
    Optional<Pokemon> findByName(String name);
    Optional<Pokemon> findByNumber(String number);
}

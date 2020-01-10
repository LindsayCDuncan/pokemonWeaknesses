package com.lindsayduncan.pokemon.repository;

import com.lindsayduncan.pokemon.model.Pokemon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository extends MongoRepository<Pokemon, String> {
    Optional<Pokemon> findByName(String name);
    Optional<Pokemon> findByNumber(String number);

    @Query(value="{'name': {$regex : ?0, $options: 'i'}}")
    Iterable<Pokemon> findByNameRegex(String name);
}

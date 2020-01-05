package com.lindsayduncan.pokemon.repository;

import com.lindsayduncan.pokemon.model.Type;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TypeRepository extends MongoRepository<Type, String> {
    Type findByType(String type);
}

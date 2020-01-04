package com.lindsayduncan.pokemon.service;

import com.lindsayduncan.pokemon.model.Pokemon;
import com.lindsayduncan.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PokemonServiceImp implements PokemonService{
    @Autowired
    private PokemonRepository repository;

    @Override
    public Optional<Pokemon> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Optional<Pokemon> findByNumber(String number) {
        return repository.findByNumber(number);
    }

    @Override
    public Iterable listAll() {
        return repository.findAll();
    }
}

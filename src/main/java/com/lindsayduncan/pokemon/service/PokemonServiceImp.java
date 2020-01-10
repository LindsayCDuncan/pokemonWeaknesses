package com.lindsayduncan.pokemon.service;

import com.lindsayduncan.pokemon.model.Pokemon;
import com.lindsayduncan.pokemon.model.Type;
import com.lindsayduncan.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class PokemonServiceImp implements PokemonService{
    @Autowired
    private PokemonRepository repository;

    @Autowired
    private TypeService typeService;

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

    public Map<String, Double> calculateWeaknesses(List types){
        Map<String, Double> weaknessMap = new HashMap<>();

        // convert object type to string
        // find type in repository
        // get map from type
        for(Object type: types){
            String typeName = type.toString().toLowerCase();
            Type pokeType = typeService.findByType(typeName);

            if(weaknessMap.isEmpty()){
                weaknessMap.putAll(pokeType.getWeaknesses().weaknessAsMap());
            }

            else{
                //multiply weaknesses
                weaknessMap.put("normal", weaknessMap.get("normal") * pokeType.getWeaknesses().weaknessAsMap().get("normal"));
                weaknessMap.put("fire", weaknessMap.get("fire") * pokeType.getWeaknesses().weaknessAsMap().get("fire"));
                weaknessMap.put("water", weaknessMap.get("water") * pokeType.getWeaknesses().weaknessAsMap().get("water"));
                weaknessMap.put("electric", weaknessMap.get("electric") * pokeType.getWeaknesses().weaknessAsMap().get("electric"));
                weaknessMap.put("grass", weaknessMap.get("grass") * pokeType.getWeaknesses().weaknessAsMap().get("grass"));
                weaknessMap.put("ice", weaknessMap.get("ice") * pokeType.getWeaknesses().weaknessAsMap().get("ice"));
                weaknessMap.put("fighting", weaknessMap.get("fighting") * pokeType.getWeaknesses().weaknessAsMap().get("fighting"));
                weaknessMap.put("poison", weaknessMap.get("poison") * pokeType.getWeaknesses().weaknessAsMap().get("poison"));
                weaknessMap.put("ground", weaknessMap.get("ground") * pokeType.getWeaknesses().weaknessAsMap().get("ground"));
                weaknessMap.put("flying", weaknessMap.get("flying") * pokeType.getWeaknesses().weaknessAsMap().get("flying"));
                weaknessMap.put("psychic", weaknessMap.get("psychic") * pokeType.getWeaknesses().weaknessAsMap().get("psychic"));
                weaknessMap.put("bug", weaknessMap.get("bug") * pokeType.getWeaknesses().weaknessAsMap().get("bug"));
                weaknessMap.put("rock", weaknessMap.get("rock") * pokeType.getWeaknesses().weaknessAsMap().get("rock"));
                weaknessMap.put("ghost", weaknessMap.get("ghost") * pokeType.getWeaknesses().weaknessAsMap().get("ghost"));
                weaknessMap.put("dragon", weaknessMap.get("dragon") * pokeType.getWeaknesses().weaknessAsMap().get("dragon"));
                weaknessMap.put("dark", weaknessMap.get("dark") * pokeType.getWeaknesses().weaknessAsMap().get("dark"));
                weaknessMap.put("steel", weaknessMap.get("steel") * pokeType.getWeaknesses().weaknessAsMap().get("steel"));
                weaknessMap.put("fairy", weaknessMap.get("fairy") * pokeType.getWeaknesses().weaknessAsMap().get("fairy"));
            }
        }

        return weaknessMap;
    }

    @Override
    public Iterable<Pokemon> findByNameRegex(String name) {
        return repository.findByNameRegex(name);
    }
}

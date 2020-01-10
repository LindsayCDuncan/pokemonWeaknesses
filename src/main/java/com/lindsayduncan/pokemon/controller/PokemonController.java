package com.lindsayduncan.pokemon.controller;

import com.lindsayduncan.pokemon.exceptions.PokemonNotFoundException;
import com.lindsayduncan.pokemon.model.Pokemon;
import com.lindsayduncan.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/pokemon")
public class PokemonController {
    @Autowired
    private PokemonService service;

    @GetMapping("/")
    public String getAllPokemon(Model model){
        model.addAttribute("pokemons", service.listAll());
        return "pokemon-list";
    }

    @GetMapping("/name")
    public String getPokemonByName(@RequestParam("name") String name, Model model){
        Optional<Pokemon> pokeTry = service.findByName(name);
        if(pokeTry.isPresent()){
            Pokemon pokemon = pokeTry.get();
            Map<String, Double> weaknessMap = service.calculateWeaknesses(pokemon.getTypes());
            model.addAttribute("pokemon", pokemon);
            model.addAttribute("weaknessMap", weaknessMap);
            return "pokemon-data";
        }

        model.addAttribute("pokeList", service.findByNameRegex(name));
        return "pokemon-results";
    }


    @GetMapping("/number")
    public String getPokemonByNumber(@RequestParam("number") String number, Model model){
        Pokemon pokemon = service.findByNumber(number)
                .orElseThrow(PokemonNotFoundException::new);
        Map<String, Double> weaknessMap = service.calculateWeaknesses(pokemon.getTypes());
        model.addAttribute("pokemon", pokemon);
        model.addAttribute("weaknessMap", weaknessMap);
        return "pokemon-data";
    }

}

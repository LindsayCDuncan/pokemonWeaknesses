package com.lindsayduncan.pokemon.controller;

import com.lindsayduncan.pokemon.exceptions.PokemonNotFoundException;
import com.lindsayduncan.pokemon.model.Pokemon;
import com.lindsayduncan.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
        Pokemon pokemon = service.findByName(name)
                .orElseThrow(PokemonNotFoundException::new);
        Map<String, Double> weaknessMap = service.calculateWeaknesses(pokemon.getTypes());
        model.addAttribute("pokemon", pokemon);
        model.addAttribute("weaknessMap", weaknessMap);
        return "pokemon-data";
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

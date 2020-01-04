package com.lindsayduncan.pokemon.controller;

import com.lindsayduncan.pokemon.exceptions.PokemonNotFoundException;
import com.lindsayduncan.pokemon.model.Pokemon;
import com.lindsayduncan.pokemon.service.PokemonService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("pokemon", pokemon);
        return "pokemon-data";
    }

    @GetMapping("/number")
    public String getPokemonByNumber(@RequestParam("number") String number, Model model){
        Pokemon pokemon = service.findByNumber(number)
                .orElseThrow(PokemonNotFoundException::new);
        model.addAttribute("pokemon", pokemon);
        return "pokemon-data";
    }

}

package com.lindsayduncan.pokemon.exceptions;

public class PokemonNotFoundException extends RuntimeException{
    public PokemonNotFoundException(){
        super();
    }

    public PokemonNotFoundException(final String message, final Throwable cause){
        super(message, cause);
    }

    public PokemonNotFoundException(final String message){
        super(message);
    }

    public PokemonNotFoundException(final Throwable cause){
        super(cause);
    }
}

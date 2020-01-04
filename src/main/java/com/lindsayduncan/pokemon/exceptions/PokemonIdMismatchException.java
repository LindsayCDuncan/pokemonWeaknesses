package com.lindsayduncan.pokemon.exceptions;

public class PokemonIdMismatchException extends RuntimeException {
    public PokemonIdMismatchException(){
        super();
    }

    public PokemonIdMismatchException(final String message, final Throwable cause){
        super(message, cause);
    }

    public PokemonIdMismatchException(final String message){
        super(message);
    }

    public PokemonIdMismatchException(final Throwable cause){
        super(cause);
    }
}

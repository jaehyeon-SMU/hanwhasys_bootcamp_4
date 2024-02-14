package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQulifier")
public class PokemonService {

//    @Autowired
//    @Qualifier("pikachu")           //PRIMARY를 무시하고 먼저 지정할 수 있다.(primary는 디폴트로 두고 더 우선순위로 무언가를 받고 싶을때 사용)
    private Pokemon pokemon;

    @Autowired
    public PokemonService(@Qualifier("pikachu") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }

}

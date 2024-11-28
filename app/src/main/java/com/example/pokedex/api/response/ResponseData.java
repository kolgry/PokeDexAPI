package com.example.pokedex.api.response;

import java.io.Serializable;
import java.util.List;

public class ResponseData implements Serializable {

    private List<Card> cards;

    public List<Card> getCards() {
        return cards;
    }
}

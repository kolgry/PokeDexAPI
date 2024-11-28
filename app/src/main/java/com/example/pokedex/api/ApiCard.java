package com.example.pokedex.api;

import com.example.pokedex.api.endpoint.PokemonCardEndPoint;
import com.example.pokedex.api.response.ResponseData;
import retrofit2.Callback;

public class ApiCard {
    public static void getCards(int countCards, Callback<ResponseData> callback) {
        ApiClient.getClient().create(PokemonCardEndPoint.class).getCards(countCards).enqueue(callback);
    }
}

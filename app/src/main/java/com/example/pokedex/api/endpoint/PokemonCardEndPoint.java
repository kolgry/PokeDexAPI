package com.example.pokedex.api.endpoint;

import com.example.pokedex.api.response.ResponseData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokemonCardEndPoint {
    @GET("v1/cards")
    Call<ResponseData> getCards(@Query("count") int count);
}

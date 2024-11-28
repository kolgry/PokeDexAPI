package com.example.pokedex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pokedex.api.ApiCard;
import com.example.pokedex.api.response.Card;
import com.example.pokedex.api.response.ResponseData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ListView listViewPokemons;
    private List<Card> cardList = new ArrayList<Card>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPokemons = findViewById(R.id.listViewPokemons);

        Toast.makeText(MainActivity.this, "Loading... ", Toast.LENGTH_LONG).show();

        ApiCard.getCards(20, new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                if (response.isSuccessful() && response.body() != null) {
                    cardList = response.body().getCards();
                    List<String> pokemonNames = new ArrayList<String>();
                    for (Card c : cardList) {
                        pokemonNames.add(c.getName());
                    }
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>
                                                            (
                                                                    MainActivity.this,
                                                                    android.R.layout.simple_list_item_1,
                                                                    pokemonNames
                                                            );
                    listViewPokemons.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error: " +t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        listViewPokemons.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Card c = cardList.get(position);
                Intent intent = new Intent(MainActivity.this, PokemonDetailActivity.class);
                intent.putExtra("imageUrl", c.getImageUrl());
                intent.putExtra("name", c.getName());
                intent.putExtra("hp", c.getHp());
                intent.putExtra("nationalPOkedexNumber", c.getNationalPokedexNumber());
                startActivity(intent);
            }
        });
    }
}
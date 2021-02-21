package com.baran.spacexapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.baran.spacexapp.adapters.RocketsAdapter;
import com.baran.spacexapp.models.RocketsModel;
import com.baran.spacexapp.restApi.ManagerAll;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<RocketsModel> rocketsList;
    RocketsAdapter rocketsAdapter;
    LinearLayout activity_main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main = findViewById(R.id.activity_main);
        listView = findViewById(R.id.listView);

        getRocketsList();
        rocketDetail();

    }

    private void getRocketsList() {
        final Call<List<RocketsModel>> call = ManagerAll.getInstance().getRockets();
        rocketsList = new ArrayList<>();
        call.enqueue(new Callback<List<RocketsModel>>() {
            @Override
            public void onResponse(Call<List<RocketsModel>> call, Response<List<RocketsModel>> response) {
                if (response.isSuccessful()) {
                    rocketsList = response.body();
                    Log.i("response getRocketsList onResponse ", response.body().toString());
                    rocketsAdapter = new RocketsAdapter(rocketsList, MainActivity.this);
                    listView.setAdapter(rocketsAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<RocketsModel>> call, Throwable t) {
                Log.i("response getRocketsList onFailure ", t.getMessage());

            }
        });

    }

    private void rocketDetail() {

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, RocketActivity.class);
                intent.putExtra("rocket_id", rocketsList.get(position).getRocket_id());
                startActivity(intent);
                overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Animation slide_up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        activity_main.startAnimation(slide_up);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Animation slide_down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        activity_main.startAnimation(slide_down);
    }
}
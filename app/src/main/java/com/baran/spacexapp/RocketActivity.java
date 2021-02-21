package com.baran.spacexapp;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.baran.spacexapp.adapters.ImageSliderAdapter;
import com.baran.spacexapp.models.RocketModel;
import com.baran.spacexapp.restApi.ManagerAll;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RocketActivity extends AppCompatActivity {

    TextView rocket_detail_id,rocket_detail_active,rocket_detail_stages,rocket_detail_boosters,rocket_detail_cost_per_launch,
            rocket_detail_success_rate_pct,rocket_detail_first_flight,rocket_detail_country,rocket_detail_company,
            rocket_detail_height_meters,rocket_detail_height_feet,rocket_detail_rocket_id,rocket_detail_rocket_name,
            rocket_detail_rocket_type,rocket_detail_description,rocket_detail_height_wikipedia;
    SliderView imageSlider;
    String rocketId;
    String[] flickr_images;
    LinearLayout activity_rocket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocket);

        Bundle bundle = getIntent().getExtras();
        rocketId = bundle.getString("rocket_id", null);

        createComponents();
        getRocketDetail(rocketId);

    }

    private void createComponents(){

        activity_rocket = findViewById(R.id.activity_rocket);

        imageSlider = findViewById(R.id.imageSlider);
        rocket_detail_id = findViewById(R.id.rocket_detail_id);
        rocket_detail_active = findViewById(R.id.rocket_detail_active);
        rocket_detail_stages = findViewById(R.id.rocket_detail_stages);
        rocket_detail_boosters = findViewById(R.id.rocket_detail_boosters);
        rocket_detail_cost_per_launch = findViewById(R.id.rocket_detail_cost_per_launch);
        rocket_detail_success_rate_pct = findViewById(R.id.rocket_detail_success_rate_pct);
        rocket_detail_first_flight = findViewById(R.id.rocket_detail_first_flight);
        rocket_detail_country = findViewById(R.id.rocket_detail_country);
        rocket_detail_company = findViewById(R.id.rocket_detail_company);
        rocket_detail_height_meters = findViewById(R.id.rocket_detail_height_meters);
        rocket_detail_height_feet = findViewById(R.id.rocket_detail_height_feet);
        rocket_detail_rocket_id = findViewById(R.id.rocket_detail_rocket_id);
        rocket_detail_rocket_name = findViewById(R.id.rocket_detail_rocket_name);
        rocket_detail_rocket_type = findViewById(R.id.rocket_detail_rocket_type);
        rocket_detail_description = findViewById(R.id.rocket_detail_description);
        rocket_detail_height_wikipedia = findViewById(R.id.rocket_detail_height_wikipedia);

    }

    private void getRocketDetail(String rocketId) {

        final Call<RocketModel> istek = ManagerAll.getInstance().getRocket(rocketId);

        istek.enqueue(new Callback<RocketModel>() {
            @Override
            public void onResponse(Call<RocketModel> call, Response<RocketModel> response) {
                if (response.isSuccessful()) {

                    showRocketDetails(response.body());

                    flickr_images = response.body().getFlickr_images();
                    List<String> flickrImagesList = new ArrayList<>(Arrays.asList(flickr_images));
                    imageSlider.setSliderAdapter(new ImageSliderAdapter(RocketActivity.this, flickrImagesList));
                    imageSlider.setIndicatorAnimation(IndicatorAnimationType.SLIDE);
                    imageSlider.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
                    Log.i("response onResponse", response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<RocketModel> call, Throwable t) {
                Log.i("response getRocketDetail onFailure ", t.getLocalizedMessage());

            }
        });

    }

    private void showRocketDetails(final RocketModel rocketModel){

        rocket_detail_id.setText("Id: "+rocketModel.getId());
        rocket_detail_active.setText("Rocket Model: "+rocketModel.getActive());
        rocket_detail_stages.setText("Rocket Stages: "+rocketModel.getStages());
        rocket_detail_boosters.setText("Rocket Boosters: "+rocketModel.getBoosters());
        rocket_detail_cost_per_launch.setText("Rocket CostPerLaunc: "+rocketModel.getCost_per_launc());
        rocket_detail_success_rate_pct.setText("Rocket SuccessRatePtc: "+rocketModel.getSuccess_rate_ptc());
        rocket_detail_first_flight.setText("Rocket FirstFlight: "+rocketModel.getFirst_flight());
        rocket_detail_country.setText("Rocket Country: "+rocketModel.getCuontry());
        rocket_detail_company.setText("Rocket Company: "+rocketModel.getCompany());
        rocket_detail_height_meters.setText("Rocket HeightMeters: "+rocketModel.getHeight().getMeters());
        rocket_detail_height_feet.setText("Rocket HeightFeet: "+rocketModel.getHeight().getFeet());
        rocket_detail_rocket_id.setText("Rocket Id: "+rocketModel.getRocket_id());
        rocket_detail_rocket_name.setText("Rocket Name: "+rocketModel.getRocket_name());
        rocket_detail_rocket_type.setText("Rocket Type: "+rocketModel.getRocket_type());
        rocket_detail_description.setText("Rocket Description: "+rocketModel.getDescription());
        rocket_detail_height_wikipedia.setText("Rocket Wikipedia Url: "+rocketModel.getWikipedia());

        rocket_detail_height_wikipedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goWebsite(rocketModel.getWikipedia());
            }
        });

    }

    private void goWebsite( String inURL ) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( inURL ) );
        startActivity( browse );
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_in_ters, R.anim.anim_out_ters);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Animation slide_up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        activity_rocket.startAnimation(slide_up);
    }


}
package com.baran.spacexapp.restApi;



import com.baran.spacexapp.models.LaunchesModel;
import com.baran.spacexapp.models.RocketModel;
import com.baran.spacexapp.models.RocketsModel;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;


public interface RestApi {

    // GET 'https://api.spacexdata.com/v3/rockets'
    @GET("rockets")
    Call<List<RocketsModel>> getRockets();


    @GET("rockets/{rocket_id}")
    Call<RocketModel> getRocket(@Path("rocket_id") String rocket_id);

}

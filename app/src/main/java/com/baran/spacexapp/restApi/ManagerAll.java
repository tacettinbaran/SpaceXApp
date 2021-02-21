package com.baran.spacexapp.restApi;


import com.baran.spacexapp.models.LaunchesModel;
import com.baran.spacexapp.models.RocketModel;
import com.baran.spacexapp.models.RocketsModel;
import retrofit2.Call;

import java.util.List;

public class ManagerAll extends BaseManager {


    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance() {
        return ourInstance;
    }

    public Call<List<RocketsModel>> getRockets() {
        Call<List<RocketsModel>> call = getRestApiClient().getRockets();
        return call;
    }


    public Call<RocketModel> getRocket(String rocket_id) {
        Call<RocketModel> call = getRestApiClient().getRocket(rocket_id);
        return call;
    }

}


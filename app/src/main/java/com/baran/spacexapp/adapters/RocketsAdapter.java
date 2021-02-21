package com.baran.spacexapp.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.baran.spacexapp.R;
import com.baran.spacexapp.models.RocketsModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RocketsAdapter extends BaseAdapter {
    List<RocketsModel> rocketsModelList;
    Context context;

    public RocketsAdapter(List<RocketsModel> rocketList, Context context) {
        this.rocketsModelList = rocketList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return rocketsModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return rocketsModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.rockets_adapter_layout, parent, false);

        ImageView rocketImageView;
        TextView rocketIdTextView, rocketNameTextView, rocketTypeTextView;
        String[] flickerImages = rocketsModelList.get(position).getFlickr_images();

        rocketImageView = convertView.findViewById(R.id.rocket_image);
        rocketIdTextView = convertView.findViewById(R.id.rocket_id);
        rocketNameTextView = convertView.findViewById(R.id.rocket_name);
        rocketTypeTextView = convertView.findViewById(R.id.rocket_type);

        rocketIdTextView.setText("Rocket Id : " +rocketsModelList.get(position).getRocket_id());
        rocketNameTextView.setText("Rocket Name: " +rocketsModelList.get(position).getRocket_name());
        rocketTypeTextView.setText("Rocket Type : " +rocketsModelList.get(position).getRocket_type());
       Picasso.with(context).load(flickerImages[0]).resize(100,100).into(rocketImageView);

        return convertView;
    }
}

package com.example.jsonparsing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private final Context context;
    private final ArrayList<Earthquake> earthquake;

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> list ){
        super(context, R.layout.listrow, list);
        this.context = context;
        this.earthquake = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View rowView, @NonNull ViewGroup parent) {

        if(rowView== null){
            rowView = LayoutInflater.from(context).inflate(R.layout.listrow, parent , false);
        }
        TextView magnitude = rowView.findViewById(R.id.magnitude);
        TextView place = rowView.findViewById(R.id.place);
        TextView time = rowView.findViewById(R.id.time);

        magnitude.setText(earthquake.get(position).getmMagnitude()+ "");
        place.setText(earthquake.get(position).getmPlace()+ "");

        time.setText(earthquake.get(position).getmTime()+ "");

        return rowView;
    }
}

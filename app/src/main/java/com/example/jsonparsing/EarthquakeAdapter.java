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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private final Context context;
    private final ArrayList<Earthquake> earthquake;

    // Constructor for EarthquakeAdapter

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> list ){
        super(context, R.layout.listrow, list);
        this.context = context;
        this.earthquake = list;
    }

    /*
        Overriding getView Funtion
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View rowView, @NonNull ViewGroup parent) {


        // to check if no view is present , then inflate the view
        //Using the view layout we made
        if(rowView== null){
            rowView = LayoutInflater.from(context).inflate(R.layout.listrow, parent , false);
        }


        //finding view by id magnitude
        // displaying the magnitude

        TextView magnitude = rowView.findViewById(R.id.magnitude);
        magnitude.setText(earthquake.get(position).getmMagnitude()+ "");


        //finding view by id place
        // displaying the text

        TextView place = rowView.findViewById(R.id.place);
        place.setText(earthquake.get(position).getmPlace()+ "");


        // Creating a date object from the earthquake list

        Date dateObject = new Date(earthquake.get(position).getmTime());

        //find the view of id time
        //format the time
        //display the time in the textview
        TextView time = rowView.findViewById(R.id.time);
        String formattedTime = formatTime(dateObject);
        time.setText(formattedTime);

        //find the view of id date
        //format the date
        //display the date in the textview
        TextView date = rowView.findViewById(R.id.date);
        String formattedDate = formatDate(dateObject);
        date.setText(formattedDate);


        // return the  view of the list to be displayed

        return rowView;
    }

    /*
         Creating a function to convert the date object into desired format of date using SimpleDateFormat
     */
    public String formatDate(Date dateObject){
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /*
         Creating a function to convert the date object into desired format of time using SimpleDateFormat
     */

    public String formatTime(Date dateObject){
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a ");
       return timeFormat.format(dateObject);
    }

}

package fr.wildcodeschool.blablawild2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ItineraryRecyclerAdapter extends RecyclerView.Adapter<ItineraryRecyclerAdapter.ViewHolder> {

    private ArrayList<ItineraryModel> itineraries;

    public ItineraryRecyclerAdapter(ArrayList<ItineraryModel> itineraries) {
        this.itineraries = itineraries;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_itinerary, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItineraryModel itineraryModel = itineraries.get(position);
        holder.driver.setText(itineraryModel.getDriver());
        holder.date.setText(itineraryModel.getDate().toString());
        holder.price.setText(String.valueOf(itineraryModel.getPrice()));
    }


    @Override
    public int getItemCount() {
        return itineraries.size();
    }

    protected ItineraryModel getItemAt(int position){
        return itineraries.get(position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView date, driver, price;

        public ViewHolder(View v) {
            super(v);
            this.date = v.findViewById(R.id.tv_date);
            this.driver = v.findViewById(R.id.tv_driver);
            this.price = v.findViewById(R.id.tv_price);
        }
    }

}

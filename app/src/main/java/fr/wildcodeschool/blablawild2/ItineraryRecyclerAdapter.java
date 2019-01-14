package fr.wildcodeschool.blablawild2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ItineraryRecyclerAdapter extends RecyclerView.Adapter {

    private ArrayList<ItineraryModel> itineraries;

    public ItineraryRecyclerAdapter(ArrayList<ItineraryModel> itineraries) {
        itineraries = itineraries;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // TODO : associer le layout utilisé par un item
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // TODO : action à l'affichage d'un item
    }

    @Override
    public int getItemCount() {
        return itineraries.size();
    }
}

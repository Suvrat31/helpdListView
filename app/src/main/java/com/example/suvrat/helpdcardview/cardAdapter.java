package com.example.suvrat.helpdcardview;
import java.util.List;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class cardAdapter extends RecyclerView.Adapter<cardAdapter.cardViewHolder>{


    //this context we will use to inflate the layout
    private Context mCtx;

    //We are storing all the products in a list
    private List<cards> cardsList;


    //getting the context and product list with the constructor
    public cardAdapter(Context mCtx,List<cards> cardsList){
        this.mCtx= mCtx;
        this.cardsList= cardsList;
    }

    @Override
    public cardViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
      //inflating and returning our view holder
      LayoutInflater inflater = LayoutInflater.from(mCtx);
      View view = inflater.inflate(R.layout.layout_cards, null);

      return new cardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(cardViewHolder holder, int position){
        //getting the product of the specified position
        cards card = cardsList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(card.getTitle());
        holder.textViewShortDesc.setText(card.getShortdesc());
        holder.textViewRating.setText(String.valueOf(card.getRating()));
        holder.textViewPrice.setText(String.valueOf(card.getPrice()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(card.getImage()));


    }

    @Override
    public int getItemCount(){
        return  cardsList.size();
    }

    class cardViewHolder extends RecyclerView.ViewHolder{

        TextView textViewTitle, textViewShortDesc,textViewRating,textViewPrice;
        ImageView imageView;

        public cardViewHolder(View itemView){
            super(itemView);

            textViewTitle= itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc= itemView.findViewById(R.id.textViewShortDesc);
            textViewRating= itemView.findViewById(R.id.textViewRating);
            textViewPrice= itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }


}

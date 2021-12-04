package com.example.recipeapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyHolder> {

    private Context mContext;
    private List<Recipes> mData;

    public ListAdapter(Context mContext, List<Recipes> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cardview_item,viewGroup,false);
        return  new MyHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, final int i) {

        myHolder.recipeTitle.setText(mData.get(i).getRecipeName());
        myHolder.img_recipe_thumbnail.setImageResource(mData.get(i).getImage());
        myHolder.des.setText(mData.get(i).getDes());

        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,RecipeDetailActivity.class);

                intent.putExtra("RecipeName",mData.get(i).getRecipeName());
                intent.putExtra("RecipeIngredients",mData.get(i).getIngredients());
                intent.putExtra("RecipeMethodTitle",mData.get(i).getRecipeMethodTitle());
                intent.putExtra("Recipe",mData.get(i).getRecipe());
                intent.putExtra("Thumbnail",mData.get(i).getImage());

                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView recipeTitle;
        TextView des;
        ImageView img_recipe_thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            recipeTitle = itemView.findViewById(R.id.recipe_text);
            img_recipe_thumbnail =itemView.findViewById(R.id.recipe_img_id);
            des= itemView.findViewById(R.id.textDes);

        }

    }
}

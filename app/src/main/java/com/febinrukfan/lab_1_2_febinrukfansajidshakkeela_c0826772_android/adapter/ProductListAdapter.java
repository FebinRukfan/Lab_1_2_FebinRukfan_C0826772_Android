package com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.adapter;// Created by FebinRukfan on 10-02-2022.

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.ProdutInfoActivity;
import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.R;
import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.databinding.ActivityProductListBinding;
import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.model.Product;

import java.util.ArrayList;

public class ProductListAdapter<T> extends RecyclerView.Adapter<ProductListAdapter<T>.ViewHolder> {

    // variables
    private ArrayList<Product> productsList;
    private Activity context;
    private ActivityProductListBinding binding;

    public ProductListAdapter(Activity context, ArrayList<Product> list,ActivityProductListBinding binding){
        this.productsList = list;
        this.context = context;
        this.binding = binding;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {




        holder.title.setText(productsList.get(position).getProductName());
        holder.price.setText("$ "+productsList.get(position).getProductPrice());
        // edit button click
        holder.btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ProdutInfoActivity.class);
                i.putExtra("value","edit" );

                i.putExtra("id",String.valueOf(productsList.get(position).getId()) );
                context.startActivity(i);

            }
        });
        // delete button click
        holder.btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return productsList.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title, price;
        ImageView btn_edit, btn_delete;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            price = itemView.findViewById(R.id.price);
            btn_edit = itemView.findViewById(R.id.edit_btn);
            btn_delete = itemView.findViewById(R.id.delete_btn);
        }
    }
}
package com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.model;// Created by FebinRukfan on 10-02-2022.

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.data.ProductRepository;

import java.util.List;

public class ProductViewModel extends AndroidViewModel {

    private ProductRepository repository;
    private final LiveData<List<Product>> allProducts;

    public ProductViewModel(@NonNull Application application) {
        super(application);

        repository = new ProductRepository(application);
        allProducts = repository.getAllEmployees();
    }

    public LiveData<List<Product>> getFirst() {return allProducts;}

    public void insert(Product product) {repository.insert(product);}
}
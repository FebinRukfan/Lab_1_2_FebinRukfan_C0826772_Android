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
        allProducts = repository.getAllProducts();
    }

    public LiveData<List<Product>> getFirstProduct() {return repository.getFirstProduct();}
    public LiveData<List<Product>> getAllProduct() {return allProducts;}
    public void update(int id, String name, String desc, Double price, Double lat, Double lon) {repository.update(id,name,desc,price,lat,lon);}

    public void insert(Product product) {repository.insert(product);}
}

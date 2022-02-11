package com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.data;// Created by FebinRukfan on 10-02-2022.

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.db.ProductRoomDb;
import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.model.Product;

import java.util.List;

public class ProductRepository {

    private String TAG = this.getClass().getName();
    private ProductDao productDao;
    private LiveData<List<Product>> allProducts;

    public ProductRepository(Application application) {
        ProductRoomDb db = ProductRoomDb.getInstance(application);
        productDao = db.productDao();
        allProducts = productDao.getAllProducts();
    }

    public LiveData<List<Product>> getAllProducts() {
        return allProducts;
    }


    public LiveData<List<Product>> getFirstProduct() {
        return productDao.getFirstProduct();
    }

    public void insert(Product product) {

        ProductRoomDb.databaseWriteExecutor.execute(() -> productDao.insert(product));
    }


    public void update(int id, String name, String desc, Double price, Double lat, Double lon) {

        ProductRoomDb.databaseWriteExecutor.execute(() -> productDao.update(id,name,desc,price,lat,lon));

    }

    public LiveData<List<Product>> getProductByID(int id) {
        return productDao.getProductById(id);

    }
}

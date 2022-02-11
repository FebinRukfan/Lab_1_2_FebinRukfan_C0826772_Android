package com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.data;// Created by FebinRukfan on 10-02-2022.


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.model.Product;

import java.util.List;


@Dao
public abstract class ProductDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public abstract void insert(Product product);

    @Query("SELECT * FROM product_table ORDER BY product_name ASC")
    public abstract LiveData<List<Product>> getAllProducts();

    @Query("SELECT * FROM product_table ORDER BY product_id ASC limit 1")
    public abstract LiveData<List<Product>> getFirstProduct();

    @Query("DELETE FROM product_table")
    public abstract void deleteAll();


}

package com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.databinding.ActivityProductInfoBinding;
import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.model.Product;
import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.model.ProductViewModel;

import java.util.Arrays;
import java.util.List;


public class ProdutInfoActivity extends AppCompatActivity {

    private ProductViewModel productViewModel;
    private String TAG = this.getClass().getName();

    private ActivityProductInfoBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info);

        binding = binding.inflate(getLayoutInflater());

        // initializing ViewModel
        productViewModel = new ViewModelProvider.AndroidViewModelFactory(this.getApplication())
                .create(ProductViewModel.class);


        if(binding.etPname.getText().toString().isEmpty()){
            addDemoProducts();
        }else {
            showProductInfo();
        }

    }

    private void showProductInfo() {
        productViewModel.getAllProducts().observe(this, products -> {
            if (products != null) {

            }
        });
    }

    private void addDemoProducts() {

        Product product = new Product();
        product.setProductName("Milk");
        product.setProductDesc("Milk is essentially an emulsion of fat and protein in water, along with dissolved sugar (carbohydrate), minerals, and vitamins. ... Lactose, or milk sugar, is broken down into simpler digestible sugars by the enzyme lactase, which is produced in the intestine of infants.\n");
        product.setProductPrice(10.00);
        product.setProviderLat(43.809983930714225);
        product.setProviderLong(43.809983930714225);

        productViewModel.insert(product);

        product.setProductName("Coke");
        product.setProductDesc("Cola is a carbonated soft drink flavored with vanilla, cinnamon, citrus oils and other flavorings.");
        product.setProductPrice(5.00);
        product.setProviderLat(43.809983930714225);
        product.setProviderLong(43.809983930714225);

        productViewModel.insert(product);

        product.setProductName("Cocunut water");
        product.setProductDesc("It's made up of about 94% water, 4% sugars, 1% fiber, and has less than 1% protein, fat, and other chemicals. The other chemicals include vitamins, minerals (including the electrolytes sodium and potassium), and plant hormones like cytokinins (that may benefit the body in various ways)");
        product.setProductPrice(15.00);
        product.setProviderLat(43.809983930714225);
        product.setProviderLong(43.809983930714225);

        productViewModel.insert(product);

        product.setProductName("Hamburger");
        product.setProductDesc(" A hamburger is a sandwich consisting of a cooked meat patty on a bun or roll. You can order a hamburger, fries, and a shake at most fast food restaurants. Hamburgers are traditionally made with ground beef and served with onions, tomatoes, lettuce, ketchup, and other garnishes.)");
        product.setProductPrice(5.00);
        product.setProviderLat(43.809983930714225);
        product.setProviderLong(43.809983930714225);

        productViewModel.insert(product);

        product.setProductName("Sanwich");
        product.setProductDesc(" Sandwich, in its basic form, slices of meat, cheese, or other food placed between two slices of bread. ... Any type of roll or bread and any type of food that can be conveniently so eaten can go into a sandwich, hot or cold.");
        product.setProductPrice(4.00);
        product.setProviderLat(43.809983930714225);
        product.setProviderLong(43.809983930714225);

        productViewModel.insert(product);

        product.setProductName("Cutlet");
        product.setProductDesc("a small, thin slice of meat. : chopped vegetables, nuts, etc., that are pressed together into a flat shape, covered with bread crumbs, and fried in oil.");
        product.setProductPrice(1.30);
        product.setProviderLat(43.809983930714225);
        product.setProviderLong(43.809983930714225);

        productViewModel.insert(product);

        product.setProductName("French Fries");
        product.setProductDesc("A thin strip of potato, usually cut 3 to 4 inches in length and about 1/4 to 3/8 inches square that are deep fried until they are golden brown and crisp textured on the outside while remaining white and soft on the inside.");
        product.setProductPrice(3.00);
        product.setProviderLat(43.809983930714225);
        product.setProviderLong(43.809983930714225);

        productViewModel.insert(product);


        product.setProductName("Orange Juice");
        product.setProductDesc("Orange juice is a fruit juice obtained by squeezing, pressing or otherwise crushing the interior of an orange. Orange juice is a nutrition powerhouse with naturally occurring vitamins and minerals and many antioxidants. All types of juice can be found in health food and grocery stores.");
        product.setProductPrice(2.50);
        product.setProviderLat(43.809983930714225);
        product.setProviderLong(43.809983930714225);

        productViewModel.insert(product);

        product.setProductName("Tea");
        product.setProductDesc("Tea is an aromatic beverage prepared by pouring hot or boiling water over cured or fresh leaves of Camellia sinensis, an evergreen shrub native to China as well as other East and Southeast Asian countries. After water, it is the most widely consumed drink in the world.");
        product.setProductPrice(1.50);
        product.setProviderLat(43.809983930714225);
        product.setProviderLong(43.809983930714225);

        productViewModel.insert(product);


    }
}
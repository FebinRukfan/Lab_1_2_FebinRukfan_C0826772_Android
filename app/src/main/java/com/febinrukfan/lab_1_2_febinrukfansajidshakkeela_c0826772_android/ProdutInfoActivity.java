package com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.databinding.ActivityProductInfoBinding;
import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.model.Product;
import com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.model.ProductViewModel;




public class ProdutInfoActivity extends AppCompatActivity {

    private ProductViewModel productViewModel;
    private String TAG = this.getClass().getName();

    private ActivityProductInfoBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // initializing ViewModel
        productViewModel = new ViewModelProvider.AndroidViewModelFactory(this.getApplication())
                .create(ProductViewModel.class);



            showProductInfo();


    }

    private void showProductInfo() {


        productViewModel.getFirstProduct().observe(this, products -> {
            if (products.size() != 0) {

                Toast.makeText(this, products.size()+"", Toast.LENGTH_SHORT).show();

                binding.etPname.setText(products.get(0).getProductName());
                binding.etPdesc.setText(products.get(0).getProductDesc());
                binding.etPprice.setText(""+products.get(0).getProductPrice());
            }else {
                addDemoProducts();
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

        Product product1 = new Product();
        product1.setProductName("Coke");
        product1.setProductDesc("Cola is a carbonated soft drink flavored with vanilla, cinnamon, citrus oils and other flavorings.");
        product1.setProductPrice(5.00);
        product1.setProviderLat(43.809983930714225);
        product1.setProviderLong(43.809983930714225);

        productViewModel.insert(product1);
        Product product2 = new Product();

        product2.setProductName("Cocunut water");
        product2.setProductDesc("It's made up of about 94% water, 4% sugars, 1% fiber, and has less than 1% protein, fat, and other chemicals. The other chemicals include vitamins, minerals (including the electrolytes sodium and potassium), and plant hormones like cytokinins (that may benefit the body in various ways)");
        product2.setProductPrice(15.00);
        product2.setProviderLat(43.809983930714225);
        product2.setProviderLong(43.809983930714225);

        productViewModel.insert(product2);
        Product product3 = new Product();

        product3.setProductName("Hamburger");
        product3.setProductDesc(" A hamburger is a sandwich consisting of a cooked meat patty on a bun or roll. You can order a hamburger, fries, and a shake at most fast food restaurants. Hamburgers are traditionally made with ground beef and served with onions, tomatoes, lettuce, ketchup, and other garnishes.)");
        product3.setProductPrice(5.00);
        product3.setProviderLat(43.809983930714225);
        product3.setProviderLong(43.809983930714225);

        productViewModel.insert(product3);

        Product product4 = new Product();

        product4.setProductName("Sandwich");
        product4.setProductDesc(" Sandwich, in its basic form, slices of meat, cheese, or other food placed between two slices of bread. ... Any type of roll or bread and any type of food that can be conveniently so eaten can go into a sandwich, hot or cold.");
        product4.setProductPrice(4.00);
        product4.setProviderLat(43.809983930714225);
        product4.setProviderLong(43.809983930714225);

        productViewModel.insert(product4);

        Product product5 = new Product();

        product5.setProductName("Cutlet");
        product5.setProductDesc("a small, thin slice of meat. : chopped vegetables, nuts, etc., that are pressed together into a flat shape, covered with bread crumbs, and fried in oil.");
        product5.setProductPrice(1.30);
        product5.setProviderLat(43.809983930714225);
        product5.setProviderLong(43.809983930714225);

        productViewModel.insert(product5);

        Product product6 = new Product();

        product6.setProductName("French Fries");
        product6.setProductDesc("A thin strip of potato, usually cut 3 to 4 inches in length and about 1/4 to 3/8 inches square that are deep fried until they are golden brown and crisp textured on the outside while remaining white and soft on the inside.");
        product6.setProductPrice(3.00);
        product6.setProviderLat(43.809983930714225);
        product6.setProviderLong(43.809983930714225);

        productViewModel.insert(product6);

        Product product7 = new Product();


        product7.setProductName("Orange Juice");
        product7.setProductDesc("Orange juice is a fruit juice obtained by squeezing, pressing or otherwise crushing the interior of an orange. Orange juice is a nutrition powerhouse with naturally occurring vitamins and minerals and many antioxidants. All types of juice can be found in health food and grocery stores.");
        product7.setProductPrice(2.50);
        product7.setProviderLat(43.809983930714225);
        product7.setProviderLong(43.809983930714225);

        productViewModel.insert(product7);

        Product product8 = new Product();

        product8.setProductName("Tea");
        product8.setProductDesc("Tea is an aromatic beverage prepared by pouring hot or boiling water over cured or fresh leaves of Camellia sinensis, an evergreen shrub native to China as well as other East and Southeast Asian countries. After water, it is the most widely consumed drink in the world.");
        product8.setProductPrice(1.50);
        product8.setProviderLat(43.809983930714225);
        product8.setProviderLong(43.809983930714225);

        productViewModel.insert(product8);


    }
}
package fr.i.demoCM.web.controller.web;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{

    public static List<Product> products = new ArrayList<>();
    static{
        products.add(new Product(0, "Tablette", 120));
        products.add(new Product(1, "PC", 1200));
        products.add(new Product(2, "Switch", 500));
        products.add(new Product(3, "Router", 800));
        products.add(new Product(4, "NAS", 250));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int code) {
        for (Product p :
                products) {
            if (p.getCode()==code){
                return p;
            }
        }
        return null;
    }

    @Override
    public Product save(int code, String designation, double prix) {
        Product p = new Product(code, designation, prix);
        products.add(p);
        return p;
    }
}

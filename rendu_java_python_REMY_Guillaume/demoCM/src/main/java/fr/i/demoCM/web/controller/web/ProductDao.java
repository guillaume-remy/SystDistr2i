package fr.i.demoCM.web.controller.web;

import java.util.List;

public interface ProductDao {

    public List<Product> findAll();
    public Product findById(int code);
    public Product save(int code, String designation, double prix);

}

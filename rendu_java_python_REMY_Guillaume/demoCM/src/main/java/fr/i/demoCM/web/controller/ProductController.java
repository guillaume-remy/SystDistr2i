package fr.i.demoCM.web.controller;

import fr.i.demoCM.web.controller.web.Product;
import fr.i.demoCM.web.controller.web.ProductDao;
import fr.i.demoCM.web.controller.web.ProductDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao metier;

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String afficher(){
        return "Cours d'intro à Spring";
    }

    @RequestMapping(value="/products", method= RequestMethod.GET)
    public List<Product> afficherProducts(){
        return this.metier.findAll();
    }

    @RequestMapping(value="/findid", method= RequestMethod.GET)
    public Product productId(int code){
        return this.metier.findById(code);
    }

    @RequestMapping(value="/save", method= RequestMethod.GET)
    public Product addProduct(int code, String designation, double prix){
        return this.metier.save(code, designation, prix);
    }
}

package com.example.springbootschedularexample.service;

import com.example.springbootschedularexample.entity.Product;
import com.example.springbootschedularexample.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Scheduled(cron = "*/5 * * * * *")
    public void addProduct (){
        Product p = new Product( new Random().nextInt(12),
                "product "+new Random().nextInt(12)) ;
        productRepo.save(p);
        System.out.println("product with id " + p.getId() + " is inserted in db " + "at time " + new Date());
    }

    @Scheduled(cron = "*/15 * * * * *")
    public void displayProducts (){

        List<Product> productList =productRepo.findAll();
        System.out.println("no of products fetched from db is  :-  " + productList.size() + "at time " + new Date());
    }
}

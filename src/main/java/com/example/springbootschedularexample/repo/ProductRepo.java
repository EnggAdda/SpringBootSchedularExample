package com.example.springbootschedularexample.repo;

import com.example.springbootschedularexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {


}

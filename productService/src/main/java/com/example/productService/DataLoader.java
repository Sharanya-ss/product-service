package com.example.productService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Insert sample product
        Product p = new Product();
        p.setName("Laptop");
        p.setDescription("High performance laptop");
        p.setPrice(1200.0);
        p.setStock(10);
        productRepository.save(p);

        // Fetch all products
        System.out.println(productRepository.findAll());
    }
}

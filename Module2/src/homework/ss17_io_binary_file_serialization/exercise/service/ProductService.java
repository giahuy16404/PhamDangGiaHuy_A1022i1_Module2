package homework.ss17_io_binary_file_serialization.exercise.service;

import homework.ss17_io_binary_file_serialization.exercise.model.Product;
import homework.ss17_io_binary_file_serialization.exercise.repository.ProductRepository;

import java.io.Serializable;

public class ProductService{
    ProductRepository productRepository = new ProductRepository();

    public void addProductService(Product product) {
        productRepository.addProductRepository(product);
    }

    public void displayProductService() {
        productRepository.displayProductRepository();
    }

    public void idDisplayProductService(int id) {
        productRepository.IdDisplayProductRepository(id);
    }
}

package homework.ss17_io_binary_file_serialization.exercise.service;

import homework.ss17_io_binary_file_serialization.exercise.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements Serializable {
    static String path = "D:\\CODEGYM\\Module2\\Module2\\src\\homework\\ss17_io_binary_file_serialization\\exercise\\service\\fileProduct.dat";

    private void writeProduct(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Product> readProduct(String path) {
        List<Product> products = new ArrayList<>();
        try {
            File file = new File(path);
            if (!(file.length() == 0)) {
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ibs = new ObjectInputStream(fis);
                products = (List<Product>) ibs.readObject();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }


    public void addProductService(Product product) {
        List<Product> products;
        products = readProduct(path);
        products.add(product);
        writeProduct(path, products);
    }

    public void displayProductService() {
        System.out.println(readProduct(path));
    }

    public void IdDisplayProductService(int id) {
        List<Product> products = readProduct(path);
        for (Product product : products) {
            if (product.getIdProduct() == id) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("Không có mã sản phẩm này!");
    }
}

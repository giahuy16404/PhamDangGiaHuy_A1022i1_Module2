package homework.ss17_io_binary_file_serialization.exercise.controller;

import homework.ss17_io_binary_file_serialization.exercise.model.Product;
import homework.ss17_io_binary_file_serialization.exercise.repository.ProductRepository;
import homework.ss17_io_binary_file_serialization.exercise.service.ProductService;

import java.io.IOException;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductController implements Serializable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService productService = new ProductService();

        boolean check = true;
        while (check) {
            try {

                System.out.println("1.Hiển thị sản phẩm.");
                System.out.println("2.Thêm sản phẩm.");
                System.out.println("3.Tìm kiếm sản phẩm");
                System.out.println("4.Thoát");
                int selectProduct = Integer.parseInt(sc.nextLine());
                switch (selectProduct) {
                    case 1:
                        productService.displayProductService();
                        break;
                    case 2:
                        System.out.print("Nhập  id sản phâm: ");
                        int idProduct = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập tên sản phẩm: ");
                        String nameProduct = sc.nextLine();
                        System.out.print("Nhập hảng sản xuất: ");
                        String manufacturerProduct = sc.nextLine();
                        System.out.print("Nhập giá sản phẩm: ");
                        double priceProduct = Integer.parseInt(sc.nextLine());

                        productService.addProductService(new Product(idProduct, nameProduct, manufacturerProduct, priceProduct));
                        break;
                    case 3:
                        System.out.print("Nhập id sản phẩm cần tìm kiếm: ");
                        int checkIDProduct = Integer.parseInt(sc.nextLine());
                        productService.idDisplayProductService(checkIDProduct);
                        break;
                    case 4:
                        check = false;
                        break;


                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập đúng định dạng!");
            } catch (InputMismatchException e) {
                System.out.println("Nhập không đúng kiểu dữ liệu!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

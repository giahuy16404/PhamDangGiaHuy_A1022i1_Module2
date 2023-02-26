package homework.ss12_java_collection_framework.controller;

import homework.ss12_java_collection_framework.model.ProductRepository;

import java.util.Scanner;

public class ProductControl {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        Scanner sc = new Scanner(System.in);
        int select;
        do {
            System.out.println("================CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM================");
            System.out.println("==                                                         ==");
            System.out.println("==  1.Thêm sản phẩm:                                       ==");
            System.out.println("==  2.Sửa thông tin sản phẩm theo id:                      ==");
            System.out.println("==  3.Xóa sản phẩm theo id:                                ==");
            System.out.println("==  4.Hiển thị danh sách sản phẩm:                         ==");
            System.out.println("==  5.Tìm kiếm sản phẩm theo tên:                          ==");
            System.out.println("==  6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá:        ==");
            System.out.println("==  7.Thoát:                                               ==");
            System.out.println("==                                                         ==");
            System.out.println("===========================GIAHUY============================");
            select = sc.nextByte();
            switch (select) {
                case 1:
                    productRepository.addProduct();
                    break;
                case 2:
                    productRepository.editProductID();
                    break;
                case 3:
                    productRepository.removeProductID();
                    break;
                case 4:
                    productRepository.showProduct();
                    break;
                case 5:
                    productRepository.searchProductName();
                    break;
                case 6:
                    productRepository.productPriceChange();
                    break;
            }
        } while (select < 7);
    }
}

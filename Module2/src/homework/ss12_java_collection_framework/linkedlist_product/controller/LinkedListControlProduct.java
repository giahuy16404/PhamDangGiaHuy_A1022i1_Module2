package homework.ss12_java_collection_framework.linkedlist_product.controller;

import homework.ss12_java_collection_framework.linkedlist_product.model.LinkedProductRepo;

import java.util.Scanner;

public class LinkedListControlProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedProductRepo product = new LinkedProductRepo();
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
                    System.out.println("1.Nhập vào tên sản phẩm:");
                    String nameProduct = sc.nextLine();
                    System.out.println("2.Nhập vào id sản phẩm:");
                    int idProduct = sc.nextInt();
                    System.out.println("3.Nhập vào giá sản phẩm");
                    int priceProduct = sc.nextInt();
                    product.addProduct(idProduct, nameProduct, priceProduct);
                    break;
                case 2:
                    System.out.println("Mời bạn nhập mã:");
                    int editProduct = sc.nextInt();
                    product.editProductID(editProduct);
                    break;
                case 3:
                    System.out.println("Mời bạn nhập mã:");
                    int removeProduct = sc.nextInt();
                    product.removeProductID(removeProduct);
                    break;
                case 4:
                    product.showProduct();
                    break;
                case 5:
                    System.out.println("Mời bạn nhập tên sản phẩm:");
                    String showNameProduct = sc.nextLine();
                    product.searchProductName(showNameProduct);
                    break;
                case 6:
                    product.productPriceChange();
                    break;
            }
        } while (select < 7);
    }

}
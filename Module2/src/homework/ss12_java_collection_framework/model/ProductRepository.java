package homework.ss12_java_collection_framework.model;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    ArrayList<Product> arrayProduct = new ArrayList<>();
    Product product = new Product();
    Scanner sc = new Scanner(System.in);

    public void addProduct() {
        int sellect;
        do {
            System.out.println("1.Nhập vào tên sản phẩm:");
            String nameProduct = sc.nextLine();
            System.out.println("2.Nhập vào id sản phẩm:");
            int idProduct = sc.nextInt();
            System.out.println("3.Nhập vào giá sản phẩm");
            int priceProduct = sc.nextInt();
            arrayProduct.add(new Product(idProduct, nameProduct,priceProduct));

            System.out.println("Bạn có muốn tiếp tục thêm sản phâm không:");
            System.out.println("1.CÓ");
            System.out.println("2.Không");
            sellect = sc.nextInt();
            sc.nextLine();

        } while (sellect < 2);

    }

    @Override
    public void editProductID() {
        int sellect = 0;
        do {

            System.out.println("Mời bạn nhập mã:");
            int checkProduct = sc.nextInt();
            for (int i = 0; i < arrayProduct.size(); i++) {
                int getIdProduct = arrayProduct.get(i).getIdProduct();
                if (getIdProduct == checkProduct) {
                    System.out.println("1.Thay đổi tên sản phẩm:");
                    System.out.println("2.Thay đổi mã sản phẩm:");
                    int sellectCheck = sc.nextInt();
                    sc.nextLine();
                    switch (sellectCheck) {
                        case 1:
                            System.out.println("Mời bạn nhập tên mới:");
                            String newNameProduct = sc.nextLine();
                            arrayProduct.get(i).setNameProduct(newNameProduct);
                            break;
                        case 2:
                            System.out.println("Mời bạn nhập mã mới:");
                            int newIdProduct = sc.nextInt();
                            arrayProduct.get(i).setIdProduct(newIdProduct);
                            break;
                    }
                }
            }
            System.out.println("1.Bạn muốn tiếp tục chỉnh sửa sản phẩm:");
            System.out.println("2.Thoát:");
            sellect = sc.nextInt();

        } while (sellect < 2);
    }

    @Override
    public void removeProductID() {
        int sellect;
        do {
            System.out.println("Mời bạn nhập mã:");
            int checkProduct = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < arrayProduct.size(); i++) {
                int getIdProduct = arrayProduct.get(i).getIdProduct();
                if (getIdProduct == checkProduct) {
                    arrayProduct.remove(i);
                }
            }
            System.out.println("1.Bạn muốn tiếp tục xóa sản phẩm:");
            System.out.println("2.Thoát:");
            sellect = sc.nextInt();

        } while (sellect < 2);
    }

    public void showProduct() {
        System.out.println("Danh sách sản phẩm:");
        for (int i = 0; i < arrayProduct.size(); i++) {
            System.out.println(arrayProduct.get(i));
        }
    }

    @Override
    public void searchProductName() {
        int sellect;
        do {
            System.out.println("Mời bạn nhập tên sản phẩm:");
            String checkProduct = sc.nextLine();
            sc.nextLine();
            for (int i = 0; i < arrayProduct.size(); i++) {
                String getNamedProduct = arrayProduct.get(i).getNameProduct();
                if (checkProduct.equals(getNamedProduct)) {
                    System.out.println(arrayProduct.get(i));
                }
            }
            System.out.println("1.Bạn muốn tiếp tục xem sản phẩm:");
            System.out.println("2.Thoát:");
            sellect = sc.nextInt();

        } while (sellect < 2);
    }

    @Override
    public void productPriceChange() {
    }
}

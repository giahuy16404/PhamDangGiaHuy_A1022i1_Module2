package homework.ss12_java_collection_framework.model;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    ArrayList<Product> arrayProduct = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addProduct() {
        byte sellect;
        do {
            System.out.println("1.Nhập vào tên sản phẩm:");
            String nameProduct = sc.nextLine();
            System.out.println("2.Nhập vào id sản phẩm:");
            int idProduct = sc.nextInt();
            System.out.println("3.Nhập vào giá sản phẩm");
            int priceProduct = sc.nextInt();
            arrayProduct.add(new Product(idProduct, nameProduct, priceProduct));

            System.out.println("1.Tiếp tục thêm sản phâm:");
            System.out.println("2.Thoát:");
            sellect = sc.nextByte();
        } while (sellect < 2);
        sc.nextLine();
    }

    @Override
    public void editProductID() {
        byte sellect;
        do {
            System.out.println("Mời bạn nhập mã:");
            int checkProduct = sc.nextInt();
            boolean check = false;
            for (int i = 0; i < arrayProduct.size(); i++) {
                int getIdProduct = arrayProduct.get(i).getIdProduct();
                if (getIdProduct == checkProduct) {
                    System.out.println("1.Thay đổi tên sản phẩm: ");
                    System.out.println("2.Thay đổi mã sản phẩm: ");
                    System.out.println("3.Thay đổi giá sản phẩm: ");
                    System.out.println("Mời bạn chọn tính năng cần sửa đổi:");
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

                        case 3:
                            System.out.println("Mời bạn nhập giá mới:");
                            int newPrice = sc.nextInt();
                            arrayProduct.get(i).setPrice(newPrice);
                            break;
                        default:
                            System.out.println("Tính năng không hợp lệ, vui lòng chọn lại!");
                            break;
                    }
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Không tìm thấy sản phẩm với mã số đã nhập. Vui lòng kiểm tra lại!");
            }
            System.out.println("1.Bạn muốn tiếp tục chỉnh sửa sản phẩm:");
            System.out.println("2.Thoát:");
            System.out.println("Mời bạn chọn tính năng:");

            sellect = sc.nextByte();
            sc.nextLine();

        } while (sellect < 2);
    }

    @Override
    public void removeProductID() {
        byte sellect;
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
            sellect = sc.nextByte();
            sc.nextLine();

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
        byte sellect;
        do {
            System.out.println("Mời bạn nhập tên sản phẩm:");
            String checkProduct = sc.nextLine();
            boolean check = false;
            for (int i = 0; i < arrayProduct.size(); i++) {
                String getNamedProduct = arrayProduct.get(i).getNameProduct();
                if (checkProduct.equals(getNamedProduct)) {
                    System.out.println(arrayProduct.get(i));
                    check = true;
                }
            }
            if (!check) {
                System.out.println("Không tìm thấy sản phẩm có tên '" + checkProduct + "'.");
            }
            System.out.println("1.Bạn muốn tiếp tục xem sản phẩm:");
            System.out.println("2.Thoát:");
            sellect = sc.nextByte();
            sc.nextLine();

        } while (sellect < 2);
    }

    @Override
    public void productPriceChange() {
        byte sellect;
        do {
            System.out.println("1.Sắp xếp giá từ thấp đến cao:");
            System.out.println("2.Sắp xếp giá từ cao đến thấp:");
            byte checkPriceChange = sc.nextByte();
            switch (checkPriceChange) {
                case 1:
                    for (int i = 0; i < arrayProduct.size() - 1; i++) {
                        for (int j = i + 1; j < arrayProduct.size(); j++) {
                            int priceFirst = arrayProduct.get(i).getPrice();
                            int priceSecond = arrayProduct.get(j).getPrice();
                            if (priceFirst > priceSecond) {
                                int valuePriceChange = priceFirst;
                                arrayProduct.get(i).setPrice(priceSecond);
                                arrayProduct.get(j).setPrice(valuePriceChange);
                            }
                        }
                    }
                    for (int i = 0; i < arrayProduct.size(); i++) {
                        System.out.println(arrayProduct.get(i));
                    }
                    break;
                case 2:
                    for (int i = 0; i < arrayProduct.size() - 1; i++) {
                        for (int j = i + 1; j < arrayProduct.size(); j++) {
                            int priceFirst = arrayProduct.get(i).getPrice();
                            int priceSecond = arrayProduct.get(j).getPrice();

                            if (priceFirst < priceSecond) {
                                int valuePriceChange = priceFirst;
                                arrayProduct.get(i).setPrice(priceSecond);
                                arrayProduct.get(j).setPrice(valuePriceChange);
                            }
                        }
                    }
                    for (int i = 0; i < arrayProduct.size(); i++) {
                        System.out.println(arrayProduct.get(i));
                    }
                    break;
            }
            System.out.println("Bạn muốn tiếp tục săp xếp.");
            System.out.println("1.Có");
            System.out.println("2.Không");
            sellect = sc.nextByte();

        } while (sellect < 2);
    }
}

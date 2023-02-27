package homework.ss12_java_collection_framework.arraylist_product.model;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository implements IProductRepository{
    ArrayList<Product> arrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct(int id, String name, int price) {
        arrayList.add(new Product(id, name, price));
    }


    @Override
    public void editProductID(int id) {
        byte sellect;
        do {

            boolean check = false;
            for (int i = 0; i < arrayList.size(); i++) {
                int getIdProduct = arrayList.get(i).getIdProduct();
                if (getIdProduct == id) {
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
                            arrayList.get(i).setNameProduct(newNameProduct);
                            break;
                        case 2:
                            System.out.println("Mời bạn nhập mã mới:");
                            int newIdProduct = sc.nextInt();
                            arrayList.get(i).setIdProduct(newIdProduct);
                            break;

                        case 3:
                            System.out.println("Mời bạn nhập giá mới:");
                            int newPrice = sc.nextInt();
                            arrayList.get(i).setPrice(newPrice);
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
    public void removeProductID(int id) {
        byte sellect;
        do {

            sc.nextLine();
            for (int i = 0; i < arrayList.size(); i++) {
                int getIdProduct = arrayList.get(i).getIdProduct();
                if (getIdProduct == id) {
                    arrayList.remove(i);
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
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    @Override
    public void searchProductName(String name) {
        byte sellect;
        do {
            boolean check = false;
            for (int i = 0; i < arrayList.size(); i++) {
                String getNamedProduct = arrayList.get(i).getNameProduct();
                if (name.equals(getNamedProduct)) {
                    System.out.println(arrayList.get(i));
                    check = true;
                }
            }
            if (!check) {
                System.out.println("Không tìm thấy sản phẩm có tên '" + name + "'.");
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
                    for (int i = 0; i < arrayList.size() - 1; i++) {
                        for (int j = i + 1; j < arrayList.size(); j++) {
                            int priceFirst = arrayList.get(i).getPrice();
                            int priceSecond = arrayList.get(j).getPrice();
                            if (priceFirst > priceSecond) {
                                int valuePriceChange = priceFirst;
                                arrayList.get(i).setPrice(priceSecond);
                                arrayList.get(j).setPrice(valuePriceChange);
                            }
                        }
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println(arrayList.get(i));
                    }
                    break;
                case 2:
                    for (int i = 0; i < arrayList.size() - 1; i++) {
                        for (int j = i + 1; j < arrayList.size(); j++) {
                            int priceFirst = arrayList.get(i).getPrice();
                            int priceSecond = arrayList.get(j).getPrice();

                            if (priceFirst < priceSecond) {
                                int valuePriceChange = priceFirst;
                                arrayList.get(i).setPrice(priceSecond);
                                arrayList.get(j).setPrice(valuePriceChange);
                            }
                        }
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println(arrayList.get(i));
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


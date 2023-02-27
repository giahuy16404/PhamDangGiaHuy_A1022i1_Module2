package homework.ss12_java_collection_framework.linkedlist_product.model;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedProductRepo implements ILinkedProductRepo {
    LinkedList<LinkedListProduct> linkedList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct(int id, String name, int price) {
        byte sellect;
        do {

            for (int i = 0; i < linkedList.size(); i++) {
                if (id == linkedList.get(i).getIdProduct()) {
                    System.out.println("Id đã có xin mời nhập lại");
                    id = sc.nextInt();
                }
            }
            linkedList.add(new LinkedListProduct(id, name, price));
            System.out.println("1.Tiếp tục thêm sản phâm:");
            System.out.println("2.Thoát:");
            sellect = sc.nextByte();
            sc.nextLine();
        } while (sellect < 2);
        sc.nextLine();
    }


    @Override
    public void editProductID(int id) {
        byte sellect;
        do {

            boolean check = false;
            for (int i = 0; i < linkedList.size(); i++) {
                int getIdProduct = linkedList.get(i).getIdProduct();
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
                            linkedList.get(i).setNameProduct(newNameProduct);
                            break;
                        case 2:
                            System.out.println("Mời bạn nhập mã mới:");
                            int newIdProduct = sc.nextInt();
                            linkedList.get(i).setIdProduct(newIdProduct);
                            break;

                        case 3:
                            System.out.println("Mời bạn nhập giá mới:");
                            int newPrice = sc.nextInt();
                            linkedList.get(i).setPrice(newPrice);
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
            for (int i = 0; i < linkedList.size(); i++) {
                int getIdProduct = linkedList.get(i).getIdProduct();
                if (getIdProduct == id) {
                    linkedList.remove(i);
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
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }

    @Override
    public void searchProductName(String name) {
        byte sellect;
        do {
            boolean check = false;
            for (int i = 0; i < linkedList.size(); i++) {
                String getNamedProduct = linkedList.get(i).getNameProduct();
                if (name.equals(getNamedProduct)) {
                    System.out.println(linkedList.get(i));
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
                    for (int i = 0; i < linkedList.size() - 1; i++) {
                        for (int j = i + 1; j < linkedList.size(); j++) {
                            int priceFirst = linkedList.get(i).getPrice();
                            int priceSecond = linkedList.get(j).getPrice();
                            if (priceFirst > priceSecond) {
                                int valuePriceChange = priceFirst;
                                linkedList.get(i).setPrice(priceSecond);
                                linkedList.get(j).setPrice(valuePriceChange);
                            }
                        }
                    }
                    for (int i = 0; i < linkedList.size(); i++) {
                        System.out.println(linkedList.get(i));
                    }
                    break;
                case 2:
                    for (int i = 0; i < linkedList.size() - 1; i++) {
                        for (int j = i + 1; j < linkedList.size(); j++) {
                            int priceFirst = linkedList.get(i).getPrice();
                            int priceSecond = linkedList.get(j).getPrice();

                            if (priceFirst < priceSecond) {
                                int valuePriceChange = priceFirst;
                                linkedList.get(i).setPrice(priceSecond);
                                linkedList.get(j).setPrice(valuePriceChange);
                            }
                        }
                    }
                    for (int i = 0; i < linkedList.size(); i++) {
                        System.out.println(linkedList.get(i));
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
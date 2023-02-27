package homework.ss12_java_collection_framework.linkedlist_product.model;

public interface ILinkedProductRepo {
    void addProduct(int id, String name, int price);

    void editProductID(int id);

    void removeProductID(int id);

    void showProduct();

    void searchProductName(String name);

    void productPriceChange();
}

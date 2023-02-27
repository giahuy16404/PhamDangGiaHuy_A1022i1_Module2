package homework.ss12_java_collection_framework.arraylist_product.model;

public interface IProductRepository {
    void addProduct(int id, String name, int price);

    void editProductID(int id);

    void removeProductID(int id);

    void showProduct();

    void searchProductName(String name);

    void productPriceChange();

}

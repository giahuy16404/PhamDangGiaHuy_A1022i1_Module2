package homework.ss12_java_collection_framework.arraylist_product.model;

public class Product implements Comparable<Product>{
    private int idProduct;
    private String nameProduct;
    private int price;

    Product() {
    }

    public Product(int idProduct, String nameProduct, int price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "----------------\n" +
                "- Tên sản phẩm: " + nameProduct + "\n" +
                "- Mã sản phẩm: " + idProduct + "\n" +
                "- Giá sản phẩm: " + price + " Vnd";
    }

    @Override
    public int compareTo(Product product) {
        return Integer.compare(this.price,product.getPrice());
    }
}

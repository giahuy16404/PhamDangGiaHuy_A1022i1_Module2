package homework.ss12_java_collection_framework.linkedlist_product.model;

public class LinkedListProduct implements Comparable<LinkedListProduct>{
    private int idProduct;
    private String nameProduct;
    private int price;

    public LinkedListProduct() {
    }

    public LinkedListProduct(int idProduct, String nameProduct, int price) {
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
    public int compareTo(LinkedListProduct linkedListProduct) {
        return Integer.compare(this.price,linkedListProduct.getPrice());

    }
}

package bai15_IO_Binary_File_Serialization.Bai_Tap;

import java.io.Serializable;

public class Product implements Serializable {
    String idProduct;
    String nameProduct;
    String codeProduct;
    int priceProduct;
    String typeoOfProduct;

    public Product(String idProduct, String nameProduct, String codeProduct, int priceProduct, String typeoOfProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.codeProduct = codeProduct;
        this.priceProduct = priceProduct;
        this.typeoOfProduct = typeoOfProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getTypeoOfProduct() {
        return typeoOfProduct;
    }

    public void setTypeoOfProduct(String typeoOfProduct) {
        this.typeoOfProduct = typeoOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", codeProduct='" + codeProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", typeoOfProduct='" + typeoOfProduct + '\'' +
                '}';
    }
}

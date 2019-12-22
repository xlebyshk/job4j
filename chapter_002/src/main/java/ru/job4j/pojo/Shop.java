package ru.job4j.pojo;

public class Shop {
    public static Product[] delete(Product[] product, int index) {
        product[index] = null;
        for (int i = index + 1; i < product.length; i++) {
            if (product[i] != null) {
                product[i - 1] = product[i];
                product[i] = null;
            } else {
                product[i - 1] = null;
            }
        }
        return product;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 12);
        products[1] = new Product("Bread", 6);
        products[2] = new Product("Egg", 29);
        products[3] = new Product("Butter", 2);
        products[4] = null;
        System.out.println("Full array:");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName() + ". count: " + product.getCount());
            } else {
                System.out.println("null");
            }
        }
        delete(products, 1);
        System.out.println("Delete index[2]:");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName() + ". count: " + product.getCount());
            } else {
                System.out.println("null");
            }
        }
    }
}

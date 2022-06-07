package assignment_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Product {
    // Data members
    private int productCode;
    private String name;
    private double price;
    private String category;

    // Parameterised constructor
    public Product(int productCode, String name, double price, String category) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters and Setters
    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static ArrayList<Product> getProductsList() {
        // Creating user defined Product Array List
        ArrayList<Product> prods = new ArrayList<>();
        Product f1 = new Product(111, "Men's Shirt", 1999.00, "fashion");
        Product f2 = new Product(112, "Men's Blazer", 3999.00, "fashion");
        Product f3 = new Product(113, "Casual Shoes", 2999.00, "fashion");
        Product m1 = new Product(211, "Samsung s9", 20999.00, "mobile");
        Product m2 = new Product(212, "Iphone 13", 60999.00, "mobile");
        Product m3 = new Product(213, "Real me GT", 27999.00, "mobile");
        Product e1 = new Product(311, "Washing mchine", 12999.00, "appliences");
        Product e2 = new Product(312, "Refrigerators", 15000.00, "appliences");
        Product e3 = new Product(313, "AC", 30000.00, "appliences");

        // Adding products to the list
        prods.add(f1);
        prods.add(f2);
        prods.add(f3);
        prods.add(m1);
        prods.add(m2);
        prods.add(m3);
        prods.add(e1);
        prods.add(e2);
        prods.add(e3);
        return prods;
    }

    public static void main(String[] args) {

        // Creating the object of the product service!
        ProductService productService = new ProductService();

        // calling the method findNameByCode from Product service and pass the argument
        // product code as type int!
        // It will return product name
        String prodName = productService.findNameByCode(111);
        System.out.println(prodName);

        // calling the method findMaxPriceProduct from Product service and pass the
        // argument catagory as type string!
        // It will return product object
        Product product_obj = productService.findMaxPriceProduct("mobile");
        System.out.println(product_obj);

        // calling the method getProductsByCatagory from Product service and pass the
        // argument catagory as type string!
        // it will return the list of products
        ArrayList<Product> products = productService.getProductsByCategory("fashion");
        if (products != null) {
            Iterator itr = products.iterator();
            while (itr.hasNext()) {
                Product product = (Product) itr.next();
                System.out.println("[ product code: " + product.getProductCode() + ", product name: "
                        + product.getName() + ", product price: Rs." + product.getPrice() + ", product catagory: "
                        + product.getCategory() + " ]");
            }
        }
    }
}
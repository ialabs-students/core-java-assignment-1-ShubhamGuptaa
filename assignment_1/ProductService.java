package assignment_1;

import java.util.ArrayList;

public class ProductService {
    // making references and creating variables!
    Product product;
    public static ArrayList<Product> prods = Product.getProductsList();
    String prodName;
    double temp = 0.00;
    Product product_object, temp_obj;

    // Creating an array list of product type
    ArrayList<Product> newList = new ArrayList<>();

    // - Should take product code as parameter and return the name of the product
    // from the list of products present in ProductRepository
    // - If no product is found for the given product code, return null
    public String findNameByCode(int productCode) {
        try{
            prods.forEach(
                    a -> {
                        if (productCode == a.getProductCode()) {
                            prodName = a.getName();

                        } 

                    });
                    return ("Product Name: " + prodName);
                }
           
        catch (Exception e){
            prodName = null;
            return ("Product Name: " + prodName);
        }
       
    }

    // - Should take product category as a parameter and return the product object
    // having the maximum price in the category provided
    // - If no product is found for the given category, return null
    public Product findMaxPriceProduct(String catagory) {

        prods.forEach(
                a -> {
                    if (catagory == a.getCategory()) {
                        product_object = a;
                        if (temp < a.getPrice()) {
                            temp = a.getPrice();
                            temp_obj = a;
                        }
                    } else {
                        product_object = null;
                    }
                });
        return (temp_obj);
    }

    // - Should take product category as parameter and return the array of products
    // in the category provided
    // - If no product are found for the given category, return null
    public ArrayList<Product> getProductsByCategory(String catagory) {
        prods.forEach(
                a -> {
                    if (catagory == a.getCategory()) {
                        newList.add(a);
                    } else {
                        product_object = null;
                    }
                });
        return newList;
    }
}

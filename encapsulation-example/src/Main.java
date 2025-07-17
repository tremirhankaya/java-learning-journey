public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProductManager productManager = new ProductManager();
        product.SetId(1);
        System.out.println(product.GetId());
        product.SetName("Laptop");
        System.out.println(product.GetName());
        product.SetPrice(2000);
        System.out.println(product.GetPrice());
        product.SetStockAmount(10);
        System.out.println(product.GetStockAmount());

        productManager.AddProduct(product);
    }
}
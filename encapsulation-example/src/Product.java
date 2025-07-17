public class Product {
    private int _id;
    private String _name;
    private String _description;
    private int _price;
    private int _stockAmount;

    public int GetId() {
        return _id;
    }

    public void SetId(int id) {
        _id = id;
    }

    public String GetName() {
        return _name;
    }

    public void SetName(String name) {
        this._name = name;
    }

    public String GetDescription() {
        return _description;
    }

    public void SetDescription(String description) {
        this._description = description;
    }

    public int GetPrice() {
        return _price;
    }

    public void SetPrice(int price) {
        this._price = price;
    }

    public int GetStockAmount() {
        return _stockAmount;
    }

    public void SetStockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }
}

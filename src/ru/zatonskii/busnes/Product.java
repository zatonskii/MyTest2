package ru.zatonskii.busnes;

public class Product {
        private int startPrise = 80;
        private int salePrice = 120;
        private int tax = 13;
        private int profit = salePrice - startPrise / tax;

    public Product() {
        this.profit = profit;
    }

    public int getStartPrise() {
        return startPrise;
    }
    public void setStartPrise(int startPrise) {
        this.startPrise = startPrise;
    }
    public int getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }
    public int getTax() {
        return tax;
    }
    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getProfit() {
        return profit;
    }
    public void setProfit(int profit) {
        this.profit = profit;
    }
}

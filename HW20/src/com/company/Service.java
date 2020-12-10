package com.company;

public class Service {
    private String item;
    private int price;
    private int weight;

    private int ozonPrice = 20;
    private int ozonSpeed = 5;
    private int ozonTax = 5;
    private int ozonLossRate=  20;

    private int amazonPrice = 35;
    private int amazonSpeed =14;
    private int amazonTax = 15;
    private int amazonLossRate=  5;

    private int alibabaPrice = 10;
    private int alibabaSpeed = 9;
    private int alibabaTax = 15;
    private int alibabaLossRate=  14;

    public Service () {};

    public Service(String item, int price, int weight) {
        this.item = item;
        this.price = price;
        this.weight = weight;
    }

    public String buy() {
        String msg = "";
        if (price >= 10000) {
            System.out.println("Your package price is above 10000. We advise you to use amazon. They have lower loss rate but higher a price and a longer delivery speed.");
            double finalPrice = ((amazonTax * 0.01 * this.price) + this.price + (amazonPrice * this.weight));
            msg = String.format("You will get a %s in about %s days. The final price is: %s(%s plus %s percent tax plus shipping costs)", item, amazonSpeed, finalPrice, price, amazonTax);
        }
        else if (weight >= 5 && price <= 2000) {
            double finalPrice = ((alibabaTax * 0.01 * this.price) + this.price + (alibabaPrice * this.weight));
            System.out.println("Your package is quite heavy. We advise you to use Alibaba for their lower package costs. However, you will have to wait a bit more.");
            msg = String.format("You will get a %s in about %s days. The final price is: %s(%s plus %s percent tax plus shipping costs)", item, alibabaSpeed, finalPrice, price, alibabaTax);}
        else {
            System.out.println("You have a small package. We advise you to use Ozon for its fast deliveries and low costs.");
            double finalPrice = ((ozonTax * 0.01 * this.price) + this.price + (ozonPrice * this.weight));
            msg = String.format("You will get a %s in about %s days. The final price is: %s(%s plus %s percent tax plus shipping costs)", item, ozonSpeed, finalPrice, price, ozonTax);
        }
        return msg;
    }

    public String send() {
        String msg = "";
        if (price >= 10000) {
            System.out.println("Your package price is above 10000. We advise you to use amazon. They have lower loss rate but higher a price and a longer delivery speed.");
            double finalPrice = ((amazonTax * 0.01 * this.price) + this.price + (amazonPrice * this.weight));
            msg = String.format("You will send a %s. It will arrive at the destination in about %s days. The cost is going to be %s(%s plus %s percent tax plus shipping costs", item, amazonSpeed, finalPrice, price, amazonTax);
        }
        else if (weight >= 5 && price <= 2000) {
            double finalPrice = ((alibabaTax * 0.01 * this.price) + this.price + (alibabaPrice * this.weight));
            System.out.println("Your package is quite heavy. We advise you to use Alibaba for their lower package costs. However, you will have to wait a bit more.");
            msg = String.format("You will send a %s. It will arrive at the destination in about %s days. The cost is going to be %s(%s plus %s percent tax plus shipping costs)", item, alibabaSpeed, finalPrice, price, alibabaTax);}
        else {
            System.out.println("You have a small package. We advise you to use Ozon for its fast deliveries and low costs.");
            double finalPrice = ((ozonTax * 0.01 * this.price) + this.price + (ozonPrice * this.weight));
            msg = String.format("You will send a %s. It will arrive at the destination in about %s days. The cost is going to be %s(%s plus %s percent tax plus shipping costs)", item, ozonSpeed, finalPrice, price, ozonTax);
        }
        return msg;
    }

    public String order() {
        String msg = "";
        if (price >= 10000) {
            System.out.println("Your package price is above 10000. We advise you to use amazon. They have lower loss rate but higher a price and a longer delivery speed.");
            double finalPrice = ((amazonTax * 0.01 * this.price) + this.price + (amazonPrice * this.weight));
            msg = String.format("You have ordered a %s. It will arrive in about %s days. The cost is about %s(%s plus %s percent tax plus shipping costs)", item, amazonSpeed, finalPrice, price, amazonTax);
        }
        else if (weight >= 5 && price <= 2000) {
            double finalPrice = ((alibabaTax * 0.01 * this.price) + this.price + (alibabaPrice * this.weight));
            System.out.println("Your package is quite heavy. We advise you to use Alibaba for their lower package costs. However, you will have to wait a bit more.");
            msg = String.format("You have ordered a %s. It will arrive in about %s days. The cost is about %s(%s plus %s percent tax plus shipping costs)", item, alibabaSpeed, finalPrice, price, alibabaTax);}
        else {
            System.out.println("You have a small package. We advise you to use Ozon for its fast deliveries and low costs.");
            double finalPrice = ((ozonTax * 0.01 * this.price) + this.price + (ozonPrice * this.weight));
            msg = String.format("You have ordered a %s. It will arrive in about %s days. The cost is about %s(%s plus %s percent tax plus shipping costs)", item, ozonSpeed, finalPrice, price, ozonTax);
        }
        return msg;
    }
}

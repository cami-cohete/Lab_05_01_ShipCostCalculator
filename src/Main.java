public class Main {
    //      num itemCost = 0
    //      num shippingCost = 0
    //      num SHIPPING_FEE = 0.02
    //      num totalCost = 0
    //      output “Enter the price of your item: “
    //      input itemCost
    //      if itemCost >= 100 then
    //         output “You get free shipping!”
    //      else
    //          shippingCost = itemCost * SHIPPING_FEE
    //          output “Your shipping cost is “ + shippingCost
    //      endIf
    //      totalCost = shippingCost + itemCost
    public static void main(String[] args)
    {
        double itemCost = 0;
        double shippingCost = 0;
        final double SHIPPING_FEE = 0.02;
        double totalCost; 0
        System.out.println("Enter the price of your item: ");
        itemCost = 75; // user input
        System.out.println("The simulated cost of the item is $" + itemCost);

        if (itemCost >= 100)
        {
            System.out.println("Your shipping is free!");
        }
        else
        {
            shippingCost = itemCost * SHIPPING_FEE;
            System.out.println("Your cost for shipping is $" + shippingCost);
        }
        totalCost = shippingCost + itemCost;
        System.out.println("The total cost of your purchase is $" + totalCost);
    }
}

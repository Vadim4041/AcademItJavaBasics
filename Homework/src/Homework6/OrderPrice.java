package Homework6;

/*
• Написать функцию для расчета стоимости заказа с учетом
скидок
• Всего есть два вида товаров, в заказ может входить
некоторое количество товаров одного типа и другого типа
• Скидка 5% начисляется, если суммарное количество
товаров в заказе не меньше 10
• Скидка 5% начисляется, если суммарная стоимость заказа
не меньше 1000 рублей
• Если выполняются оба условия, то скидка 10% от начальной
стоимости
 */

public class OrderPrice {
    public static void main(String[] args) {
        System.out.println("Общая сумма заказа #1 с учетом скидок: " + getOrderPrice(1, 100, 2, 200));
        System.out.println("Общая сумма заказа #2 с учетом скидок: " + getOrderPrice(5, 50, 5, 20));
        System.out.println("Общая сумма заказа #3 с учетом скидок: " + getOrderPrice(5, 100, 5, 500));
    }

    public static double getOrderPrice(int type1ProductsQuantity, double type1ProductPrice, int type2ProductsQuantity, double type2ProductPrice) {
        final double twoConditionsDiscount = 0.9;
        final double oneConditionDiscount = 0.95;

        final int quantityThreshold = 10;
        final int totalPriceThreshold = 1000;

        double totalPrice = type1ProductsQuantity * type1ProductPrice + type2ProductsQuantity * type2ProductPrice;
        int totalQuantity = type1ProductsQuantity + type2ProductsQuantity;

        if (totalQuantity >= quantityThreshold && totalPrice >= totalPriceThreshold) {
            return totalPrice * twoConditionsDiscount;
        }

        if (totalQuantity >= quantityThreshold || totalPrice >= totalPriceThreshold) {
            return totalPrice * oneConditionDiscount;
        }

        return totalPrice;
    }
}
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

public class OrderCost {
    public static void main(String[] args) {
        System.out.println("Общая сумма заказа #1 с учетом скидок: " + getOrderCost(1, 100, 2, 200));
        System.out.println("Общая сумма заказа #2 с учетом скидок: " + getOrderCost(5, 50, 5, 20));
        System.out.println("Общая сумма заказа #3 с учетом скидок: " + getOrderCost(5, 100, 5,500));
    }

    public static double getOrderCost(int type1ProductsQuantity, double type1ProductCost, int type2ProductsQuantity, double type2ProductCost) {
        final double discount10Percent = 0.9;
        final double discount5Percent = 0.95;

        final int quantityThreshold = 10;
        final int totalCostThreshold = 1000;

        double totalCost = type1ProductsQuantity * type1ProductCost + type2ProductsQuantity * type2ProductCost;
        int totalQuantity = type1ProductsQuantity + type2ProductsQuantity;

        if (totalQuantity >= quantityThreshold && totalCost >= totalCostThreshold) {
            return totalCost * discount10Percent;
        }

        if (totalQuantity >= quantityThreshold || totalCost >= totalCostThreshold) {
            return totalCost * discount5Percent;
        }

        return totalCost;
    }
}
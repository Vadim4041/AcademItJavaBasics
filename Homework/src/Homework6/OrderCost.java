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
        System.out.println("Общая сумма заказа #1 с учетом скидок: " + getOrderCost(1, 5, 500));
        System.out.println("Общая сумма заказа #2 с учетом скидок: " + getOrderCost(5, 5, 500));
        System.out.println("Общая сумма заказа #3 с учетом скидок: " + getOrderCost(5, 5, 1000));
    }

    public static double getOrderCost(int type1GoodsQuantity, int type2GoodsQuantity, int totalCost) {
        if (type1GoodsQuantity + type2GoodsQuantity >= 10 && totalCost >= 1000) {
            return totalCost * 0.9;
        } else if (type1GoodsQuantity + type2GoodsQuantity >= 10 || totalCost >= 1000) {
            return totalCost * 0.95;
        }

        return totalCost;
    }
}
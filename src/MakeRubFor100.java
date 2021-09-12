public class MakeRubFor100 {

    public static void main(String[] args) {
        //,,,,,,,,,,,,,,,,,,Пополняем, не стесняемся!,,,,,,,,,,,,,,,,,,,,,,//
        int balance = 100; //Баланс до пополнения
        int addMoney = 1000; // Сколько добавить ?
        //.................................................................//

        int bonus = 0;

        if (addMoney >= 1000) {
            bonus = addMoney / 100;

        }

        balance += addMoney + bonus;
        System.out.println("Итоговый счёт: " + balance + " рублей." );


        if (bonus != 0)
            System.out.println("Вам начислили: " + bonus + " бонусных рублей.");





    }
}

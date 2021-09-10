public class MakeRubFor100 {

    public static void main(String[] args) {
        //,,,,,,,,,,,,,,,,,,Пополняем, не стесняемся!,,,,,,,,,,,,,,,,,,,,,,//
        int balance = 143; //Баланс до пополнения
        int addMoney = 12321; // Сколько добавить ?
        //.................................................................//

        int bonus = addMoney / 100;
        int balanceAfter = balance + addMoney + bonus;

        if (addMoney < 1000) {
            System.out.println("Спасибо за пополнение Вашего счёта!");
            System.out.println("На вашем счету: " +balanceAfter);
        } else {
            System.out.println("Спасибо за пополнение Вашего счёта!");
            System.out.println("На вашем счету: " + balanceAfter + " рублей");
            System.out.println("Вам начисленно: "+ bonus +" бонус-рублей.");
        }
    }
}
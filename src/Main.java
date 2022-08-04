public class Main {
    public static void main(String[] args) {
        int ticketPrice = 25; // цена на билет
        int bonusForOneMile = 20; // количество рублей за одну милю
        int bonusPrice =  ticketPrice / bonusForOneMile;

        System.out.println("Поздравляем! Вам начислено " + bonusPrice + "  миль  за покупку билета!");
    }

    }

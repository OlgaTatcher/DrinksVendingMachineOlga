import java.util.Scanner;

public class Drinks {
    public static final double COFFEE_PRICE=3.50;
    public static final double TEA_PRICE=1.50;
    public static final double LEMONADE_PRICE=4.50;
    public static final double MOJITO_PRICE=5.50;
    public static final double MINERAL_WATER_PRICE=1.00;
    public static final double COCA_COLA_PRICE=4.50;
    private static int numberOfDrinks=0;
    public static double cost=0.0;


    public Drinks() {
    }
    public int getNumberOfDrinks() {
        return numberOfDrinks;
    }

    public void setNumberOfDrinks(int numberOfDrinks) {
        this.numberOfDrinks = numberOfDrinks;
    }

    public static double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public void makeDrink(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть напій");
        String userChoice=scanner.nextLine().toUpperCase();
        DrinksMachine drink=DrinksMachine.valueOf(userChoice);
        switch (drink){
            case COFFEE:
                System.out.println("Готую каву.");
                break;
            case TEA:
                System.out.println("Чай");
                break;
            case LEMONADE:
                System.out.println("Лимонад");
                break;
            case MOJITO:
                System.out.println("Мохіто");
                break;
            case MINERAL_WATER:
                System.out.println("Мінеральна вода");
                break;
            case COCA_COLA:
                System.out.println("Кока-Кола");
                break;
            default:
                System.out.println("Оберіть напій");
        }


    }

    public void TotalCost(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть напій");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Оберіть кількість");
        String userChoice=scanner.nextLine().toUpperCase();
        DrinksMachine drink=DrinksMachine.valueOf(userChoice);
        Integer userNumber= scanner2.nextInt();

        switch (drink){
            case COFFEE:
                cost=COFFEE_PRICE*userNumber;
                System.out.println("Кава Ціна: "+COFFEE_PRICE+" Кількість "+userNumber+
                        " Загальна вартість: "+cost);
                break;
            case TEA:
                cost=TEA_PRICE*userNumber;
                System.out.println("Чай Ціна: "+TEA_PRICE+" Кількість "+userNumber+
                        " Загальна вартість: "+cost);
                break;
            case LEMONADE:
                cost=LEMONADE_PRICE*userNumber;
                System.out.println("Лимонад Ціна: "+LEMONADE_PRICE+" Кількість "+userNumber+
                        " Загальна вартість: "+cost);
                break;
            case MOJITO:
                cost=MOJITO_PRICE*userNumber;
                System.out.println("Мохіто Ціна: "+MOJITO_PRICE+" Кількість "+userNumber+
                        " Загальна вартість: "+cost);
                break;
            case MINERAL_WATER:
                cost=MINERAL_WATER_PRICE*userNumber;
                System.out.println("Мінеральна вода Ціна: "+MINERAL_WATER_PRICE+" Кількість "+userNumber+
                        " Загальна вартість: "+cost);
                break;
            case COCA_COLA:
                cost=COCA_COLA_PRICE*userNumber;
                System.out.println("Кока-кола Ціна: "+COCA_COLA_PRICE+" Кількість "+userNumber+
                        " Загальна вартість: "+cost);
                break;
            default:
                System.out.println("Оберіть напій");
        }


    }
}

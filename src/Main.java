public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int cost = 11_345; //стоимость билета в рублях

        int miles = service.calculate(cost);

        System.out.println("Начислено: " + miles + " бонусных милей");
    }
}

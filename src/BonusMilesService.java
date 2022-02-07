public class BonusMilesService {
    public int calculate(int cost) {

        int rub = 20; //количество рублей для одной бонусной милей

        int miles = cost / rub; //бонусных милей

        return miles;
    }
}

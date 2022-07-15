public class BonusMilesService {
    public int calculate(int cost) {
        int milePrice = 20;
        int mile = cost / milePrice;
        return mile;
    }
}

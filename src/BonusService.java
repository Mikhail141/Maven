public class BonusService {
    public long calculate(final long amount, final boolean registered) {
        final int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100 / 100;
        final long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}

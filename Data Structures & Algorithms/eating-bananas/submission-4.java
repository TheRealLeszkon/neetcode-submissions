class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int maxPile = 0;

        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        for (int rate = 1; rate <= maxPile; rate++) {

            long hoursSpentEating = 0;

            for (int pile : piles) {
                hoursSpentEating += (pile + (long) rate - 1) / rate;
            }

            if (hoursSpentEating <= h) {
                return rate;
            }
        }

        return maxPile;
    }
}

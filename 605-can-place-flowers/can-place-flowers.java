class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                // Check left and right neighbors
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == len - 1 || flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Place a flower
                    n--; // Decrease required count

                    if (n == 0) return true; // If all flowers are placed, return true

                    i++; // Skip the next index to prevent adjacent placement
                }
            }
        }
        return n <= 0;
    }
}

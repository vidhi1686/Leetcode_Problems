class Solution {

    public int maxPoints(int[][] points) {

        int max = 1;

        for (int i = 0; i < points.length; i++) {

            HashMap<String, Integer> map = new HashMap<>();

            for (int j = i + 1; j < points.length; j++) {

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                // Vertical line
                if (dx == 0) {
                    dy = 1;
                }

                // Horizontal line
                else if (dy == 0) {
                    dx = 1;
                }

                // Normal slope
                else {
                    int gcd = gcd(dx, dy);

                    dx = dx / gcd;
                    dy = dy / gcd;

                    // Keep sign in one fixed direction
                    if (dx < 0) {
                        dx = -dx;
                        dy = -dy;
                    }
                }

                String slope = dy + "/" + dx;

                map.put(slope, map.getOrDefault(slope, 0) + 1);

                max = Math.max(max, map.get(slope) + 1);
            }
        }

        return max;
    }

    public int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
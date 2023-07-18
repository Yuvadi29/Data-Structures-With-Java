public class ContainerWithMaxWater {

    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l < r) {
            int lh = height[l];
            int rh = height[r];
            int min_h = Math.min(lh, rh);
            max = Math.max(max, min_h * (r - 1));
            if (lh < rh) {
                l++;
            }
            r--;
        }
        return max;
    }

}

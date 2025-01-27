public class ContainerMostWater_11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerMostWater_11 obj = new ContainerMostWater_11();
        int result = obj.maxArea(height);
        System.out.println(result);
    }

    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, (right-left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}

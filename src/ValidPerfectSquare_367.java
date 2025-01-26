public class ValidPerfectSquare_367 {
    public static void main (String[] args) {
        int num = 2147395600;

        ValidPerfectSquare_367 obj = new ValidPerfectSquare_367();
        boolean result = obj.isPerfectSquare(num);
        System.out.println(result);
    }

    public boolean isPerfectSquare(int num) {
        int start = 1, end = 46340;

//        int mid = start + (end - start)/ 2;
//        int prod = mid * mid;
//        System.out.println("start => " + start);
//        System.out.println("end => " + end);
//        System.out.println("mid => " + mid);
//        System.out.println("prod => " + prod);
//        return true;
        while (start <= end) {
            int mid = start + (end - start)/ 2;
            int prod = mid * mid;
            System.out.println("start => " + start);
            System.out.println("end => " + end);
            System.out.println("mid => " + mid);
            System.out.println("prod => " + prod);
            if (prod == num) {
                return true;
            } else if (prod > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}

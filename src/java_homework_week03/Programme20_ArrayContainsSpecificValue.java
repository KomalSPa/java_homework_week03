package java_homework_week03;

public class Programme20_ArrayContainsSpecificValue {
    public static boolean contains(int[] array, int item) {
        for (int a : array) {
            if (item == a) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {7894, 9875, 98754, 3215, 324, 58798, 545, 8242, 8213, 012, 050654, 4885, 788888, 6545,};
        System.out.println(contains(array1, 788888));
        System.out.println(contains(array1, 888888));
    }
}

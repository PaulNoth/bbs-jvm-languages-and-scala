package collection;

public class NonGenericJavaArray {
    public static void main(String[] args) {
        Long[] arr = new Long[] {
                1L, 2L, 3L
        };
        Object[] arr2 = arr;
        arr2[2] = "1";
    }
}

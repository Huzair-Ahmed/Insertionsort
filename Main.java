public class Main {
    public static void main(String[] args) {

        Insertion_Sort newsort = new Insertion_Sort();
        int[] numbers = {2,6,9,20,6,1};
        newsort.sortedarray(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }

    }
}
import java.util.*;

public class Nums {
    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));


    //Задача 1, напечатать в консоль нечетные числа из листа
    public void getOddNums() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    //Задача 2, напечатать в консоль четные числа без повторений в порядке возрастания
    public void getUniqEvenNums() {
        Set<Integer> uniqEvenNumbers = new TreeSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                uniqEvenNumbers.add(num);
            }
        }

        for (Integer evenNumber : uniqEvenNumbers) {
            System.out.println(evenNumber);
        }
    }
}

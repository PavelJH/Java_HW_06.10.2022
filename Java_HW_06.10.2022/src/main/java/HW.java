import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите любое слово: ");
        String phrase1 = sc.nextLine();
        System.out.println("Вы ввели: " + phrase1);

        String word = "Michael";
        for (int i = 0; i < word.length() - 1; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println(word.charAt(i));
            }
    }

    {
        String str = new String();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println("Number characters in the given string (including spaces) " + count);
    }

    {

            }
        }
    }

//    {
//    public Employee getEmployeeWithLongestName() {
//        return employees.stream().max(Comparator.comparingInt(e -> e.getName().length())).get();
//    }
////    {
////        String str = "phrase1";
////        int countNulls = 0, countOnes = 0;
////        for (char element : str.toCharArray()) {
////            if (element == '0') countNulls++;
////            if (element == '1') countOnes++;
////
////        }
//    }


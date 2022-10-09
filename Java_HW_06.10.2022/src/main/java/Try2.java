//public class Try2
//{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String line = scanner.nextLine();
//        String[] split = line.split(" ");
//        int[] arr = new int[split.length];
//        int count = 0;
//        for(String s:split) {
//            arr[count] = Integer.parseInt(s);
//            if (arr.length % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
public class Try2 {
    public static void main(String[] args) {
        String habr = "habrahabr";
        // получить длину строки
        int length = habr.length();
        // теперь можно узнать есть ли символ символ 'h' в "habrahabr"
        char searchChar = 'h';
        boolean isFound = false;
        for (int i = 0; i < length; ++i) {
            if (habr.charAt(i) == searchChar) {
                isFound = true;
                break; // первое вхождение
            }
        }
        System.out.println(message(isFound)); // Your char had been found!
        // ой, забыл, есть же метод indexOf
        System.out.println(message(habr.indexOf(searchChar) != -1)); // Your char had been found!
    }

    private static String message(boolean b) {
        return "Your char had" + (b ? " " : "n't ") + "been found!";
    }
}
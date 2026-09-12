public class switch_case {
    public static void main(String[] args) {
        int month = 9;
        switch (month) {
            case 12, 1, 2 -> {
                System.out.println("winter");
            }

            case 3, 4, 5 -> {
                System.out.println("spring");
            }

            case 6, 7, 8 -> {
                System.out.println("summer");
            }

            case 9, 10, 11 -> {
                System.out.println("winter");
            }
            default -> System.out.println("month dont exist");
        }
        int month2 = 13;
        switch (month2) {
            case 12, 1, 2 -> System.out.println("winter");


            case 3, 4, 5 -> System.out.println("spring");


            case 6, 7, 8 -> System.out.println("summer");


            case 9, 10, 11 -> System.out.println("winter");

            default -> System.out.println("month dont exist");

        }




//yield可以让下文使用switch的结果
        int month3 = 13;
        String name = switch (month3) {
            case 12, 1, 2 -> {
                yield ("winter");
            }

            case 3, 4, 5 -> {
                yield ("spring");
            }


            case 6, 7, 8 -> {
                yield ("summer");
            }

            case 9, 10, 11 -> {
                yield ("autumn");
            }

            default -> {
                yield ("month dont exist");
            }

        };
        System.out.println(name);


//{}只有一句话，可省略yield
        int a = 5555;
        int b = 4156;
        String operater = "*";
        int result = switch (operater) {
            case "*" -> a * b;
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            default -> 0;
        };
        System.out.println(result);


    }
}

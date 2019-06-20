package HomeWork.Day0620;

public class E {
    public static void main(String[] args) {
        int age = 44;
        if (age > 60) {
            System.out.println("老年");
        } else {
            if (age > 40 ) {
                System.out.println("中年");
            } else {
                if (age > 18) {
                    System.out.println("少年");
                } else {
                    System.out.println("童年");
                }
            }
        }


    }
}

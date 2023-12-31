import pkg.PackageTest;

public class App {
    public static void main(String[] args) throws Exception {
        // 자료형
        final int NUMBER = 777;
        boolean isTrue = true;
        String stc = "This is String";

        // 참조 자료형
        int[] intArray = new int[] { 1, 2, 3, 4, 5 };

        // Char, Stiring
        String myString = "H";
        char myChar = 'H';
        System.err.println(myString + 10); // H10
        System.err.println(myChar + 10); // 82

        // Condit, Loop
        if (isTrue)
            System.out.println("isTrue");
        for (int i = 0; i < 10; i++)
            System.out.print(i + " ");
        System.out.println("");
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
        for (int number : numbers)
            System.err.print(number + " ");

        // 클래스
        IPhone iphone = new IPhone("IPhone", "Red", 1001010);
        System.out.println(iphone.getModel());

        PackageTest test = new PackageTest();

        // 날짜 시간
    }
}

class IPhone extends Phone {

    IPhone(String model, String color, int price) {
        super(model, color, price);
    }

    @Override
    public String getModel() {
        System.out.println(this.model);
        return this.model;
    }
}

class Phone {
    String model;
    String color;
    int price;

    Phone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
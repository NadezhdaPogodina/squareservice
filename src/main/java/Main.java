import ru.netology.javaqa.services.SquareService;

public class Main {
    public static void main(String[] args) {
        SquareService service = new SquareService();
        int min = 200;
        int max = 300;
        int range = service.calculate(min, max);
        System.out.println(range);


        min = 100;
        max = 400;
        range = service.calculate(min, max);
        System.out.println(range);

        min = 100;
        max = 200;
        range = service.calculate(min, max);
        System.out.println(range);

    }
}

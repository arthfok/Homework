package lesson1;

public class Initialization {
    //выполняется один раз
    static {
        System.out.println("Статический блок");
    }
    //выполняется каждый раз при создании объекта
    {
        System.out.println("Нестатический блок");
    }
    //выполняется после блоков инициализации
    public Initialization() {
        System.out.println("Конструктор класса");
    }



    public static void main(String[] args) {
        Initialization ini = new Initialization();
        System.out.println("Первый объект создан");
        Initialization ini2 = new Initialization();
        System.out.println("Второй объект создан");
    }
}

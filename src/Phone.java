public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами (вызывает конструктор с тремя параметрами)

    public Phone(String number, String model) {
        this(number, model, 0.0); // Вес по умолчанию установлен в 0.0
    }

    // Конструктор без параметров (вызывает конструктор с двумя параметрами)

    public Phone() {
        this("Неизвестно", "Неизвестно"); // Номер и модель установлены в значения по умолчанию
    }

    // Метод receiveCall с одним параметром

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Метод receiveCall с двумя параметрами (перегруженный метод)

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " с номера " + callerNumber);
    }

    // Метод getNumber

    public String getNumber() {
        return number;
    }

    // Метод sendMessage с аргументами переменной длины

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправка сообщения на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public static void main(String[] args) {
        // Создание экземпляров класса Phone

        Phone phone1 = new Phone("111-222-333", "Samsung", 228.0);
        Phone phone2 = new Phone("444-555-666", "Huawey");
        Phone phone3 = new Phone();

        // Вывод значений переменных каждого объекта

        System.out.println("Phone 1: " + phone1.getNumber() + ", " + phone1.model + ", " + phone1.weight + "g");
        System.out.println("Phone 2: " + phone2.getNumber() + ", " + phone2.model + ", " + phone2.weight + "g");
        System.out.println("Phone 3: " + phone3.getNumber() + ", " + phone3.model + ", " + phone3.weight + "g");

        // Вызов метода receiveCall для каждого объекта

        phone1.receiveCall("Витя");
        phone2.receiveCall("Коля", "987-654-321");
        phone3.receiveCall("Вася");

        // Вызов метода sendMessage с аргументами переменной длины

        phone1.sendMessage("111-222-333", "444-555-666");
        phone2.sendMessage("777-888-999");
        phone3.sendMessage("000-111-222", "333-444-555", "666-777-888");
    }
}
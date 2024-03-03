import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        String[][] brands = {
                {"Adidas", "Adidas"},
                {"Adidas", "Runtastic"},
                {"Nike", "Nike"},
                {"Nike", "Converse"}
        };

        ArrayList<Customer> customers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Создание 3 заказов
        for (int i = 0; i < 3; i++) {
            System.out.println("Заказ " + (i + 1));

            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите email: ");
            String email = scanner.nextLine();

            System.out.print("Введите номер телефона: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Список позиций в магазине:");

            // Вывод списка позиций в магазине
            for (int j = 0; j < brands.length; j++) {
                System.out.println((j + 1) + ". " + brands[j][0] + " (" + brands[j][1] + ")");
            }

            System.out.print("Выберите позицию товара (введите номер): ");
            int position = scanner.nextInt();

            System.out.print("Введите количество: ");
            int quantity = scanner.nextInt();

            scanner.nextLine(); // Считываем оставшуюся пустую строку

            String firm = brands[position - 1][1];
            String brand = brands[position - 1][0];

            Customer customer = new Customer(fullName, email, phoneNumber, firm, brand, quantity);
            customers.add(customer);
        }

        // Вывод заказчиков и их заказов
        for (Customer customer : customers) {
            System.out.println("Заказчик: " + customer.getFullName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Номер телефона: " + customer.getPhoneNumber());
            System.out.println("Позиция товара: " + customer.getBrand() + " (" + customer.getFirm() + ")");
            System.out.println("Количество: " + customer.getQuantity());
            System.out.println();
        }
    }
}

class Customer {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String firm;
    private String brand;
    private int quantity;

    public Customer(String fullName, String email, String phoneNumber, String firm, String brand, int quantity) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.firm = firm;
        this.brand = brand;
        this.quantity = quantity;
    }
public String getFullName(){
        return fullName;
}
public String getEmail(){
        return email;
}
public String getPhoneNumber(){
        return phoneNumber;
}
public String getFirm(){
        return firm;
}
public String getBrand(){
        return brand;
}
public int getQuantity(){
        return quantity;
}
}

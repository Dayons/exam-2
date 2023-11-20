package task1;

import java.util.Scanner;

public class UserAccountManager {
    public static void main(String[] args) {
        BasicUserAccount basicUserAccount = new BasicUserAccount();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Создание нового аккаунта:");
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                basicUserAccount.createAccount(name);
                break;
            case 2:
                System.out.println("Просмотр контактов:");
                basicUserAccount.displayAccount();
                break;
            case 3:
                System.out.println("Обновление аккаунта:");
                System.out.print("Введите имя аккаунта для обновления: ");
                String nameToUpdate = scanner.nextLine();
                basicUserAccount.updateAccount(nameToUpdate);
                break;
            case 4:
                System.out.println("Удаление аккаунта:");
                System.out.print("Введите имя аккаунта для удаления: ");
                String nameToDelete = scanner.nextLine();
                basicUserAccount.deleteAccount(nameToDelete);
                break;
            case 0:
                System.out.println("Выход из программы.");
                return;
            default:
                System.out.println("Неверный выбор. Попробуйте ещё раз.");
                break;
            }
        }
    }


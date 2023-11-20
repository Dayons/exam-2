package task1;

public class BasicUserAccount implements UserAccount{

    private final int MAX_ACCOUNT = 100;
    private String[] names = new String[MAX_ACCOUNT];
    private String[] phoneNumbers = new String[MAX_ACCOUNT];
    private int numAccounts = 0;

    @Override
    public void createAccount(String name) {
        if (numAccounts < MAX_ACCOUNT) {
            names[numAccounts] = name;
            numAccounts++;
            System.out.println("Аккаунт успешно добавлен.");
        } else {
            System.out.println("Все заполнено. Нельзя добавить больше аккаунтов.");
        }
    }

    @Override
    public void updateAccount(String name) {
        for (int i = 0; i < numAccounts; i++) {
            if (names[i].equals(name)) {
                System.out.println("Аккаунт успешно обновлен.");
                return;
            }
        }
        System.out.println("Аккаунт с именем " + name + " не найден.");
    }

    @Override
    public void deleteAccount(String name) {
        for (int i = 0; i < numAccounts; i++) {
            if (names[i].equals(name)) {
                for (int j = i; j < numAccounts - 1; j++) {
                    names[j] = names[j + 1];
                    phoneNumbers[j] = phoneNumbers[j + 1];
                }
                numAccounts--;
                System.out.println("Аккаунт успешно удален.");
                return;
            }
        }
        System.out.println("Аккаунт с именем " + name + " не найден.");
    }

    public void displayAccount() {
        if (numAccounts == 0) {
            System.out.println("пусто.");
        } else {
            System.out.println("Аккаунты:");
            for (int i = 0; i < numAccounts; i++) {
                System.out.println("Имя: " + names[i]);
            }
        }
    }
}

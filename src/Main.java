import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1", "qwer1", "Denis", Position.DIRECTOR);
        User user2 = new User("user2", "qwer2", "Anton", Position.ADMINISTRATOR);
        User user3 = new User("user3", "qwer3", "Vlad", Position.MANAGER);
        User user4 = new User("user4", "qwer4", "Ivan", Position.CLIENT);
        User user5 = new User(" ", " ", " ", Position.ANONYMOUS);

        Store store = new Store("Arber", "www.arber.com", new User[]{user1, user2, user3, user4, user5});

        System.out.println(Arrays.toString(store.getUsersShop()));


        boolean s = tryLogin(store);

        while (!s) // !s == True, s == false
        {
            s = tryLogin(store);
        }


    }

    static boolean tryLogin(Store store) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        store.login(login, password);
        boolean isRegistration = store.login(login, password);
        if (isRegistration) {
            store.getCurrentUserRights();
            store.logout();
        }
        if (!isRegistration) {
            System.out.println("Неверный логин и\\или пароль");
        }
        return isRegistration;
    }
}



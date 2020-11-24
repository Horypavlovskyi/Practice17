import java.util.Arrays;

public class Store {
    private String nameShop;
    private String urlShop;
    private User[] usersShop;
    private String authorizedUser;

    public Store(String nameShop, String urlShop, User[] usersShop) {
        this.nameShop = nameShop;
        this.urlShop = urlShop;
        this.usersShop = usersShop;
    }

    public User[] getUsersShop() {
        return usersShop;
    }

    public boolean login(String name, String password) {
        for (int i = 0; i < usersShop.length; i++) {
            if (name.equals(usersShop[i].getLogin()) && password.equals(usersShop[i].getPassword())) {
                authorizedUser = name;
                return true;
            }
        }
        return false;

    }


    void getCurrentUserRights() {
        Position director = Position.DIRECTOR;
        System.out.println(director + " Директор магазина, может управлять кадрами, и ценами");
        Position administrator = Position.ADMINISTRATOR;
        System.out.println(administrator + " Администратор магазина, может добавлять товары и редактировать их описание");
        Position manager = Position.MANAGER;
        System.out.println(manager + " Менеджер магазина, может общаться с клиентами");
        Position client = Position.CLIENT;
        System.out.println((client + " Клиент магазина, может покупать товары и пользоваться дисконтом"));
        Position anonymous = Position.ANONYMOUS;
        System.out.println(anonymous + " Анонимный пользователь, может покупать товары и\\или авторизоваться");
    }

    void logout() {
        authorizedUser = null;
        System.out.println("Пользователь вышел из системы");
    }


}

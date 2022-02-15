package d11;

import com.company.d2.Main;

public class User {
    private final String name;
    private String password;
    private int age;

    public User(String name, String password, int age) {
        this.name = name;
    }

    public static void main(String[] args) {
        User user1 = new User("Koryun", "koryun2005", 16);
        User user2 = new User("Koryun", "koryun2005", 16);
        User user5 = new User("Koryun", "koryun2005", 16);
        User user3 = new User("Koryun", "koryun20052465", 15);
        User user4 = new User("Koryun", "koryun2005", 15);
//        SubUser user3 = new SubUser("KoryunPoqr", "koryun2015", 6);
//        System.out.println(user1.equals(user3));
        User user8 = user3;
        User[] users = {user1, user2, user3, user4, user8};
//        System.out.println(getUserIndex(users, user4));
        System.out.println(user1.equals(user1));
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user5));
        System.out.println(user1.equals(user5));

    }

    public static int getUserIndex(User[] users, User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user)) {
                return i;
            }
        }
        return 1;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    //    @Override
//    public boolean equals(Object obj) {
//        User user = (User) obj;
//        Integer integerAge = user.age;
//        Integer integerthisAge = this.age;
//        return user.age == this.age;
//    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != User.class) {
            return false;
        }
        User user = (User) obj;
        return user.age == this.age
                && user.name.equals(this.name)
                && user.password.equals(this.password);
    }

}

/**
 * Created by leoyats on 05.07.17.
 */
public class Javarush512 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Leo", 25, "Kievska");
        Man man2 = new Man("Leo", 25, "Kievska");

        Woman woman1 = new Woman("Lena", 25,"Vishenka");
        Woman woman2 = new Woman("Lena", 25,"Vishenka");

        System.out.println(man1);
        System.out.println(man2);

        System.out.println(woman1);
        System.out.println(woman2);
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return(name + " " + age + " " + address);
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return(name + " " + age + " " + address);
        }
    }
}

package less4_02;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Леопар","20км/год",7);

        System.out.println("Назва тварини = "+animal.getName()+" Швидкість тварини = "+ animal.getSpeed()+" Вік тварини =  "+ animal.getAge()+" років");

        animal.setName("Бик");
        animal.setAge(14);
        animal.setSpeed("2км/год");

        System.out.println("Назва тварини = "+animal.getName()+" Швидкість тварини = "+ animal.getSpeed()+" Вік тварини =  "+ animal.getAge()+" років");

    }
}

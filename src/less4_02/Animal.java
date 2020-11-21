package less4_02;

public class Animal {
    private String  name;
    private String speed;
    private int age;

    public  Animal (String name, String speed, int age){
        this.name = name;
        this.speed = speed;
        this.age = age;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }




    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSpeed() {
        return speed;
    }


}

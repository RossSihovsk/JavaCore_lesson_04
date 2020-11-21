package less4;

public class Robot {

    public  Robot(String name, String working){
        this.working=working;
        this.name=name;
    }

    public  Robot (){};


    private  String name;
    private String working;


    public  void work (){

        System.out.println("Я "+name+" - я просто "+working);
    }
}


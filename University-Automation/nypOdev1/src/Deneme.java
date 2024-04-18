public class Deneme {
    public String name;
    public int age;
    public  int ID;

    public  Deneme denemes[];



    public Deneme(String name , int age , int ID){
        this.name = name;
        this.age = age ;
        this.ID = ID;
    }

    public Deneme(){};



    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age ;

    }

    public void setID(int id){
        this.ID=id;
    }


    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getID(){
        return this.ID;


    }


}

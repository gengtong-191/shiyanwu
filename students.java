package shiyanwu;

public class students {
    int number;
    int age;
    String sex;
    String name;


    public void setGraduate(String name, String sex,int age,int number) {
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.number = number;
    }


    public String toString () {
        return "姓名:  "  +  name  +  "  性别  "  +  sex  +  "  年龄:  "  +  age  +  "  学号:  "  +  number + "\n";
    }
}
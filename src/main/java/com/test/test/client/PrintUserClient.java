package com.test.test.client;

public class PrintUserClient {

    private String name;
    private int age;

    public PrintUserClient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PrintUserClient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void welcome(){
        if (age >= 18){
            System.out.println("恭喜你"+name+",你成年了");
        }else{
            System.out.println(name + "现在你还是个孩子");
        }
    }
}

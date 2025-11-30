package object_study.basic_study;

public class GirlFriend {
    private String name;
    private int age;
    private double height;
    private double weight;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("年龄设置错误！");
        }
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        if (height >= 150 && height <= 175) {
            this.height = height;
        } else {
            System.out.println("身高设置不合理！");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        if (weight >= 45 && weight <= 60) {
            this.weight = weight;
        } else {
            System.out.println("体重设置不合理！");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void watchTV() {
        System.out.println("欣欣在看电视！");
    }

    public void study() {
        System.out.println("欣欣在学习！");
    }

    public void angry() {
        System.out.println("完damn！欣欣生气啦！");
    }

    public void happy() {
        System.out.println("把欣欣哄好啦！");
    }
}

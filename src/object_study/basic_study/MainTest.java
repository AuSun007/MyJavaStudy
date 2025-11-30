package object_study.basic_study;

public class MainTest {
    public static void main(String[] args) {
//        phoneTest();
        girlFriendTest();
    }

    public static void phoneTest() {
        Phone phone1 = new Phone();
        phone1.setBrand("iPhone");
        phone1.setPrice(100000);
        System.out.println(phone1.getBrand());
        System.out.println(phone1.getPrice());
        phone1.call();
        phone1.playGames();

        Phone phone2 = new Phone();
        phone2.setBrand("小米");
        phone2.setPrice(3999);
        System.out.println(phone2.getBrand());
        System.out.println(phone2.getPrice());
        phone2.call();
        phone2.playGames();
    }

    public static void girlFriendTest() {
        GirlFriend myGirl = new GirlFriend();
        myGirl.setName("欣欣");
        myGirl.setAge(23);
        myGirl.setHeight(155);
        myGirl.setWeight(50);
        System.out.println(myGirl.getName());
        System.out.println(myGirl.getAge());
        System.out.println(myGirl.getHeight());
        System.out.println(myGirl.getWeight());
        myGirl.watchTV();
        myGirl.study();
        myGirl.angry();
        myGirl.happy();
    }
}

package object_study.test4;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("欢迎使用学生信息管理系统！");
        System.out.println("----------------------------");
        System.out.println("1.打印所有学生信息\n2.按照学号搜索并打印学生信息\n3.添加新学生\n4.通过学号删除学生信息\n5.修改学生信息\n6.退出系统");
        System.out.println("----------------------------");
        Scanner sc = new Scanner(System.in);
        Student head = new Student();
        while (true) {
            System.out.println("请输入您想使用的功能序号：");
            int choice = sc.nextInt();
            if (choice == 6) {
                System.out.println("退出系统，期待您的下次使用！");
                System.out.println("----------------------------");
                break;
            }
            switch (choice) {
                case 1: {
                    head.printAllStudents(head);
                    System.out.println("----------------------------");
                    break;
                }
                case 2: {
                    System.out.println("请输入您想搜索的学号：");
                    String id = sc.next();
                    Student front = head.idContains(head, id);
                    if (front != null) {
                        System.out.println("成功找到该学生：");
                        System.out.println(front.getNext().toString());
                    } else {
                        System.out.println("无相应信息！");
                    }
                    System.out.println("----------------------------");
                    break;
                }
                case 3: {
                    Student student = new Student();
                    System.out.println("请输入新加入学生的学号：");
                    String id = sc.next();
                    student.setId(id);
                    System.out.println("请输入新加入学生的姓名：");
                    String name = sc.next();
                    student.setName(name);
                    System.out.println("请输入新加入学生的性别：");
                    String gender = sc.next();
                    student.setGender(gender);
                    System.out.println("请输入新加入学生的年龄：");
                    int age = sc.nextInt();
                    student.setAge(age);
                    if (head.addStudent(head, student)) {
                        System.out.println(student.toString() + "添加成功！");
                    } else {
                        System.out.println("添加失败，学号重复！");
                    }
                    System.out.println("----------------------------");
                    break;
                }
                case 4: {
                    System.out.println("请输入您想删除学生的学号：");
                    String id = sc.next();
                    if (head.deleteStudent(head, id)) {
                        System.out.println("删除成功！");
                    } else {
                        System.out.println("删除失败，找不到对应学生！");
                    }
                    System.out.println("----------------------------");
                    break;
                }
                case 5: {
                    System.out.println("请输入对应学生的原学号：");
                    String id = sc.next();
                    System.out.println("请输入对应学生的新学号：");
                    String newId = sc.next();
                    System.out.println("请输入对应学生的新姓名：");
                    String newName = sc.next();
                    System.out.println("请输入对应学生的新性别：");
                    String newGender = sc.next();
                    System.out.println("请输入对应学生的新年龄：");
                    int newAge = sc.nextInt();
                    if (head.updateStudent(head, id, newId, newName, newGender, newAge)) {
                        System.out.println("修改成功！");
                    } else {
                        System.out.println("修改失败，原学号不存在或者新学号已被使用");
                    }

                    break;
                }
                default: {
                    System.out.println("无相应功能！");
                    System.out.println("----------------------------");
                    break;
                }
            }
            System.out.println("1.打印所有学生信息\n2.按照学号搜索并打印学生信息\n3.添加新学生\n4.通过学号删除学生信息\n5.修改学生信息\n6.退出系统");
            System.out.println("----------------------------");
        }
    }
}

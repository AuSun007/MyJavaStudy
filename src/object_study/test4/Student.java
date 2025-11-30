package object_study.test4;

public class Student {
    private String id;
    private String name;
    private String gender;
    private int age;
    private Student next;

    public Student() {
        this.next = null;
    }

    public Student(String id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.next = null;
    }


    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return next
     */
    public Student getNext() {
        return next;
    }

    /**
     * 设置
     * @param next
     */
    public void setNext(Student next) {
        this.next = next;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", gender = " + gender + ", age = " + age + "}";
    }

    // 打印所有学生信息
    public void printAllStudents(Student head) {
        if (head == null) {
            System.out.println("头指针空异常！");
            return;
        }
        if (head.next == null) {
            System.out.println("没有任何学生信息！");
            return;
        }
        Student p = head.next;
        System.out.println("所有学生信息如下：");
        while (p != null) {
            System.out.println(p.toString());
            p = p.getNext();
        }
    }

    // id是否存在，并返回其前驱
    public Student idContains(Student head, String id) {
        if (head == null) {
            System.out.println("头指针空异常！");
            return null;
        }

        Student front = head;
        while (front.getNext() != null) {
            if (id.equals(front.getNext().getId())) {
                return front;
            }
            front = front.getNext();
        }

        return null;
    }

    // 加入一个新学生
    public boolean addStudent(Student head, Student student) {
        if (head == null) {
            return false;
        }
        if (idContains(head, student.getId()) != null) {
            return false;
        }

        Student p = head;
        while(p.getNext() != null) {
            p = p.getNext();
        }
        p.setNext(student);

        return true;
    }

    // 通过id删除学生信息
    public boolean deleteStudent(Student head, String id) {
        if (head == null) {
            return false;
        }
        Student front = idContains(head, id);
        if (front == null) {
            return false;
        }

        Student p = front.getNext();
        front.setNext(p.getNext());
        p.setNext(null);

        return true;
    }

    // 修改学生信息
    public boolean updateStudent(Student head, String id, String newId, String newName, String newGender, int newAge) {
        Student front = idContains(head, id);
        if (front == null) { // 相应学生不存在则不能修改
            return false;
        }
        if (!newId.equals(id) && idContains(head, newId) != null) { // 新旧id不一样且旧id已存在则不能修改
            return false;
        }

        front.getNext().setId(newId);
        front.getNext().setName(newName);
        front.getNext().setGender(newGender);
        front.getNext().setAge(newAge);

        return true;
    }
}

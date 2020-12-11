package lesson5;

public class Staff {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

    public Staff(String name, int age, String position, String email, String phone, int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;

        System.out.println("Должностьть сотрудников: " + position + "\t---- " + salary);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                '}';
    }
}

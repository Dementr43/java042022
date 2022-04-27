package ru.gb.obalin.Homework5;


public class Employees {
    private String fullName;
    private String position;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;

    public static void main(String[] args) {
    }
    public Employees(String fullName, int age) {
        this(fullName, "Student", "?", "?", 10000, age);
    }
    public Employees(String fullName, String position, int salary, int age) {
        this(fullName, position, "?", "?", salary, age);
    }
    public Employees(String fullName, String position, String phoneNumber, int salary, int age) {
        this(fullName, position, "?", phoneNumber, salary, age);
    }
    public Employees(String fullName, String position, String eMail, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        setAge(age);
    }
    public void printInfo(){
        System.out.print(" FullName: " + fullName + " Position: " + position + " eMail: " + eMail + " PhoneNumber: " + phoneNumber + " Salary: " + salary + " age: " + age);
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }
}

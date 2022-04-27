package ru.gb.obalin.Homework5;

public class Homework5 {
    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Ivanov_Ivan_Ivanovich", 24);
        employees[1] = new Employees("Antonov_Anton_Antonovich", 18);
        employees[2] = new Employees("Vasiliev_Vasili_Vasilievich", "Engineer", "89208471452", 120000, 48);
        employees[3] = new Employees("Ivanov_Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50);
        employees[4] = new Employees("Dmitriev_Dmitriy_Dmitrievich", "Physic", "dmd@yahooo.com", "87945248896", 96000, 36);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40){
                employees[i].printInfo();     // как сделать перенос строки в System.out.println();?
            }                                 // В интернете нашел способ с помощью знака "\n",
        }                                     // но он не сработал. На уроке расскажите об этом, пожалуйста.
    }
}

package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setOwner("Sergey Envald");
        student.setGroup(4);
        student.setReceiptDate("01.09.2015");
        System.out.println("student information\n"
                + "Full name: " + student.getOwner()
                + "\nGroup: " + student.getGroup()
                + "\nReceipt date: " + student.getReceiptDate());
    }
}

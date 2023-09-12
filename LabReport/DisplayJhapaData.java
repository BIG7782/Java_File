
package LabReport;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
  
class Student1 implements Serializable {
    private String name;
    private String address;

    public Student1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address;
    }

    public String getAddress() {
        return address;
    }
}

public class DisplayJhapaData {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input data for three students
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for Student " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();

            Student student = new Student(name, address);
            students.add(student);
        }

        // Serialize and save all students
        try {
            FileOutputStream fileOut = new FileOutputStream("students1.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(students);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in students1.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize and display students whose address is *only* in India
        try {
            FileInputStream fileIn = new FileInputStream("students1.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List<Student> deserializedStudents = (List<Student>) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("\nStudents with address *only* in Jhapa:");
            for (Student student : deserializedStudents) {
                if (student.getAddress().equalsIgnoreCase("Jhapa")) {
                    System.out.println(student);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package Lab03StudentSystem;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void ParseCommand(String[] tokens) {

        String command = tokens[0];
        String name = tokens[1];

        switch (command) {
            case "Create":
                int age = Integer.parseInt(tokens[2]);
                double grade = Double.parseDouble(tokens[3]);
                if (!repo.containsKey(name)) {
                    Student student = new Student(name, age, grade);
                    repo.put(name, student);
                }
                break;
            case "Show":
                if (repo.containsKey(name)) {
                    var student = repo.get(name);
                    String view = String.format("%s is %s years old.", student.getName(), student.getAge());

                    if (student.getGrade() >= 5.00) {
                        view += " Excellent student.";
                    } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                        view += " Average student.";
                    } else {
                        view += " Very nice person.";
                    }

                    System.out.println(view);
                }
                break;
        }
    }
}

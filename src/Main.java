

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        Faculty engineering = new Faculty("Engineering and Sciences");

        Institute mechanical = new Institute("Mechanical Engineering", "Tech Avenue, 5");
        Institute electrical = new Institute("Electrical Engineering", "Tech Avenue, 6");
        engineering.setInstitutes(new Institute[]{mechanical, electrical});

        ResearchAssociate employee1 = new ResearchAssociate(1, "Alice Smith", "alice.smith@example.com", "mechanical");
        ResearchAssociate employee2 = new ResearchAssociate(2, "Bob Johnson", "bob.johnson@example.com", "mechanical");
        ResearchAssociate employee3 = new ResearchAssociate(3, "Charlie Brown", "charlie.brown@example.com", "electrical");
        ResearchAssociate employee4 = new ResearchAssociate(4, "Diana Prince", "diana.prince@example.com", "electrical");

        mechanical.setEmployees(new ResearchAssociate[]{employee1, employee2});
        electrical.setEmployees(new ResearchAssociate[]{employee3, employee4});

        AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee(6,
                "Frank Green", "frank.green@example.com", "admin");

        Project project1 = new Project("Wind Turbine Optimization",
                new SimpleDateFormat("dd.MM.yyyy").parse("01.01.2024"),
                new SimpleDateFormat("dd.MM.yyyy").parse("30.06.2024"), new Participation(3));
        employee1.setProjects(new Project[]{project1});

        Course course1 = new Course("Introduction to Robotics", 30, 80);
        Lecturer lecturer1 = new Lecturer(5, "Eve Adams", "eve.adams@example.com", "electrical");
        lecturer1.setCourses(new Course[]{course1});

        Institute[] institutes = engineering.getInstitutes();
        System.out.println("Institutes in " + engineering.getName() + ": \n");
        for (Institute institute : institutes) {
            System.out.println(institute.getName());
        }
        System.out.println();

        ResearchAssociate[] mechanicalEmployees = mechanical.getEmployees();
        System.out.println("Research Associates in " + mechanical.getName() + ": \n");
        for (ResearchAssociate researchAssociate : mechanicalEmployees) {
            System.out.println(researchAssociate.getName());
        }
        System.out.println();

        ResearchAssociate[] electricalEmployees = electrical.getEmployees();
        System.out.println("Research Associates in " + electrical.getName() + ": \n");
        for (ResearchAssociate researchAssociate : electricalEmployees) {
            System.out.println(researchAssociate.getName());
        }
        System.out.println();

        Project[] projects = employee1.getProjects();
        System.out.println("Projects of " + employee1.getName() + ": \n");
        for (Project project : projects) {
            System.out.println(project.getName());
        }
        System.out.println();

        Course[] courses = lecturer1.getCourses();
        System.out.println("Courses of " + lecturer1.getName() + ": \n");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
        System.out.println();

        System.out.println("Admin:");
        System.out.println();
        System.out.println(administrativeEmployee.getName());
    }
}

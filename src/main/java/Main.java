

public class Main {
    public static void main(String[] args) {

        University university1 = new University("Politech", "Нижегородский государственный технический университет им. Р. Е. Алексеева",
                "НГТУ", 1925, StudyProfile.PHYSICS);

        Student student1 = new Student("Petrov Vanentine", "Politech", 1, 425735752);

        System.out.println(university1);
        System.out.println(student1);

    }
}

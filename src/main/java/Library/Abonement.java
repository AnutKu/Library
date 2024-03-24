package Library;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Abonement {
    public static HashMap<String, ArrayList<String>> tutorToRusBooks;
    public static HashMap<String, ArrayList<String>> tutorToEngBooks;
    public static HashMap<String, ArrayList<String>> studentToRusBooks;
    public static HashMap<String, ArrayList<String>> studentToEngBooks;

    public Abonement(ArrayList<String> allStudents, ArrayList<String> allTutors,
                     ArrayList<String> allRusBooks, ArrayList<String> allEngBooks) {
        tutorToRusBooks = new HashMap<>();
        tutorToEngBooks = new HashMap<>();
        studentToRusBooks = new HashMap<>();
        studentToEngBooks = new HashMap<>();

        Random random = new Random();

for (String tutor : allTutors) {
    int numBooks = random.nextInt(5) + 1; // Random number of books (1 to 5)
    ArrayList<String> selectedRusBooks = new ArrayList<>();
    for (int i = 0; i < numBooks; i++) {
        String selectedBook;
        do {
            int index = random.nextInt(allRusBooks.size());
            selectedBook = allRusBooks.get(index);
        } while (selectedRusBooks.contains(selectedBook)); // Проверяем, содержит ли список уже выбранную книгу
        selectedRusBooks.add(selectedBook);
    }
    tutorToRusBooks.put(tutor, selectedRusBooks);
}

// Fill tutorToEngBooks HashMap
for (String tutor : allTutors) {
    int numBooks = random.nextInt(5) + 1; // Random number of books (1 to 5)
    ArrayList<String> selectedEngBooks = new ArrayList<>();
    for (int i = 0; i < numBooks; i++) {
        String selectedBook;
        do {
            int index = random.nextInt(allEngBooks.size());
            selectedBook = allEngBooks.get(index);
        } while (selectedEngBooks.contains(selectedBook)); // Проверяем, содержит ли список уже выбранную книгу
        selectedEngBooks.add(selectedBook);
    }
    tutorToEngBooks.put(tutor, selectedEngBooks);
}

// Fill studentToRusBooks HashMap
for (String student : allStudents) {
    int numBooks = random.nextInt(5) + 1; // Random number of books (1 to 5)
    ArrayList<String> selectedRusBooks = new ArrayList<>();
    for (int i = 0; i < numBooks; i++) {
        String selectedBook;
        do {
            int index = random.nextInt(allRusBooks.size());
            selectedBook = allRusBooks.get(index);
        } while (selectedRusBooks.contains(selectedBook)); // Проверяем, содержит ли список уже выбранную книгу
        selectedRusBooks.add(selectedBook);
    }
    studentToRusBooks.put(student, selectedRusBooks);
}

// Fill studentToEngBooks HashMap
for (String student : allStudents) {
    int numBooks = random.nextInt(5) + 1; // Random number of books (1 to 5)
    ArrayList<String> selectedEngBooks = new ArrayList<>();
    for (int i = 0; i < numBooks; i++) {
        String selectedBook;
        do {
            int index = random.nextInt(allEngBooks.size());
            selectedBook = allEngBooks.get(index);
        } while (selectedEngBooks.contains(selectedBook)); // Проверяем, содержит ли список уже выбранную книгу
        selectedEngBooks.add(selectedBook);
    }
    studentToEngBooks.put(student, selectedEngBooks);
}
    }

    // Getters for HashMaps
    /*public HashMap<String, ArrayList<String>> getTutorToRusBooks() {
        return tutorToRusBooks;
    }

    public HashMap<String, ArrayList<String>> getTutorToEngBooks() {
        return tutorToEngBooks;
    }

    public HashMap<String, ArrayList<String>> getStudentToRusBooks() {
        return studentToRusBooks;
    }

    public HashMap<String, ArrayList<String>> getStudentToEngBooks() {
        return studentToEngBooks;
    }*/
}

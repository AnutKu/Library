/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import books.FictionbookFactory;
import com.github.javafaker.Faker;
import java.util.Locale;
/**
 *
 * @author Анна
 */
public class BookGenerator {
    public static ArrayList<EnglishFictionBook> all_eng_fic_books = new ArrayList<>();
    public static ArrayList<EnglishTextBook> all_eng_text_book = new ArrayList<>();
    public static ArrayList<RussianFictionBook> all_rus_fic_books = new ArrayList<>();
    public static ArrayList<RussianTextBook> all_rus_text_book = new ArrayList<>();
    private static Random random = new Random();
    private static final List<String> engficliteratureList = Arrays.asList(
            "Harper Lee - To Kill a Mockingbird",
            "George Orwell - 1984",
            "Jane Austen - Pride and Prejudice",
            "F. Scott Fitzgerald - The Great Gatsby",
            "George Orwell - Animal Farm",
            "Aldous Huxley - Brave New World",
            "J.D. Salinger - The Catcher in the Rye",
            "William Golding - Lord of the Flies",
            "J.R.R. Tolkien - The Hobbit",
            "Virginia Woolf - To the Lighthouse",
            "Herman Melville - Moby-Dick",
            "Emily Brontë - Wuthering Heights",
            "Mary Shelley - Frankenstein",
            "Charlotte Brontë - Jane Eyre",
            "Oscar Wilde - The Picture of Dorian Gray",
            "Sylvia Plath - The Bell Jar",
            "J.R.R. Tolkien - The Lord of the Rings",
            "Charles Dickens - A Tale of Two Cities",
            "C.S. Lewis - The Chronicles of Narnia",
            "Charles Dickens - Great Expectations",
            "Agatha Christie - Murder on the Orient Express",
            "Ernest Hemingway - The Old Man and the Sea",
            "Mark Twain - The Adventures of Huckleberry Finn",
            "Gabriel Garcia Marquez - One Hundred Years of Solitude",
            "J.K. Rowling - Harry Potter and the Philosopher's Stone",
            "Ernest Hemingway - The Sun Also Rises",
            "Gabriel Garcia Marquez - Love in the Time of Cholera",
            "Jane Austen - Sense and Sensibility",
            "Kurt Vonnegut - Slaughterhouse-Five",
            "Margaret Atwood - The Handmaid's Tale",
            "George R.R. Martin - A Game of Thrones",
            "Aldous Huxley - Island",
            "Haruki Murakami - Norwegian Wood"
    );

    private static final List<String> englishLevels = Arrays.asList(
            "Beginner",
            "Elementary",
            "Pre-Intermediate",
            "Intermediate",
            "Upper-Intermediate",
            "Advanced",
            "Proficiency"
    );


    public static ArrayList<EnglishFictionBook> generateEngFicBook(int quantity){
        for (int i = 0; i < quantity; i++){
            String randomBook = engficliteratureList.get(random.nextInt(engficliteratureList.size()));
            String randomEnglishLevel = englishLevels.get(random.nextInt(englishLevels.size()));
            int randomYear = random.nextInt(2023 - 1960 + 1) + 1960;
            EnglishFictionBook efb = (EnglishFictionBook) FictionbookFactory.createBook("ENG", randomBook, randomEnglishLevel, randomYear);
            all_eng_fic_books.add(efb);
        }
        return all_eng_fic_books ;}


    private static final List<String> rusficliteratureList = Arrays.asList(
            "Лев Толстой - Война и мир",
            "Федор Достоевский - Преступление и наказание",
            "Антон Чехов - Три сестры",
            "Александр Пушкин - Евгений Онегин",
            "Михаил Булгаков - Мастер и Маргарита",
            "Николай Гоголь - Мертвые души",
            "Иван Тургенев - Отцы и дети",
            "Александр Солженицын - Архипелаг ГУЛАГ",
            "Анна Ахматова - Реквием",
            "Борис Пастернак - Доктор Живаго",
            "Алексей Толстой - Петр Первый",
            "Иван Бунин - Темные аллеи",
            "Андрей Платонов - Чевенгур",
            "Сергей Есенин - Вечером на рейде",
            "Михаил Шолохов - Тихий Дон",
            "Александр Блок - Двенадцать",
            "Владимир Маяковский - Облако в штанах",
            "Николай Лесков - Левша",
            "Иван Бунин - Темные аллеи",
            "Борис Акунин - Азазель",
            "Иван Бунин - Господин из Сан-Франциско",
            "Михаил Лермонтов - Герой нашего времени",
            "Антон Чехов - Вишневый сад",
            "Максим Горький - Мать",
            "Сергей Довлатов - Записные книжки",
            "Михаил Жванецкий - Все смешалось в доме Облонских",
            "Николай Гумилев - Стихотворения",
            "Федор Сологуб - Мелкий бес",
            "Иван Бунин - Темные аллеи",
            "Борис Пастернак - Доктор Живаго");


    public static ArrayList<RussianFictionBook> generateRusFicBook(int quantity){
        for (int i = 0; i < quantity; i++){
            String randomBook = rusficliteratureList .get(random.nextInt(rusficliteratureList.size()));
            int randomYear = random.nextInt(2023 - 1960 + 1) + 1960;
            RussianFictionBook rfb = (RussianFictionBook) FictionbookFactory.createBook("RUS", randomBook, null, randomYear);
            all_rus_fic_books.add(rfb);
        }
        return all_rus_fic_books ;}

    private static final List<String> educationLevels = Arrays.asList(
            "Bachelor's degree",
            "Master's degree",
            "Doctorate (Ph.D.)"
    );

    private static final List<String> courseraCourses = Arrays.asList(
            "Machine Learning",
            "Python for Everybody",
            "Data Science Specialization",
            "Introduction to Computer Science",
            "Neural Networks and Deep Learning",
            "Blockchain Basics",
            "Financial Markets",
            "Introduction to Philosophy",
            "Java Programming and Software Engineering Fundamentals",
            "HTML, CSS, and JavaScript for Web Developers",
            "Algorithms",
            "The Science of Well-Being",
            "Business Foundations",
            "Programming for Everybody (Getting Started with Python)",
            "R Programming",
            "Introduction to Mathematical Thinking",
            "Social Psychology",
            "The Data Scientist’s Toolbox",
            "Big Data",
            "Excel Skills for Business",
            "Web Design for Everybody (Basics of Web Development and Coding)",
            "Photography Basics and Beyond: From Smartphone to DSLR",
            "Machine Learning for Everyone",
            "Programming Languages, Part A",
            "English for Career Development",
            "Statistical Thinking for Data Science and Analytics",
            "Financial Engineering and Risk Management",
            "Responsive Website Development and Design",
            "The Data Science Course"
    );

    public static ArrayList<EnglishTextBook> generateEngTextBook(int quantity){
        for (int i = 0; i < quantity; i++){
            Faker faker = new Faker();
            String englishSurname = faker.name().lastName();
            String universityName = faker.university().name();
            Random random = new Random();
            String course = courseraCourses.get(random.nextInt(courseraCourses.size()));
            int randomYear = random.nextInt(2023 - 1960 + 1) + 1960;
            String randomedlevel = educationLevels .get(random.nextInt(educationLevels.size()));
            EnglishTextBook etb = (EnglishTextBook) TextbookFactory.createBook("ENG", englishSurname,universityName, course, randomedlevel, randomYear,  null );
            all_eng_text_book.add(etb);
        }
        return all_eng_text_book;}

    private static final List<String> subjects = Arrays.asList(
            "Техническая термодинамика",
            "Теория тепломассообмена",
            "Эксплуатация и вывод из эксплуатации ЯЭУ",
            "Теплообмен в ядерных энергетических установках",
            "Контроль и диагностика ядерных энергетических установок",
            "Вычислительная теплофизика",
            "Численные методы в теплофизике",
            "Атомные электрические станции: основы тепловых расчетов",
            "Радиохимия",
            "Расчетно-экспериментальные методы исследования процессов гидродинамики и теплообмена",
            "Ввод, вывод из эксплуатации объектов ядерного топливного цикла",
            "Энергооборудование АЭС",
            "Общая физика (механика)",
            "Ядерные технологии и экология топливного цикла",
            "Основы программирования на Python",
            "Компьютерный практикум",
            "Тепломассообмен",
            "Быстрые реакторы",
            "Ядерные реакторы нового поколения",
            "Теплогидравлические процессы",
            "Гидродинамика",
            "Инженерные расчеты",
            "Проектирование ядерных энергетических установок",
            "Язык Python в научных приложениях"
    );

    private static final List<String> littype = Arrays.asList(
            "учебник", "задачник", "учебное пособие", "методические материалы", "доп главы", "расширенный курс", "практикум");

    public static ArrayList<RussianTextBook> generateRusTextBook(int quantity){
        for (int i = 0; i < quantity; i++){
            Locale russianLocale = new Locale("ru");
            Faker faker = new Faker(russianLocale);
            String fakeSurname = faker.name().lastName();
            String sub = subjects.get(random.nextInt(subjects.size()));
            String litype = littype .get(random.nextInt(littype .size()));
            int randomYear = random.nextInt(2023 - 1960 + 1) + 1960;
            RussianTextBook rtb = (RussianTextBook) TextbookFactory.createBook("RUS", fakeSurname, null, sub , null, randomYear, litype );
            all_rus_text_book.add(rtb);
        }
        return all_rus_text_book;}
    public static ArrayList<String> getAllRusBooks() {
        ArrayList<String> allBooks = new ArrayList<>();

        // Добавление всех элементов с применением метода get_full_title()
    /*for (EnglishFictionBook book : all_eng_fic_books) {
        allBooks.add(book);
    }
    for (EnglishTextBook book : all_eng_text_book) {
        allBooks.add(book);
    }*/
        for (RussianFictionBook book : all_rus_fic_books) {
            allBooks.add(book.get_full_title());
        }
        for (RussianTextBook book : all_rus_text_book) {
            allBooks.add(book.get_full_title());
        }

        return allBooks;
    }

    public static ArrayList<String> getAllEngBooks() {
        ArrayList<String> allBooks = new ArrayList<>();
        for (EnglishFictionBook book : all_eng_fic_books) {
            allBooks.add(book.get_full_title());
        }
        for (EnglishTextBook book : all_eng_text_book) {
            allBooks.add(book.get_full_title());
        }


        return allBooks;
    }
}
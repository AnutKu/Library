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

    public static ArrayList<EnglishFictionBook> generateEngFicBook(int quantity){
        for (int i = 0; i < quantity; i++){
            EnglishFictionBook efb = (EnglishFictionBook) FictionbookFactory.createEngBook();
            all_eng_fic_books.add(efb);
        }
        return all_eng_fic_books ;}

    public static ArrayList<RussianFictionBook> generateRusFicBook(int quantity){
        for (int i = 0; i < quantity; i++){
            RussianFictionBook rfb = (RussianFictionBook) FictionbookFactory.createRusBook();
            all_rus_fic_books.add(rfb);
        }
        return all_rus_fic_books ;}



    public static ArrayList<EnglishTextBook> generateEngTextBook(int quantity){
        for (int i = 0; i < quantity; i++){

            EnglishTextBook etb = (EnglishTextBook) TextbookFactory.createEngBook();
            all_eng_text_book.add(etb);
        }
        return all_eng_text_book;}

    public static ArrayList<RussianTextBook> generateRusTextBook(int quantity){
        for (int i = 0; i < quantity; i++){
            RussianTextBook rtb = (RussianTextBook) TextbookFactory.createRusBook();
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
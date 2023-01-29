

package sptv21library;

import entity.Author;
import entity.Product;

import entity.Reader;
import java.util.List;
import java.util.Scanner;
import manager.BookManager;
import manager.DataManager;
import manager.HistoryManager;
import manager.ReaderManager;
import manager.OborotManager;


public class App {
    private final Scanner scanner;
    private final BookManager bookManager;
    private final ReaderManager readerManager;
    private final HistoryManager historyManager;
    private final DataManager dataManager;
    private final OborotManager oborotManager;
    //private Book[] books;
    private List<Product> products;
    //private Reader[] readers;
    private List<Reader> readers;
 
    private List<Author> oborots;

    public App() {
        scanner = new Scanner(System.in);
        dataManager = new DataManager();
        products = dataManager.loadBooks();
        readers = dataManager.loadReaders();
        
        oborots = dataManager.loadSumma();
        bookManager = new BookManager();
        readerManager = new ReaderManager();
        historyManager = new HistoryManager();
        oborotManager = new OborotManager();
    }
    
    public void run(){
        boolean repeat = true;
        do{
            System.out.println("Задачи: ");
            System.out.println("1. Закончить программу");
            System.out.println("2. Добавить обувь");
            System.out.println("3. список обуви");
            System.out.println("4. Добавить покупателя");
            System.out.println("5. Список зарегистрированных покупателей");
            System.out.println("6. Покупка покупателем продукта");
            System.out.println("7. Оборот магазина за все время работы");
            System.out.println("8. Добавить денег покупателю ");
            System.out.print("Выберите задачу: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 1:
                    repeat = false;
                    break;
                case 2:
                    System.out.println("Добавить обувь");
                    products.add(bookManager.createBookWithAuthors());
                    dataManager.saveBooks(products);
                    break;
                case 4:
                    System.out.println("2. Добавить читателя");
                    readers.add(readerManager.createReader());
                    dataManager.saveReaders(readers);
                    break;
                case 6:
                    System.out.println("3. Выдать книгу");
                     Author history=historyManager.takeOnBook(products, readers);
                    if(history!=null)  {
                     
                     
                    }  
                    oborots.add(oborotManager.createOborotList(oborots));
                    oborotManager.createOborotList(oborots);
                    
                    dataManager.saveBooks(products);
                  
                    dataManager.saveReaders(readers);
                    dataManager.saveSumma(oborots);
                    break;
               
                case 3:
                    System.out.println("6. Список книг");
                    bookManager.printListBooks(products);
                    break;
                case 5:
                    System.out.println("7. Список читателей");
                    readerManager.printListReaders(readers);
                    break;
                case 7:
                    System.out.println("7. Список читателей");
                    oborotManager.printOborotList(oborots);
                    break;
                
                case 8:
                    System.out.println("8. Редактирование читателя");
                    this.readers = readerManager.changeReader(readers);
                    break;
                default:
                    System.out.println("Выберите задачу из списка!");;
            }
        }while(repeat);
        System.out.println("Закрытие программы, пока!");
    }

//    private void addBook(Book book) {
//        this.books = Arrays.copyOf(this.books, this.books.length+1);
//        this.books[this.books.length - 1] = book;   
//    }
//    private void addReader(Reader reader) {
//        this.readers = Arrays.copyOf(this.readers, this.readers.length+1);
//        this.readers[this.readers.length - 1] = reader;   
//    }
//    private void addHistory(History histories) {
//        this.histories = Arrays.copyOf(this.histories, this.histories.length+1);
//        this.histories[this.histories.length - 1] = histories;   
//    }
}

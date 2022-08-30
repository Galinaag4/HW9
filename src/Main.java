public class Main {
    public static void main(String[] args) {
        Book one= new Book("Классика","Борис Виан",1974);
        Author BookOne = new Author("Борис","Виан");



        System.out.println(one.getNameBook()+one.getAge()+one.getAuthor());
    }

}
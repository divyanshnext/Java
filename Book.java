public class Book {

    private String title;
    private int publicationYear;
//constructor

    public Book(String title , int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){
        return title;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public void displayBookDetail(){


        
    }

    public static void main(String[] args){
        Book book = new Book("OnePiece",2000);

        System.out.println("title: "+book.getTitle());
        System.out.println("publication: "+book.getPublicationYear());
        book.displayB
    }


}

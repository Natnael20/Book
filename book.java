package creatingBook;
import java.util.Scanner;

public class book {

    String författare;
    String titel;
    int år;

    String författare1;

    public book(String För, String Tit, int År) {
        this.författare = För;
        this.titel = Tit;
        this.år = År;

    }

    //userinput
    Scanner scanner = new Scanner(System.in);
    
    //regular/concrete method
    public String getSummary() {
        return "Författaren av boken är " + this.författare + "." + " Bokens titel är "
                + this.titel + "." + " Utgivningsår är " + this.år ;

    }
    //setter/mutator method
    //new author
    public void setbokBytf(String f){
        författare = f;

    }
    //get/accessor method
    //get the name of author
    public String getBokFörfattare() {
        return författare;
    }

    //setter/mutator method
    //new book titel
    public void setbOkbytTitel(String newTitel) {
        titel = newTitel;
        System.out.println("Ny title" + titel);
    }
    //getter method
    //name/get the titel of the book
    public String getBokTitel() {
        return titel;
    }
    //setter method
    //a new release year of a book
    public void setBokbytÅr(int newÅr) {
        år = newÅr;
        System.out.println("Ny år " + år);
    }
    //getter method
    //the year of the new book release
    public int getBokBytÅr() {
        return år;
    }
    //summary of the book
    public void getSummary2() {
        System.out.println("författaren är " + getBokFörfattare() + ". Titel är " + getBokTitel()
        + ". Utgivningsår är " + getBokBytÅr());
    }
}
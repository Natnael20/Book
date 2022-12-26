package creatingBook;
import java.util.*;
import java.io.*;
public class Main {

      public static void getInfo(Object a, Object b , Object c, Object d) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("1. Första boken");
            System.out.println("2. Andra borken");
            System.out.println("3, Tredje boken");
            System.out.println("4, Fjärde boken");

            System.out.println("Välja en från följande alternativ");
            int val = input2.nextInt();

            switch (val) {
                  case 1 : System.out.println(a);
                        break;
                  case 2 : System.out.println(b);
                        break;
                  case 3 : System.out.println(c);
                        break;
                  case 4 : System.out.println(d);
                        break;
                  default:
                        System.out.println("out of alternativ");
                        break;


            }
      }
      static String getInfo1() {
            return "1. Första boken" + "\n" + "2. Andra borken" + "\n" + "3, Tredje boken"
                    + "\n" + "4, Fjärde boken";

      }


      public static void main(String args[]) throws Exception {


            Scanner input = new Scanner(System.in);

            System.out.println("Uppgift 1");
            book minBook = new book("Collean Hoover", "Verity", 2020);

            System.out.println(minBook.getSummary());

            System.out.println("\nUppgift 2 och 3");
            minBook.setbokBytf("Gillian Flynn");
            minBook.setbOkbytTitel("Gone Girl");
            minBook.setBokbytÅr(2012);

            minBook.getSummary2();

            System.out.println("\nUppgift 4 och 5");

            book[] Booklista = new book[4];

            char svar;

            Booklista[0] = new book("Alex Michaelides", "Den Tysta patienten", 2019);
            Booklista[1] = new book("Lucy Foley", "The guest list", 2020);
            Booklista[2] = new book("Stephen King", " Fairy tale", 2022);
            Booklista[3] = new book("Caroline Kepnes","You", 2014);


            System.out.println("Vill du skriva ut alla bökerna skriva endast j");
            svar = input.next().charAt(0);

            if (svar == 'j') {
                  for(book output : Booklista)
                        System.out.println("\n" + output.getSummary());

            } else {
                  System.out.println("Hej då!");
            }


            System.out.println("uppgift 6");


            Object a = Booklista[0].getSummary(), b = Booklista[1].getSummary(),
                    c = Booklista[2].getSummary(), d = Booklista[3].getSummary();
            getInfo(a, b, c, d);



            // Användaren skall nu hela tiden kunna
            //välja mellan att mata in en ny Bok eller att skriva ut data för en redan
            //inmatad Bok. Låt användaren välja Bok genom att ange indexnummret i boklista.
            System.out.println("uppgift 7");

            List<book> booklist1 = new ArrayList<>();
            Collections.addAll(booklist1, Booklista);
            String svar1;
            int svar2;
            String författare;
            char next;

            try {
                  System.out.println("get data");
                  svar1 = input.next();
                  if(svar1.equalsIgnoreCase("ja")) {
                        booklist1.add(new book(input.next(), input.next(), input.nextInt()));
                  }
            }

            catch (Exception e){
                  System.out.println("Bara ord tillåter! " + e);
            }




            else if(svar1.equalsIgnoreCase("nej")) {
                  //nested conditional statements
                  try {
                        System.out.println("få index av boken här");
                        svar2 = input.nextInt();
                        if (svar2 == 1) {
                              System.out.println(booklist1.get(0).getSummary());
                        }

                        else if (svar2 == 2) {
                              System.out.println(booklist1.get(1).getSummary());
                        }

                        else if (svar2 == 3) {
                              System.out.println(booklist1.get(2).getSummary());
                        }
                        else if (svar2 == 4) {
                              System.out.println(booklist1.get(3).getSummary());
                        }
                  }

                  catch(NumberFormatException e) {
                        System.out.println("Bara nummer tillåter!" + e);
                  }
            }
            
            else {
                System.out.println("Hej då");
          }

            System.out.println("Uppgift 8");
            System.out.println("skriv bokens författare");

                  författare = input.nextLine();
                  switch (författare) {
                        case "Alex Michaelides":
                              System.out.println(booklist1.get(0).getSummary());
                              break;
                        case "Lucy Foley":
                              System.out.println(booklist1.get(1).getSummary());
                              break;
                        case "Stephen King":
                              System.out.println(booklist1.get(2).getSummary());
                              break;
                        case "Caroline Kepnes":
                              System.out.println(booklist1.get(3).getSummary());
                              break;
                        default:
                              System.out.println("Namnet kunde inte hittas, försök igen!");
                              break;
                  }
      }
}

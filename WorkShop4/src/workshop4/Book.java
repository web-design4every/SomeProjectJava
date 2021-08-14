package WorkShop4;
import java.util.*;
public class Book
{
    public String title;
    
    public String author;
    
    public int pages;
    
    public boolean fiction;
    public Book(){
    }
    public Book(String title,String author,int pages,boolean fiction)
    {   this.title=title;
        this.author=author;
        this.pages=pages;
        this.fiction=fiction;
    }
     public String getTitle()
    {
        return title;
    }
    
     public String getAuthor()
    {
        return author;
    }
    public int getPages()
    {
        return pages;
    }
    public boolean fiction()
    {
        return fiction;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }
    
     public void setAuthor(String author)
    {
       this.author=author;
    }
    public void setPages(int pages)
    {
        this.pages=pages;
    }
    public void setFiction(boolean fiction)
    {
        this.fiction=fiction;
    }    
    
    public String toString()
    {
        return "Title: " + title + "    , Author: " + author + "   , noOfPages: " + pages + "    , Fiction: " + fiction;
    }
    public void input() {
        Scanner t = new Scanner(System.in);
        System.out.print("Input title: ");
        title = t.nextLine();
        System.out.print("Input author: ");
        author = t.nextLine();
        System.out.print("Input no of pages: ");
        pages = t.nextInt();
        System.out.print("This book is fiction?: ");
        fiction = t.nextBoolean();
    }
    public static void main(String args[]){
        int a,i;
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> BookList = new ArrayList <>();
        System.out.println("Book Information.");
        System.out.println("==================");
        System.out.print("Input number of Book: ");
        a=sc.nextInt();
        for(i=0;i<a;i++)
        {
            System.out.println("\nInput details of book no. " + (i + 1) + ":\n");
            Book bo = new Book();
            bo.input();
            BookList.add(bo);
        }
        System.out.println("\n-----Details of the Books-----");
        for (i = 0; i < BookList.size(); i++) {
            System.out.println(BookList.get(i).toString());
        }
    }
}

    
    
    
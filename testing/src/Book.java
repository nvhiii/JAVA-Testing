public class Book {

    private String title;
    private String author;
    private String tableOfContents = "";
    private int nextPage = 1;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void addChapter(String title, int pages) {
        tableOfContents = tableOfContents.concat("\n" + title + "..." + nextPage);
        nextPage += pages;
    }

    public int getPages() {
        return nextPage - 1;
    }

    public String getTableOfContents() {
        return tableOfContents;
    }

    public String toString() {
        return title + "\n" + author;
    }

}

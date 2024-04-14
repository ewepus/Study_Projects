package Demo_work_9;

public class Book {
    protected String title;
    protected String author;
    protected Double price;

    public Book(String title, String author, Double price) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    public void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        String[] array = author.split(" ");
        if (array.length > 2 || Character.isDigit(array[0].charAt(0)) || Character.isDigit(array[1].charAt(0))) {
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }

    public void setPrice(Double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}

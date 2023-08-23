package inheritance;

public class Review {

    private  String body;
    private  String author;

    private int Stars;



    public Review(String body,String author,int Stars) {
        this.body = body;
        this.author=author;
        this.Stars=Stars;

    }

    public String getAuthor() {
        return author;
    }

    public  String getBody(){
        return  body;

    }

    public int getStars(){

        return Stars;
    }

    @Override
    public  String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", Stars=" + Stars +
                '}';
    }



}

package board.example.ottboard.Model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Review {
    public Review(){

    }
    public Review(String author, String title, String content, String ott, Calendar datetime){
        this.author = author;
        this.title = title;
        this.content = content;
        this.ott = ott;
        this.datetime = datetime;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOtt() {
        return ott;
    }

    public void setOtt(String ott) {
        this.ott = ott;
    }


    private String author;
    private String title;
    private String content;
    private String ott;

    public Calendar getDatetime() {
        return datetime;
    }

    public void setDatetime(Calendar datetime) {
        this.datetime = datetime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar datetime;
}

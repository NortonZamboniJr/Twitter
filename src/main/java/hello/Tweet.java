package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tweet {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String tweet;
 

    protected Tweet() {}

    public Tweet(String tweet) {
        this.tweet = tweet;
       
    }

    @Override
    public String toString() {
        return tweet;
    }

}
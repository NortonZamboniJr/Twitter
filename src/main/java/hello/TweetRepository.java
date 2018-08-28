package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TweetRepository extends CrudRepository<Tweet, Long> {

    List<Tweet> findByLastName(String tweet);
}

package board.example.ottboard.Service;

import board.example.ottboard.Model.Review;
import board.example.ottboard.Repository.ReviewRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.List;

@Service
@Transactional
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }
    public void create(String author, String title, String content, String ott){
        System.out.println(author);
        Review newReview = new Review(author, title, content, ott, Calendar.getInstance());
        reviewRepository.save(newReview);
    }

    public List<Review> getAllReviews(){
        return reviewRepository.findAll();
    }

    public Review getReview(Long id){
        return reviewRepository.findById(id).get();
    }
}

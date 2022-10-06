package board.example.ottboard.Controller;

import board.example.ottboard.Model.Review;
import board.example.ottboard.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/reviews")
@Controller
public class ReviewController {
    private ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService){
        this.reviewService = reviewService;
    }

    @PostMapping("")
    @ResponseBody
    public String write(@RequestBody ReviewInfo reviewInfo){
        reviewService.create(
                reviewInfo.getAuthor(),
                reviewInfo.getTitle(),
                reviewInfo.getContent(),
                reviewInfo.getOtt());
        return reviewInfo.title;
    }

    @GetMapping("")
    @ResponseBody
    public List<Review> getList(){
        return reviewService.getAllReviews();
    }

    @GetMapping("/{id}")
    public String getReview(@PathVariable Long id, Model model){
        Review review = reviewService.getReview(id);
        model.addAttribute("review", review);
        return "reviewPage";
    }

    static class ReviewInfo{
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

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        private String title;
        private String content;
        private String ott;
        private String author;

    }
}

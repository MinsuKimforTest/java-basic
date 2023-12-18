package class1.ex;


public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview("인셉션", "review1");
        MovieReview movieReview2 = new MovieReview("타이타닉", "review2");
        System.out.println("movieReview = " + movieReview1.getTitle());
        System.out.println("movieReview = " + movieReview1.getReview());

        System.out.println("movieReview = " + movieReview2.getTitle());
        System.out.println("movieReview = " + movieReview2.getReview());

    }
}

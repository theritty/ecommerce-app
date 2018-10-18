package com.bookstore;

import com.bookstore.model.*;
import com.bookstore.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService, CategoryService categoryService, ReviewService reviewService, ReviewProductService reviewProductService,  CustomerService customerService) {
        return args -> {
            categoryService.save(new Category(1L, "Literature & Fiction",  "assets/images/1.jpg"));
            categoryService.save(new Category(2L, "Children's Books",  "assets/images/2.jpg"));
            categoryService.save(new Category(3L, "Biography & Memoir",  "assets/images/3.jpg"));
            categoryService.save(new Category(4L, "Mystery & Thriller",  "assets/images/4.jpg"));
            categoryService.save(new Category(5L, "History",  "assets/images/5.jpg"));
            categoryService.save(new Category(6L, "Cookbooks, Food & Wine",  "assets/images/1.jpg"));
            categoryService.save(new Category(7L, "Comics & Graphic Novels",  "assets/images/2.jpg"));
            categoryService.save(new Category(8L, "Arts & Entertainment",  "assets/images/3.jpg"));
            productService.save(new Product(1L, "The Medical Examiner","Test Author", "Both survivors of the divorce wars, Christy and Martin don't believe in love at first sight and certainly not on a first date. But from the instant they lock eyes, life becomes a sexy, romantic dream come true.", 1L, 300.00, 0.25,false, false,  "assets/images/4.jpg", 9 ));
            productService.save(new Product(2L, "The President Is Missing","", "",1L, 200.00, 0.0,false, false, "assets/images/5.jpg", 9 ));
            productService.save(new Product(3L, "Crazy Rich Asians","", "",1L, 100.00, 0.1,true, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(4L, "Before We Were Yours","", "",1L, 5.00, 0.50,false, false, "assets/images/2.jpg", 9 ));
            productService.save(new Product(5L, "Napoleone All'isola D'elba","", "",1L, 3.00, 0.0,false, false, "assets/images/3.jpg", 9 ));
            productService.save(new Product(6L, "The Handmaid's Tale","", "",1L, 500.00, 0.0,false, false, "assets/images/4.jpg", 9 ));
            productService.save(new Product(7L, "Camino Island","", "",1L, 30.00, 0.0,false, false, "assets/images/5.jpg", 9 ));
            productService.save(new Product(8L, "See Me","", "",1L, 3000.00, 0.0,true, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(9L, "TO KILL A MOCKINGBIRD","", "",1L, 20.00, 0.6,false, true, "assets/images/2.jpg", 9 ));
            productService.save(new Product(10L, "The Outsider : A Novel","", "",1L, 15.00, 0.3,false, false, "assets/images/3.jpg", 9 ));
            productService.save(new Product(11L, "GREAT ALONE","", "",1L, 5.00, 0.0,false, false, "assets/images/4.jpg", 9 ));
            productService.save(new Product(12L, "Fahrenheit 451","", "",1L, 3.00, 0.0,true, false, "assets/images/5.jpg", 9 ));
            productService.save(new Product(13L, "MILK AND HONEY","", "",1L, 800.00, 0.2,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(14L, "Game of Thrones Paperback Boxed Set","", "",1L, 3.00, 0.0,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(15L, "CATCHER IN THE RYE","", "",1L, 30.00, 0.25,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(16L, "LOST SYMBOL","", "",1L, 23.00, 0.0,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(17L, "Every Breath - Hardcover","", "",1L, 12.00, 0.0,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(18L, "The Black Book","", "",1L, 6.00, 0.0,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(19L, "The Sun and Her Flowers","", "",1L, 3.00, 0.0,true, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(20L, "A DOG'S PURPOSE (MTI)","", "",1L, 40.00, 0.0,false, true, "assets/images/1.jpg", 9 ));
            productService.save(new Product(21L, "CHINA RICH GIRLFRIEND","", "",1L, 60.00, 0.0,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(22L, "DETECTIVE CROSS (BOOKSHOTS)","", "",1L, 33.00, 0.0,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(23L, "TWO BY TWO","", "",1L, 1000.00, 0.0,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(24L, "DOCTOR SLEEP","", "",1L, 50.00, 0.0,true, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(25L, "A DOG'S PURPOSE - MTI","", "",1L, 12.00, 0.0,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(26L, "x","", "",2L, 12.00, 0.0,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(27L, "y","", "",3L, 12.00, 0.0,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(28L, "z","", "",4L, 12.00, 0.0,false, false, "assets/images/1.jpg", 9 ));
            productService.save(new Product(29L, "t","", "",5L, 12.00, 0.0,false, false, "assets/images/1.jpg", 9 ));

            customerService.save(new Customer(1L, "John"));
            reviewService.save(new Review(1L, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce elementum dignissim mauris, et gravida felis eleifend euismod."));
            customerService.save(new Customer(2L, "Jane"));
            reviewService.save(new Review(2L, "Curabitur varius, tellus sollicitudin euismod tincidunt, nibh diam maximus dui, ac vulputate libero mauris ac ipsum. Mauris "));
            customerService.save(new Customer(3L, "Mary"));
            reviewService.save(new Review(3L, "Quisque sed mi dictum orci rutrum condimentum. Cras vitae scelerisque nunc. Cras sit amet quam tincidunt, volutpat velit at, finibus dolor."));
            customerService.save(new Customer(4L, "William"));
            reviewService.save(new Review(4L, "Ut vel massa id ante fermentum pellentesque. Integer ipsum dui, fringilla vitae eros in, lobortis semper justo. Donec orci eros, tincidunt ut "));

            Product tmp = productService.getProduct(1L);
            List<ReviewProduct> reviewProductList = new ArrayList<>();
            reviewProductList.add(reviewProductService.create(new ReviewProduct(tmp, customerService.getCustomer(1L), reviewService.getReview(1L))));
            reviewProductList.add(reviewProductService.create(new ReviewProduct(tmp, customerService.getCustomer(2L), reviewService.getReview(2L))));
            reviewProductList.add(reviewProductService.create(new ReviewProduct(tmp, customerService.getCustomer(3L), reviewService.getReview(3L))));
            reviewProductList.add(reviewProductService.create(new ReviewProduct(tmp, customerService.getCustomer(4L), reviewService.getReview(4L))));

            tmp.setReviewProducts(reviewProductList);

            productService.update(tmp);

            System.out.println("Hello");

//            reviewService.updateCId(1L, 1L);


        };
    }
}

package lk.avalanche.battlebuddy.repository;

import com.sun.image.codec.jpeg.JPEGDecodeParam;
import lk.avalanche.battlebuddy.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/26/2019
 * Time: 8:12 PM}
 */


public interface CommentRepository extends JpaRepository<Comment, Integer> {
}

package lk.avalanche.battlebuddy.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/24/2019
 * Time: 12:12 AM}
 */

@Entity
@Table(name = "subcomment")
public class SubComment {

    @Id
    @GeneratedValue()
    @Column(name = "user_id")
    private int subCommentId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "comment_id")
    private int commentId;

    @Column(name = "body")
    private String body;

    @Column(name = "likes")
    private int likes;

    @Column(name = "created_time")
    private Date createdTime;

    public SubComment() {
    }

    public SubComment(int userId, int commentId, String body, int likes, Date createdTime) {
        this.userId = userId;
        this.commentId = commentId;
        this.body = body;
        this.likes = likes;
        this.createdTime = createdTime;
    }

    public int getSubCommentId() {
        return subCommentId;
    }

    public void setSubCommentId(int subCommentId) {
        this.subCommentId = subCommentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}

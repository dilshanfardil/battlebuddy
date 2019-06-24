package lk.avalanche.battlebuddy.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/24/2019
 * Time: 12:00 AM}
 */

@Entity
@Table(name = "comment")
public class CommentEntity {

    @Id
    @GeneratedValue()
    @Column(name = "comment_id")
    private int commentId;


    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private UserEntity user;

    @Column(name = "feed_id")
    private int feedId;

    @Column(name = "body")
    private String body;

    @Column(name = "likes")
    private int likes;

    @Column(name = "created_time")
    private Date createdTime;

    public CommentEntity() {
    }

    public CommentEntity(UserEntity user, int feedId, String body, int likes, Date createdTime) {
        this.user = user;
        this.feedId = feedId;
        this.body = body;
        this.likes = likes;
        this.createdTime = createdTime;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public int getFeedId() {
        return feedId;
    }

    public void setFeedId(int feedId) {
        this.feedId = feedId;
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
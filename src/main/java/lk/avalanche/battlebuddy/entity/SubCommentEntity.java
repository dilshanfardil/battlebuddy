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
public class SubCommentEntity {

    @Id
    @GeneratedValue()
    @Column(name = "user_id")
    private int subCommentId;


    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "comment_id",referencedColumnName = "comment_id")
    private CommentEntity comment;

    @Column(name = "body")
    private String body;

    @Column(name = "likes")
    private int likes;

    @Column(name = "created_time")
    private Date createdTime;

    public SubCommentEntity() {
    }

    public SubCommentEntity(UserEntity user, CommentEntity comment, String body, int likes, Date createdTime) {
        this.user = user;
        this.comment = comment;
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public CommentEntity getComment() {
        return comment;
    }

    public void setComment(CommentEntity comment) {
        this.comment = comment;
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

package lk.avalanche.battlebuddy.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/24/2019
 * Time: 10:00 PM}
 */


public class SubCommentDTO extends SuperDTO {

    private int subCommentId;
    private int userId;
    private int commentId;
    private String body;
    private int likes;
    private Date createdTime;

    public SubCommentDTO() {
    }

    public SubCommentDTO(int subCommentId, int userId, int commentId, String body, int likes, Date createdTime) {
        this.subCommentId = subCommentId;
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

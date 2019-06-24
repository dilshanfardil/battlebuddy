package lk.avalanche.battlebuddy.entity;

import javax.persistence.*;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/24/2019
 * Time: 12:08 AM}
 */


@Entity
@Table(name = "feed")
public class FeedEntity {

    @Id
    @GeneratedValue()
    @Column(name = "feed_id")
    private int feedId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "title")
    private String title;

    @Column(name = "video")
    private byte[] video;

    @Column(name = "likes")
    private int likes;

    @Column(name = "text")
    private String text;

    public FeedEntity() {
    }

    public FeedEntity(int userId, String title, byte[] video, int likes, String text) {
        this.userId = userId;
        this.title = title;
        this.video = video;
        this.likes = likes;
        this.text = text;
    }

    public int getFeedId() {
        return feedId;
    }

    public void setFeedId(int feedId) {
        this.feedId = feedId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getVideo() {
        return video;
    }

    public void setVideo(byte[] video) {
        this.video = video;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

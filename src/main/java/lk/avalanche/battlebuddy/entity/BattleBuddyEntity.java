package lk.avalanche.battlebuddy.entity;

import javax.persistence.*;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/23/2019
 * Time: 11:47 PM}
 */

@Entity
@Table(name = "battelbuddy")
public class BattleBuddyEntity {

    @Id
    @GeneratedValue()
    @Column(name = "battel_buddy_id")
    private int battleBuddyId;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private UserEntity user;

    @Column(name = "console")
    private String console;

    @Column(name = "region")
    private String region;

    @Column(name = "game_name")
    private String gameName;

    @Column(name = "voice_chat")
    private int voiceChat;

    @Column(name = "language")
    private String language;

    @Column(name = "text")
    private String text;

    public BattleBuddyEntity() {
    }

    public BattleBuddyEntity(UserEntity user, String console, String region, String gameName, int voiceChat, String language, String text) {
        this.user = user;
        this.console = console;
        this.region = region;
        this.gameName = gameName;
        this.voiceChat = voiceChat;
        this.language = language;
        this.text = text;
    }

    public int getBattleBuddyId() {
        return battleBuddyId;
    }

    public void setBattleBuddyId(int battleBuddyId) {
        this.battleBuddyId = battleBuddyId;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getVoiceChat() {
        return voiceChat;
    }

    public void setVoiceChat(int voiceChat) {
        this.voiceChat = voiceChat;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

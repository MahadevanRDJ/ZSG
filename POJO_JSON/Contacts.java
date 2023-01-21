package JSON_POJO;

import java.util.ArrayList;

public class Contacts {

    private String id;
    private String middle_name;
    private String nickname;
    private ArrayList<String> phone_nos;
    private String first_name;
    private Long ctime;
    private String zuid;
    private Long lmtime;
    private String last_name;

    
    public Contacts(String id, String middle_name, String nickname, ArrayList<String> phone_nos, String first_name,
            Long ctime, String zuid, Long lmtime, String last_name) {
        this.id = id;
        this.middle_name = middle_name;
        this.nickname = nickname;
        this.phone_nos = phone_nos;
        this.first_name = first_name;
        this.ctime = ctime;
        this.zuid = zuid;
        this.lmtime = lmtime;
        this.last_name = last_name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMiddle_name() {
        return middle_name;
    }
    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public ArrayList<String> getPhone_nos() {
        return phone_nos;
    }
    public void setPhone_nos(ArrayList<String> phone_nos) {
        this.phone_nos = phone_nos;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public long getCtime() {
        return ctime;
    }
    public void setCtime(long ctime) {
        this.ctime = ctime;
    }
    public String getZuid() {
        return zuid;
    }
    public void setZuid(String zuid) {
        this.zuid = zuid;
    }
    public long getLmtime() {
        return lmtime;
    }
    public void setLmtime(long lmtime) {
        this.lmtime = lmtime;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}


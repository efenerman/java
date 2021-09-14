package Entities;

import java.util.Date;

public class Gamer extends Customer{
    private String nickName;

    public Gamer(int id, String firstName, String lastName, Date dateofBirth, String nationalId,String nickName) {
        super(id, firstName, lastName, dateofBirth, nationalId);
        this.nickName=nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}

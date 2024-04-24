package com.fengtaisec.d23_api_object;
// Cloneable 标记接口
// 规则
public class User implements Cloneable{
    private int id;
    private String username;

    public User() {
    }

    private String password;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // super调用object的clone方法
        User u2 = (User) super.clone();
        u2.scores = u2.scores.clone();
        return u2;

    }

    public User(int id, String username, String password, double[] scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    private double[] scores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }


}

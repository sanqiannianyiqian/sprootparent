package cn.tedu.pojo;

/**
 * @author Mangmang
 * @date 2020/2/7 22:22
 */
public class User {
    //满足驼峰命名
    //user_id,user_name,user_age
    //一旦使用实体类封装有现实意义的数据必须使用封装类型
    //LONG INTEGER DOUBLE FLOAT作为属性类型使用。
    private Integer userId;
    private String userName;
    private Integer userAge;

    public Integer  getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}

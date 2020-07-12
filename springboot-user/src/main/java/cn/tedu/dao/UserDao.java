package cn.tedu.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author Mangmang
 * @date 2020/2/8 20:54
 */
public interface UserDao {
    /**
     * 增加用户积分
     * @param user_id 要增加积分的用户编号
     * @param point 要增加的积分
     */
    void addPoint(@Param("user_id") String user_id, @Param("point") int point);

    /**
     * 查询用户积分
     * @param userId 要查询的用户id
     * @return 查询到的用户积分
     */
    int queryPoint(String userId);
}

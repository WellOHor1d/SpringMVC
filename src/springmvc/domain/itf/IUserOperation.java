package springmvc.domain.itf;

import springmvc.domain.User;

import java.util.List;

/**
 * Created by XY on 2016/12/8.
 */
public interface IUserOperation {
    public User selectUserByID(int id);
    public List selectUsers(String userName);
    public void addUser(User user);
    public void updateUser(User user);
}

package web.Spring_MVC.Dao;

import web.Spring_MVC.Models.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User getUserById(int id);

    public void save(User user);

    public void update(int id, User updateUser);

    public void delete(int id);
}

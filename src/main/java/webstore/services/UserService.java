package webstore.services;

import webstore.models.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}

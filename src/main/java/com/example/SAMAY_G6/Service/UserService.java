package com.example.SAMAY_G6.Service;

import com.example.SAMAY_G6.Repository.UserRepository;
import com.example.SAMAY_G6.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

//  public ArrayList<Usuario> userList = new ArrayList<>();

  public List<Usuario> getAllUsers() {
    return userRepository.findAll();
  }

  public Usuario addUser(Usuario usuario) {
    return userRepository.save(usuario);
  }

  public void deleteUserById(Long id) {
    userRepository.deleteById(id);
  }


}

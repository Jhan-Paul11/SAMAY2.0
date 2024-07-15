package com.example.SAMAY_G6.Service;

import com.example.SAMAY_G6.Repository.UserRepository;
import com.example.SAMAY_G6.ResourceNotFoundException;
import com.example.SAMAY_G6.model.DetalleOrden;
import com.example.SAMAY_G6.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

  @Autowired
  private UserRepository userRepository;

//  public ArrayList<Usuario> userList = new ArrayList<>();

  public List<Usuario> getAllUsers() {
    return userRepository.findAll();
  }

  public Usuario addUsuario(Usuario usuario) {
    return userRepository.save(usuario);
  }

//  public Usuario addUser(Usuario usuario) {
//    if (usuario.getFullName() == null || usuario.getFullName().isEmpty()) {
//      throw new IllegalArgumentException("El nombre completo es obligatorio");
//    }
//    return userRepository.save(usuario);
//  }

  public Usuario addUser(Usuario usuario) {
    return userRepository.save(usuario);

  }

  public Usuario updateTotalUser(Usuario usuario){
    return userRepository.save(usuario);
  }

  public Usuario updateNombre(Long id, String nombreNuevo) {
    Optional<Usuario> optionalUsuario= userRepository.findById(id);
    if (optionalUsuario.isPresent()) {
      Usuario existingUser = optionalUsuario.get();
      existingUser.setNombre(nombreNuevo);
      return userRepository.save(existingUser);
    } else {
      throw new ResourceNotFoundException("Usuario no encontrado con id " + id);
    }
  }
  public Usuario updateContrasena(Long id, String passNew) {
    Optional<Usuario> optionalUsuario= userRepository.findById(id);
    if (optionalUsuario.isPresent()) {
      Usuario existingUser = optionalUsuario.get();
      existingUser.setPassword(passNew);
      return userRepository.save(existingUser);
    } else {
      throw new ResourceNotFoundException("Usuario no encontrado con id " + id);
    }
  }

  public void deleteUserById(Long id) {
   userRepository.deleteById(id);
  }


}

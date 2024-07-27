package com.electropets.springcloud.ms.usuarios.repositories;

import com.electropets.springcloud.ms.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}

package com.electropets.springcloud.ms.cursos.repositories;

import org.springframework.data.repository.CrudRepository;
import com.electropets.springcloud.ms.cursos.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}

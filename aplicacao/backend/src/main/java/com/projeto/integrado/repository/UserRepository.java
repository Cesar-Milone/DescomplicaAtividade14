package com.projeto.integrado.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.integrado.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserEmail(String email);
}

public interface ProjetoRepository extends JpaRepository<User, Integer> {
	Optional<User> findByProjectDescription(String description);
}

public interface RecursoRepository extends JpaRepository<User, Integer> {
	Optional<User> findByResourceName(String resourceName);
}

public interface TaskRepository extends JpaRepository<User, Integer> {
	Optional<User> findByTaskState(Boolean state);
}
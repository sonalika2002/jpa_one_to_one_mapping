package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entity.user;

@Repository
public interface userrepository extends JpaRepository<user, Long>{

}

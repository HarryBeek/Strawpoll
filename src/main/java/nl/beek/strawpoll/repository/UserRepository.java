package nl.beek.strawpoll.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import nl.beek.strawpoll.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value = "SELECT * FROM public.user", nativeQuery = true)
	List<User> findTest();
	
	List<User> findAll();
}

package springboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import springboot.model.Movie;

@Repository
public  interface MongoRep extends MongoRepository<Movie, String> {		
	
	/*@Query("{'year':?0}")
	List findByYear(String year);*/
}

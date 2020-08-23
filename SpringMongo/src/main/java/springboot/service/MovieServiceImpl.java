package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import springboot.model.Movie;
import springboot.repository.MongoRep;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MongoRep mrep;

	@Autowired
	MongoTemplate mongoTemplate;
	
	public Movie getMovieName(Movie movie) {
		
		String year = movie.getYear();
		
		
		Movie m = mongoTemplate.findOne(Query.query(Criteria.where("year").is(year)), Movie.class);
		
		
		return m;
	}

}

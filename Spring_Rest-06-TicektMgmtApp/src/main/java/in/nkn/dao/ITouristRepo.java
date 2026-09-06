package in.nkn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nkn.model.Tourist;

@Repository
public interface ITouristRepo extends JpaRepository<Tourist,Integer> {

	
}

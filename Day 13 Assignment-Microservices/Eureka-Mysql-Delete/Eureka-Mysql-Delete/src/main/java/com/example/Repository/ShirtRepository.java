package com.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.model.*;

@Repository
public interface ShirtRepository extends CrudRepository<Shirt ,Integer> {

}

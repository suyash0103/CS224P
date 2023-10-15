package com.bigdatahw1.repository;

import com.bigdatahw1.model.ConsumerComplaints;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerComplaintsRepository extends CrudRepository<ConsumerComplaints, Integer> {
}

package com.soap.springbootsoapserver.CarsDB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository<CarEntity, Long> {

    @Query("select c from CarEntity c where c.model=?1")
    CarEntity getCarEntityByModel(String model);
}

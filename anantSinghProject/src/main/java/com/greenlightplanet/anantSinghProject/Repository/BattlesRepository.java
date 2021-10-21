package com.greenlightplanet.anantSinghProject.Repository;

import com.greenlightplanet.anantSinghProject.Model.Battles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface BattlesRepository extends JpaRepository<Battles, Integer> {
    @Query("select b.location, b.region from Battles b")
    List<Object> getBattlesLocationAndRegion();

    @Query("select count(*) from Battles")
    public int getCount();

    @Query("From Battles where battle_number = :battle_number")
    public List<Battles> findByBattle_Number( @Param("battle_number") Long battle_number);

    }

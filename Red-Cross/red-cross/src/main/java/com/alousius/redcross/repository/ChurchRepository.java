package com.alousius.redcross.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alousius.redcross.entity.ChurchEntity;

public interface ChurchRepository extends JpaRepository<ChurchEntity, Long> {

	public List<ChurchEntity> findByChurchName(String churchName);



}

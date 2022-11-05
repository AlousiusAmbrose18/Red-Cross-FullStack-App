package com.alousius.redcross.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alousius.redcross.entity.ChurchEntity;
import com.alousius.redcross.repository.ChurchRepository;

@Service
public class ChurchService {

	@Autowired
	private ChurchRepository churchRepository;

	public void saveChurch(ChurchEntity churchEntity) {

		churchRepository.save(churchEntity);
	}
	
	public void saveChurchList(List<ChurchEntity> churchEntity) {

		churchRepository.saveAll(churchEntity);
	}

	public List<ChurchEntity> findByChurchName(String churchName) {

		return churchRepository.findByChurchName(churchName);
	}

}

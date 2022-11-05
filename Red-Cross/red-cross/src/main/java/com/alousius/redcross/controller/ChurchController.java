package com.alousius.redcross.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alousius.redcross.entity.ChurchEntity;
import com.alousius.redcross.service.ChurchService;

@RestController
@RequestMapping(value = "/ChurchController")
@CrossOrigin("http://localhost:4200/")
public class ChurchController {

	@Autowired
	private ChurchService churchService;

	@PostMapping(value = "/saveChurch")
	public void saveChurch(@RequestBody ChurchEntity churchEntity) {

		churchService.saveChurch(churchEntity);

	}
	
	@PostMapping(value = "/saveChurchList")
	public void saveChurchList(@RequestBody List<ChurchEntity> churchEntity) {

		churchService.saveChurchList(churchEntity);

	}

	@GetMapping(value ="/findByChurchName/{ChurchName}")
	public @ResponseBody List<ChurchEntity> findByChurchName(@PathVariable String ChurchName) {
		return churchService.findByChurchName(ChurchName);

	}
}

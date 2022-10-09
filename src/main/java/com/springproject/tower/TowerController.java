package com.springproject.tower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TowerController {

	@Autowired
	private TowerService towerService;

	@RequestMapping("/towers")
	public List<Tower> getAllTower() {
		return towerService.getAllTowers();

	}

	@RequestMapping("/towers/{id}")
	public Tower getTower(@PathVariable int id) {
		return towerService.getTower(id);
	}

	@RequestMapping(method=RequestMethod.POST,value="/towers")
	public void addTower(@RequestBody Tower tower) {
		towerService.addTower(tower);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/towers/{id}")
	public void updateTower(@RequestBody Tower tower, @PathVariable int id) {
		towerService.updateTower(id, tower);

	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/towers/{id}")
	public void deleteTower(@PathVariable int id) {
		towerService.deleteTower(id);
	}
}

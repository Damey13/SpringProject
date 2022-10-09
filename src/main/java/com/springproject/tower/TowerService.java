package com.springproject.tower;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TowerService {

	private List<Tower> towers = new ArrayList<>(Arrays.asList(

			new Tower(1, "T4", "cyberlight"), new Tower(2, "T5", "cyberdome"), new Tower(3, "T6", "cybernight")

	));

	public List<Tower> getAllTowers() {
		return towers;
	}

	public Tower getTower(int id) {
		int temp = -1;
		for (int i = 0; i < towers.size(); i++) {

			if (towers.get(i).getId() == id) {
				temp = i;
				break;
			}

		}
		return towers.get(temp);
	}

	public void addTower(Tower tower) {
		towers.add(tower);
	}

	public void updateTower(int id, Tower tower) {
		for (int i = 0; i < towers.size(); i++) {
			Tower t = towers.get(i);
			if (t.getId() == id) {
				towers.set(i, tower);
				return;
			}
		}
	}

	public void deleteTower(int id) {
		towers.removeIf(t -> t.getId()==id);
	}
}

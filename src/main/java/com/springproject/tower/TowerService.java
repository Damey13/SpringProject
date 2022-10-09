package com.springproject.tower;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TowerService {

	private List<Tower> towers = Arrays.asList(

			new Tower("1", "T4", "cyberlight"), new Tower("2", "T5", "cyberdome"), new Tower("3", "T6", "cybernight")

	);

	public List<Tower> getAllTowers() {
		return towers;
	}
}

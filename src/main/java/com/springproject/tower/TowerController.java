package com.springproject.tower;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TowerController {

	@RequestMapping("/towers")
	public List<Tower> getAllTower() {
		return Arrays.asList(

				new Tower("1", "T4", "cyberlight"),
				new Tower("2", "T5", "cyberdome"),
				new Tower("3", "T6", "cybernight")

		);

	}

}

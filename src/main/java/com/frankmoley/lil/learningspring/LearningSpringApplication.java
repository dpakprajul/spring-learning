package com.frankmoley.lil.learningspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frankmoley.lil.learningspring.data.entity.Room;
import com.frankmoley.lil.learningspring.data.repository.RoomRepository;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}
		@RestController
		@RequestMapping("/rooms") 
		
	public class RoomController{
			@Autowired
			private RoomRepository roomRepository;
			
			@GetMapping
			public Iterable<Room> getRooms(){
				return this.roomRepository.findAll();
			}
		}
	}



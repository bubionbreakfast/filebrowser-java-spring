package com.codeclan.Filebrowser;

import com.codeclan.Filebrowser.models.User;
import com.codeclan.Filebrowser.repositories.FileRepository;
import com.codeclan.Filebrowser.repositories.FolderRepository;
import com.codeclan.Filebrowser.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Table;

@SpringBootTest
class FilebrowserApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;


	@Test
	void contextLoads() {
	}

	@Test
	void createUser(){
		User bob = new User("Bob");
		userRepository.save(bob);
	}

}

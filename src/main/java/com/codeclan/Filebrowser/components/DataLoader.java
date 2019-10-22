package com.codeclan.Filebrowser.components;

import com.codeclan.Filebrowser.repositories.FileRepository;
import com.codeclan.Filebrowser.repositories.FolderRepository;
import com.codeclan.Filebrowser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args) {



    }

}

package com.codeclan.Filebrowser.components;

import com.codeclan.Filebrowser.models.File;
import com.codeclan.Filebrowser.models.Folder;
import com.codeclan.Filebrowser.models.User;
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



        User user = new User("user1");
        userRepository.save(user);

        Folder folder = new Folder ("folder1", user);
        folderRepository.save(folder);

        File file = new File("file1", ".txt", 12, folder);
        fileRepository.save(file);





    }

}

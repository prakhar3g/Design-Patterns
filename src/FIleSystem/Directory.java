package FIleSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> fileSystems;

    public Directory(String name) {
        this.name = name;
        fileSystems = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name: "+name);
        for (FileSystem fileSystem:fileSystems) {
            fileSystem.ls();
        }
    }
}

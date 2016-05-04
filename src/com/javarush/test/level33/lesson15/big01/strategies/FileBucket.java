package com.javarush.test.level33.lesson15.big01.strategies;

import com.javarush.test.level33.lesson15.big01.ExceptionHandler;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by User on 027 2016.04.27.
 */
public class FileBucket {
     private Path path;
     private File file;

    public FileBucket() {
        try {
            this.path= Files.createTempFile("tmp",null);
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
        file=path.toFile();
        file.deleteOnExit();

    }

    public long getFileSize(){
        return file.length();
    }

    public void putEntry(Entry entry){
        try (FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(path))){
            try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(entry);
                objectOutputStream.flush();
            }
        }catch (Exception e){
            ExceptionHandler.log(e);
        }
    }
    public Entry getEntry(){
        Entry entry=null;
        if (file.length()>0){
            try (FileInputStream fileInputStream=new FileInputStream(String.valueOf(path))){
                try (ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)){
                    entry=(Entry) objectInputStream.readObject();
                }
            }catch (Exception e){
                ExceptionHandler.log(e);
            }
        }
        return entry;
    }
    public void remove(){
        try {
            Files.delete(path);
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }
}

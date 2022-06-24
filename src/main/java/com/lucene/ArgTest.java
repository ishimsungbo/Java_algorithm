package com.lucene;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

public class ArgTest {
    public static void main(String[] args) throws IOException {
        System.out.println(args.length);
        for(int i=0 ; i < args.length ; i++){
            System.out.println(args[i].toString());
        }

        final Path docDir = Paths.get("D:\\WorkSpace\\Java_algorithm\\");

        if(Files.isDirectory(docDir)){
            System.out.println("1");
        }else{
            System.out.println("2");
        }

    }
}

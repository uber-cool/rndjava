package com.random;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesAndDirs {

  public static void main(String[] args) throws Exception {
    Path pathToAdapter = Paths.get("D:\\Software\\GO1.txt");
    String text = "Test";

    try {
      Files.write(pathToAdapter, text.getBytes(), StandardOpenOption.CREATE,
          StandardOpenOption.WRITE);

      Files.deleteIfExists(pathToAdapter);
    } catch (IOException e) {
      System.out.println("IOException");
      e.printStackTrace();
    }

    System.out.println("Strings added to file!");
  }
}

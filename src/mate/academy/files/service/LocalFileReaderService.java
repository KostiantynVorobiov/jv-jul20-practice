package mate.academy.files.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import mate.academy.files.exception.FileReadingException;

public class LocalFileReaderService implements FileReaderService {

    public String readFile(String filePath) {
        File file = new File(filePath);

        try {
            FileReader fileReader = new FileReader(file);
            StringBuilder result = new StringBuilder();
            int value = fileReader.read();
            while (value != -1) {
                result.append((char) value);
                value = fileReader.read();
            }
            return result.toString();
        } catch (FileNotFoundException e) {
            throw new FileReadingException("Something went wrong! We can't find the file", e);
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong! We can't read the file", e);
        }


    }
}

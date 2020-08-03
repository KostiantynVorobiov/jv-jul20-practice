package mate.academy.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import mate.academy.files.exception.FileReadingException;

public class BufferedFileReaderService implements FileReaderService {
    @Override
    public String readFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder result = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                result.append(line);
                line = br.readLine();
            }
            return result.toString();
        } catch (FileNotFoundException e) {
            throw new FileReadingException("Can't read file", e);
        } catch (IOException e) {
            e.printStackTrace(); // TODO: replace
        }
        return null;
    }

    public String readFromFile(String filename) {
        try {
            return Files.readString(Paths.get(filename));
        } catch (IOException e) {
            throw new RuntimeException("Can't open file " + filename, e);
        }
    }
}

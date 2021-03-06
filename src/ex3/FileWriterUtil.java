package ex3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {
        public static void writeToFileEnd(String path, String message) {
            File file = new File(path);
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
                bufferedWriter.write(message);
                bufferedWriter.flush();
            } catch (IOException e) {
                throw new RuntimeException("Ups, failed to write into file: " + path, e);
            }
        }

        public static void appendInt(int value, String path) {
            File file = new File(path);
            try (FileWriter fileWriter = new FileWriter(file, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write(String.valueOf(value));
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException("Ups, failed to write into file: " + path, e);
            }
        }
    }
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public String storeData(String data) {
    try {
        String fileName = "stored_data.txt";
        String filePath = STORAGE_PATH + fileName;

        File file = new File(filePath);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(data);
        }

        return "Data stored successfully.";
    } catch (IOException e) {
        e.printStackTrace();
        return "Error storing data.";
    }
}
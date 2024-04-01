import org.springframework.util.FileCopyUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public String readFileContent(String filename) {
    try {
        String filePath = FILE_PATH + filename;
        byte[] fileContent = FileCopyUtils.copyToByteArray(new File(filePath));
        return new String(fileContent, StandardCharsets.UTF_8);
    } catch (IOException e) {
        e.printStackTrace();
        return "Error reading file content.";
    }
}
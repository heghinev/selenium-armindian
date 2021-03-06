import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;
import pageobjects.UploadFilePage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.testng.Assert.assertTrue;

public class UploadFileTest extends BaseTest{

    @Test
    public void uploadFile() throws IOException {
        Path filePath = Files.createTempFile("testFile", ".txt");
        File file = filePath.toFile();
        String path = file.getAbsolutePath();
        UploadFilePage uploadFilePage = new UploadFilePage();
        uploadFilePage.typePath(path);
        uploadFilePage.submit();

        assertTrue(uploadFilePage.getUploadedFiles().contains(file.getName()), "File was not uploaded");
    }
}

package file.request;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import util.Constants;

public class RequestFile {

    private Path tempFile;
    private boolean downloaded;

    public RequestFile(String URL) throws IOException {
        try {
            URL website = new URL(URL);
            this.tempFile = Files.createTempDirectory(Constants.TEMP_DIRECTORY);
            try (InputStream in = website.openStream()) {
                Files.copy(in, this.tempFile, StandardCopyOption.REPLACE_EXISTING);
                in.close();
            }
            this.downloaded = true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public File getFile() {
        return this.tempFile.toFile();
    }

    public boolean isDownloaded() {
        return this.downloaded;
    }

}

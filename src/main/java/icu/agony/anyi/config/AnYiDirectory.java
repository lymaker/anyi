package icu.agony.anyi.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @author LiuYun
 * @version 1.0
 */
@Component
@Slf4j
public class AnYiDirectory {

    @Getter
    private final File workspace;

    @Getter
    @AllArgsConstructor
    public enum Path {
        APP(File.separator + "app"),
        APP_WEB(APP.path + File.separator + "web");

        private final String path;
    }

    public AnYiDirectory(AnYiProperties anYiProperties) {
        this.workspace = new File(anYiProperties.getWorkspace());
        Thread thread = new Thread(() -> {
            createDirectory(Path.APP);
            createDirectory(Path.APP_WEB);
        });
        thread.start();
    }

    private void createDirectory(Path path) {
        String directoryPath = getAbsolutePath(path);
        File directory = new File(directoryPath);
        if (directory.mkdirs()) {
            log.debug("创建目录: {}", path.getPath());
        }
    }

    public String getAbsolutePath(Path path) {
        return workspace.getAbsolutePath() + path.getPath();
    }
}

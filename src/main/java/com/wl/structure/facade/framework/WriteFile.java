package com.wl.structure.facade.framework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

    private String filePath;

    public WriteFile(String filePath) {
        this.filePath = filePath;
    }

    public boolean write(byte[] bytes) {
        FileOutputStream fso = null;
        try {
            fso = new FileOutputStream(new File(filePath));
            fso.write(bytes);
            fso.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (fso != null) fso.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}

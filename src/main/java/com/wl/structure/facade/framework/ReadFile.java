package com.wl.structure.facade.framework;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    private String filePath;

    public ReadFile(String filePath) {
        this.filePath = filePath;
    }

    public byte[] readFile() {
        File file = null;
        FileInputStream ins = null;
        ByteOutputStream byteOut = null;
        byte [] reBytes = null;
        try {
            byte [] bytes = new byte[64];
            file = new File(filePath);
            ins = new FileInputStream(file);
            byteOut = new ByteOutputStream();
            while (ins.read(bytes) != -1) {
                byteOut.write(bytes);
            }
            byteOut.flush();
            reBytes = byteOut.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (ins != null) ins.close();
                if (byteOut != null) byteOut.close();
            } catch (IOException e) {}
        }
        return reBytes;
    }
}

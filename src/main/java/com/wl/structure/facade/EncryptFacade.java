package com.wl.structure.facade;

import com.wl.structure.facade.framework.ConvertorCipher;
import com.wl.structure.facade.framework.ReadFile;
import com.wl.structure.facade.framework.WriteFile;

public class EncryptFacade {
    private ReadFile readFile;
    private WriteFile writeFile;
    private ConvertorCipher convertorCipher;

    public EncryptFacade(String source, String target) {
        readFile = new ReadFile(source);
        writeFile = new WriteFile(target);
        convertorCipher = new ConvertorCipher();
    }

    public boolean convertor() {
        return writeFile.write(convertorCipher.convertor(readFile.readFile()));
    }

    public boolean reverseConvertor() {
        return writeFile.write(convertorCipher.reverseConvertor(readFile.readFile()));
    }
}

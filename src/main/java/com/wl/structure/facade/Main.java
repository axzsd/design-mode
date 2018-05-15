package com.wl.structure.facade;

public class Main {
    public static void main(String [] args) {
        EncryptFacade encryptFacade = new EncryptFacade("D:/test.txt", "D:/target.txt");
        encryptFacade.convertor();

        encryptFacade = new EncryptFacade("D:/target.txt", "D:/target01.txt");
        encryptFacade.reverseConvertor();
    }
}

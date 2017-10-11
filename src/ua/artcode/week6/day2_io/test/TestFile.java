package ua.artcode.week6.day2_io.test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestFile {

    /*
    * 1. file system operations:
    *    CRUD (Create Read Update Delete):
    *       create, delete, search -> file or directory
    *
    * 2. exploring File System
    *
    * 3. change file/directory attributes:
    *    read, write, executable, creation date, last change time
    * */

    private static final String TEST_PATH_ROOT = "test-resources/week6_day2_io/";

    public static void main(String[] args) {

        // 1. file system operations
        File file = new File(TEST_PATH_ROOT + "new_file.txt");

        /*
            // Possible:

            file.canRead();
            file.canWrite();
            file.canExecute();

            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(true);

            // etc.
        */

        if (!file.exists()) {
            try {
                boolean result = file.createNewFile();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

        File dir = new File(TEST_PATH_ROOT + "temp");

        if (dir.isDirectory() && !dir.isFile()) {
            dir.mkdirs();
            System.out.println("Name           : " + dir.getName());
            System.out.println("Absolute path  : " + dir.getAbsolutePath());
            System.out.println("Relative path  : " + dir.getPath());
            try {
                System.out.println("Canonical path : " + dir.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] childrenNames = dir.list();
        System.out.println("Children dirs  : " + Arrays.toString(childrenNames));
        File[] children = dir.listFiles();
        String parentName = dir.getParent();
        System.out.println("Parent dir     : " + parentName);
        File parent = dir.getParentFile();

    }

}



import java.io.IOException;
import java.io.*;

public class INH {



    public static void main(String[] args) throws IOException {
        File file = new File("D:\\APP_INSTALL\\Plot_Playear\\PotPlayer\\PotPlayerMini64.exe");
        ProcessBuilder processBuilder = new ProcessBuilder(file.getAbsolutePath());
        processBuilder.directory(file.getParentFile());

        try {
            processBuilder.start();
        } catch(IOException ex) {
            ex.printStackTrace();
        }


    }

}

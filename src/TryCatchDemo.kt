import java.io.BufferedReader
import java.io.FileReader

fun main(args: Array<String>) {
//    try (InputStream is = new FileInputStream("some")) {
//        //doSmth
//    } catch (IOException e) {
//        e.printStackTrace();
//    }

    BufferedReader(FileReader("some")).use {
        it.readLine()
    }
}
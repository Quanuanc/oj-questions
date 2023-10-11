import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Migration {
    public static void main(String[] args) throws IOException {
        String cwdPath = System.getProperty("user.dir");
        Path mainDirPath = Paths.get(cwdPath, "src", "main", "java", "leetcode", "editor", "cn");
        Path testDirPath = Paths.get(cwdPath, "src", "test", "java", "leetcode", "editor", "cn");

        traverseMainFile(mainDirPath);
    }

    private static void traverseMainFile(Path folderPath) throws IOException {
        Files.walk(folderPath)
                .filter(Files::isRegularFile)
                .filter(path -> path.toString().endsWith(".java"))
                .forEach(Migration::processMainFile);
    }

    private static void processMainFile(Path filePath) {
        try {
            RandomAccessFile file = new RandomAccessFile(filePath.toString(), "rw");
//            file.readUTF()
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //main
        //TODO 获取到序号
        //TODO 修改第一行包名
        //TODO 删除 public class XXX
        //TODO 删除最后一个大括号}
        //TODO mainDirPath下创建文件夹q序号
        //TODO 把原来的类移动到q序号文件夹下Solution.java

        //test
        //TODO 修改第一行包名
        //TODO class XXXTest -> SolutionTest
        //TODO XXX.Solution -> Solution
        //TODO new XXX().new Solution() -> new Solution()
        //TODO 原来的类移动到q序号文件夹下SolutionTest.java
    }

    private static String getContentBetweenBrackets(String line) {
        int last = line.indexOf("]");
        return line.substring(4, last);
    }
}

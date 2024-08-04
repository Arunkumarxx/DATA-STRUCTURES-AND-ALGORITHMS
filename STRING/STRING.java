package STRING;


import java.io.IOException;
import java.nio.file.*;
        import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String {

    private static final Pattern DOT_PATTERN = Pattern.compile("\\.(?!\\d)"); // Replace dots but not before digits
    private static final Pattern SPECIAL_CHAR_PATTERN = Pattern.compile("[^\\w\\s.-]"); // Remove special characters except dots, hyphens, and underscores
    private static final Pattern MULTI_SPACE_PATTERN = Pattern.compile("\\s+"); // Consolidate multiple spaces

    public static void main(String[] args) {
        Path startPath = Paths.get("E:\\ANIME");

        try {
            Files.walkFileTree(startPath, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (Files.isRegularFile(file)) {
                        Path newFileName = processFileName(file.getFileName().toString());
                        if (newFileName != null) {
                            Path newFilePath = file.resolveSibling(newFileName);
                            Files.move(file, newFilePath);
                            System.out.println("Renamed: '" + file + "' to '" + newFilePath + "'");
                        }
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Path processFileName(String fileName) {
        // Remove file extension temporarily
        String nameWithoutExtension = fileName;
        String extension = "";
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex != -1) {
            nameWithoutExtension = fileName.substring(0, dotIndex);
            extension = fileName.substring(dotIndex);
        }

        // Replace dots with underscores
        String newFileName = DOT_PATTERN.matcher(nameWithoutExtension).replaceAll("_");

        // Remove special characters except dots, hyphens, and underscores
        newFileName = SPECIAL_CHAR_PATTERN.matcher(newFileName).replaceAll(" ");

        // Replace multiple spaces with a single space
        newFileName = MULTI_SPACE_PATTERN.matcher(newFileName).replaceAll("_");

        // Re-add the file extension
        newFileName += extension;

        // Ensure that the new filename is different
        return !fileName.equals(newFileName) ? Paths.get(newFileName) : null;
    }
}

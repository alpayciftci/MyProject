package myPackage3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YoutubeID {

        public static String getYouTubeID(String url) {
            String pattern = "(?<=watch\\?v=|/videos/|embed/|youtu.be/|\\/v\\/|\\/e\\/|watch\\?v%3D|watch\\?v%3D|watch\\?v%3D|watch\\?v%3D)([^#\\&\\?\\n]*)";
            Pattern compiledPattern = Pattern.compile(pattern);
            Matcher matcher = compiledPattern.matcher(url);
            if (matcher.find()) {
                return matcher.group();
            } else {
                return null;
            }
        }

        public static void main(String[] args) {
            String url1 = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
            String url2 = "https://youtu.be/dQw4w9WgXcQ";

            System.out.println("Video ID: " + getYouTubeID(url1)); // Output: dQw4w9WgXcQ
            System.out.println("Video ID: " + getYouTubeID(url2)); // Output: dQw4w9WgXcQ
        }
}

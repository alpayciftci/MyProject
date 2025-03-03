package myPackage3;

import java.util.Arrays;

public class YoutubeUrlReturnEtme {
    /*50-----
    Youtube video sayfasının urlsinde yer alan video id'sini
    return eden bir method yazınız :

     ÖRNEKLER
    youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg")
    ID : XPEr1cArWRg

    youtubeId("https://youtu.be/BCDEDi5gDPo")
    ID : BCDEDi5gDPo

    youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4")
    ID : vxP3bY-XxY4
    */
    public static void main(String[] args) {
        String id1 = youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg");
        String id2 = youtubeId("https://youtu.be/BCDEDi5gDPo");
        String id3 = youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4");
        System.out.println("ID1 : " + id1);
        System.out.println("ID2 : " + id2);
        System.out.println("ID3 : " + id3);
    }
    public static String youtubeId (String str){
        if (str.contains("v=")) {
            String[] arr = str.split("v=");
            // System.out.println(Arrays.toString(arr));
            return arr[1];
        }
        else {
            String[] arr = str.split("/");
            //System.out.println(Arrays.toString(arr));
            return arr[3];
        }
    }
}

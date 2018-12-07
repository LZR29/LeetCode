package test;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @authoor linzerong
 * @create 2018-12-05 12:54
 */
public class view {
    private static String headUrl = "http://demo.ltpower.net/web/wgjj-e05dbfcfdd9fadc366275dd7633d426e/tools/submit_ajax.ashx?action=view_article_click&id=";

    public static void main(String[] args) throws IOException, InterruptedException {

        for (int j = 0; j < 400; j++) {
            for (int i = 4534; i <= 4554; i++) {
                URL realUrl = new URL(headUrl + i);
                URLConnection connection = realUrl.openConnection();
                connection.connect();
                System.out.println(connection.getContent());
                System.out.println("id:" + i);
                Thread.sleep(2500);  //要是怕被封IP就调时间长一点
            }
        }
    }
}

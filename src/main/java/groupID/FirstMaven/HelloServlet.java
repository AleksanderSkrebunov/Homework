package groupID.FirstMaven;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HelloServlet", urlPatterns = "/test")
public class HelloServlet extends HttpServlet {
    Singers singer = new Singers(null,0);
    Operation o = new Operation();
    List<Singers> testlist = new ArrayList<>();
    List<Genres> testgenresList = new ArrayList<>();
    List<Comment> testComments = new ArrayList<>();
    private String GENRE = "genre";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("test/html");
        PrintWriter writer = resp.getWriter();
        writer.write("<p><span style='color: blue;'> Hello world</span></p>");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String answer = req.getParameter("answer");
        String comment = req.getParameter("comment");
        String [] genres = req.getParameterValues(GENRE);
        resp.setContentType("text/html; chatset=UTF-8");
        writer.write("<!DOCTYPE HTML>\n" +
                "<html>\n" +
                " <head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <title>Тег FORM</title>\n" +
                " </head>\n" +
                " <body>\n" +
                "\n" +
                " <form action=\"test\">\n" +
                "  <p><b> Best signer?</b></p>\n" +
                "  <p><input type=\"radio\" name=\"answer\" value=\"Nico\">Nico<Br>\n" +
                "  <input type=\"radio\" name=\"answer\" value=\"Zatochka\">Zatochka<Br>\n" +
                "  <input type=\"radio\" name=\"answer\" value=\"DU\">DU</p>\n <Br>"+
                "  <p>best genres?</p>\n" +
                " <ol>\n" + "<br>" +
                " <li><input type=\"checkbox\" name=\"genre\" value=\"juze\" >juze</li>" +
                "  <li><input type=\"checkbox\" name=\"genre\" value=\"bluse\" >bluse</li>" +
                "  <li><input type=\"checkbox\" name=\"genre\" value=\"reggy\" >reggy</li>" +
                "  <li><input type=\"checkbox\" name=\"genre\" value=\"rock\" >rock</li>" +
                "  <li><input type=\"checkbox\" name=\"genre\" value=\"folk\" >folk</li>" +
                "  <li><input type=\"checkbox\" name=\"genre\" value=\"metal\" >metal</li>" +
                "  <li><input type=\"checkbox\" name=\"genre\" value=\"pop\" >pop</li>" +
                "  <li><input type=\"checkbox\" name=\"genre\" value=\"techno\" >techno</li>" +
                "  <li><input type=\"checkbox\" name=\"genre\" value=\"house\" >house</li>" +
                "  <li><input type=\"checkbox\" name=\"genre\" value=\"indie\" >indie</li>" +
                "</ol>\n" + "<Br>" +
                "<p>About yourself<Br>" +
                " <textarea name=\"comment\" cols=\"40\" rows=\"6\"></textarea></p>" +
                "  <p><input type=\"submit\"></p>\n" +
                " </form>\n" +
                "\n" +
                " </body>\n" +
                "</html>");

        singer = o.whatASinger(answer);
        testlist = o.bestSingers();
        for(Singers a: testlist){
            writer.write("<!DOCTYPE HTML>\n" +
                    "<html>\n" +
                    " <head>\n" +
                    "  <meta charset=\"utf-8\">\n" +
                    "  <title>Тег FORM</title>\n" +
                    " </head>\n" +
                    " <body>" + a.getName() + " - voice number" + a.getVoices() + "<br><br>\n" +
                    " </body>\n" +
                    "</html>");
        }
        testgenresList = o.bestGenres(genres);
        for(Genres a: testgenresList){
            writer.write("<!DOCTYPE HTML>\n" +
                    "<html>\n" +
                    " <head>\n" +
                    "  <meta charset=\"utf-8\">\n" +
                    "  <title>Тег FORM</title>\n" +
                    " </head>\n" +
                    " <body>" + a.getName() + " - voice number" + a.getVoices() + "<br><br>\n" +
                    " </body>\n" +
                    "</html>");
        }
        testComments = o.commentsByTime(comment);
        for(Comment a: testComments){
            writer.write("<!DOCTYPE HTML>\n" +
                    "<html>\n" +
                    " <head>\n" +
                    "  <meta charset=\"utf-8\">\n" +
                    "  <title>Тег FORM</title>\n" +
                    " </head>\n" +
                    " <body>" + a.getComment() +  "<br>\n" +
                    " </body>\n" +
                    "</html>");
        }
    }
}
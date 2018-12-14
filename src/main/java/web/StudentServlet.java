package web;

import dao.StudentDao;
import model.Student;

import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/student")
public class StudentServlet extends HttpServlet {

    @Inject
    private StudentDao studentDao;


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        Student s1 = new Student("Tomek", "Kowalski");
        studentDao.save(s1);

        Student s2 = new Student("Janek", "Nowak");
        studentDao.save(s2);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

package web.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.Dao.UserDaoImp;
import web.Model.User;
import web.config.JavaConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserDaoImp hibernateDAO = context.getBean(UserDaoImp.class);
        hibernateDAO.save(new User("Ruslan","dsdfsdf",12));
        context.close();
    }
}

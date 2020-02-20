import org.example.pojo.Books;
import org.example.service.BookService;
import org.example.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = context.getBean("BookServiceImpl", BookService.class);
        int i = bookServiceImpl.deleteBookById(1);
        if(i>0)
        {
            System.out.println("删除成功");
        }
    }

}

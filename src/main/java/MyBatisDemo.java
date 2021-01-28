import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisDemo {
    public static void main(String[] args) throws IOException {
        //1.通过Resources对象获取Mybatis的全局配置文件
        String url = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(url);
        //创建一个SqlSessionFactoryBuilder实例
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //根据build方法获取一个SqlSessionFactory对象
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(inputStream);
        //获取SqlSession对象
        SqlSession sqlSession = build.openSession();
        System.out.println(sqlSession);
    }
}

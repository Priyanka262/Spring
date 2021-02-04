package com.incapp.SpringJavaBook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
    	JavaBook jb = ctx.getBean("book",JavaBook.class);
    	System.out.println( "Price: "+jb.getPrice() );
    	System.out.println( "Book Name: "+jb.getName() );
    	AuthorDetail ad = jb.getAuthordetail();
        System.out.println( "Author Name: "+ad.getName() );
        System.out.println( "Age: "+ad.getAge() );
        System.out.println( "Phone no.: "+ad.getPhone() );
        
    }
}

package javacore.lecture6.jdk;

/**
 * @author Alan Yin
 * @date 2019/12/26
 */

public class HelloImpl implements HelloInterface {

    @Override
    public void sayHello() {
        System.out.println("hello proxy");
    }
}

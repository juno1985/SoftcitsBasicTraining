package chapter3;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Demo3 {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        System.out.println("System is running .....");

        URL url = new URL("file:///F:\\git-repo\\SoftcitsBasicTraining\\out\\artifacts\\ExtraAuditJar\\ExtraAuditJar.jar");
        URL[] arrURL = new URL[]{url};
        URLClassLoader classLoader = new URLClassLoader(arrURL);
        Class<?> clazz = classLoader.loadClass("chapter3.ExtraAuditImpl");
        ExtraAudit audit = (ExtraAudit) clazz.newInstance();
        audit.printLog();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpu;

import dpu.ui.common.LoginFrame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author gagandeep.rana
 */
public class DPU {
    
    
    public static void main(String[] args) {
        
//        logger.info("Inside DPU: main(): STARTS");
        try {
//            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//            LoginFrame loginFrame = (LoginFrame) context.getBean(LoginFrame.class);
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
        } catch (Exception e) {
            System.out.println("Main: " + e);
        }
        
//        logger.info("Inside DPU: main(): ENDS");
    }
}

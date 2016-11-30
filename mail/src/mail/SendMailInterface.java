package mail;

public class SendMailInterface {
    public static void send(String goalAddress,String vertifyAddress)
    {
        // 设置邮件服务器信息
          MailSenderInfo mailInfo = new MailSenderInfo();
          mailInfo.setMailServerHost("smtp.163.com");
          mailInfo.setMailServerPort("25");
          mailInfo.setValidate(true);
          
          // 邮箱用户名
          mailInfo.setUserName("15850509352@163.com");
          // 邮箱密码
          mailInfo.setPassword("ab201307");
          // 发件人邮箱
          mailInfo.setFromAddress("15850509352@163.com");
          // 收件人邮箱
          mailInfo.setToAddress(goalAddress);
          // 邮件标题
          mailInfo.setSubject("0-1社区注册邮箱验证");
          // 邮件内容
          StringBuffer buffer = new StringBuffer();
          buffer.append(vertifyAddress);
          mailInfo.setContent(buffer.toString());
          
          // 发送邮件
          SimpleMailSender sms = new SimpleMailSender();
          // 发送文体格式
          sms.sendTextMail(mailInfo);
          // 发送html格式
          SimpleMailSender.sendHtmlMail(mailInfo);
          System.out.println("邮件发送完毕");
    }

}

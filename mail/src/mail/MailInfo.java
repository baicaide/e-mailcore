package mail;

public class MailInfo extends MailSenderInfo {
	
    public static MailInfo MakeMailInfo(String goalAddress,String vertifyAddress)
    {
    	MailInfo mailInfo = new MailInfo();
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
        System.out.println(mailInfo.getUserName());
		return mailInfo;
    }


}

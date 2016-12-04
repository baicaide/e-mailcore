package mail;

public class SendMailInterface {
	public static void proveInterface(String goalAddress,String vertifyAddress,String enume)
	{
		if (!(null == enume) && enume.equals("send"))
		{
			SendMailInterface.send(goalAddress, vertifyAddress);
		}
	}
    public static void send(String goalAddress,String vertifyAddress)
    {
        MailInfo mailInfo = MailInfo.MakeMailInfo(goalAddress,vertifyAddress);
        System.out.println(mailInfo.getUserName());
        
     // 设置邮件服务器信息
        Property property = new Property();
        property.setMailServerHost("smtp.163.com");
        property.setMailServerPort("25");
        property.setValidate(true);
          // 发送文体格式
        SimpleMailSender.sendTextMail(mailInfo,property);
          // 发送html格式
        SimpleMailSender.sendHtmlMail(mailInfo,property);
        System.out.println("邮件发送完毕");
    }

}

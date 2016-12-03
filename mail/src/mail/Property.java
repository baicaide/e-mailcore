package mail;

import java.util.Properties;

public class Property {
    // 发送邮件的服务器的IP(或主机地址)
    private String mailServerHost;
    // 发送邮件的服务器的端口
    private String mailServerPort;
   // 是否需要身份验证
    private boolean validate = false;
    
    public String getMailServerHost() {
		return mailServerHost;
	}

	public void setMailServerHost(String mailServerHost) {
		this.mailServerHost = mailServerHost;
	}

	public String getMailServerPort() {
		return mailServerPort;
	}

	public void setMailServerPort(String mailServerPort) {
		this.mailServerPort = mailServerPort;
	}


	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

    public Properties getProperties()
    {
       Properties p = new Properties();
       p.put("mail.smtp.host", this.mailServerHost);
       p.put("mail.smtp.port", this.mailServerPort);
       p.put("mail.smtp.auth", validate ? "true" : "false");
       return p;
    } 

}

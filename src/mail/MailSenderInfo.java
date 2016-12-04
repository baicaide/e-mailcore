package mail;

public class MailSenderInfo
{
     // 发件人邮箱地址
    private String fromAddress;
     // 收件人邮箱地址
    private String toAddress;
     // 登陆邮件发送服务器的用户名
    private String userName;
     // 登陆邮件发送服务器的密码
    private String password;
     // 邮件主题
    private String subject;
     // 邮件的文本内容
    private String content;
     // 邮件附件的文件名
    private String[] attachFileNames;

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getAttachFileNames() {
        return attachFileNames;
    }

    public void setAttachFileNames(String[] attachFileNames) {
        this.attachFileNames = attachFileNames;
    }


}

package mail;

public class SendMailDemo
{
    public static void main(String[] args)
    {
        String goalAddress = "1290111431@qq.com";
        String vertifyAddress = "JAF 1.1.1 jar包下载地址：http://www.oracle.com/technetwork/java/javase/downloads/index-135046.html";
        SendMailInterface.send(goalAddress, vertifyAddress);
    }
}

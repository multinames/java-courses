package app;

import com.tibco.tibjms.TibjmsConnectionFactory;
import com.tibco.tibjms.TibjmsTopicConnectionFactory;
import app.TestJMS;

public class Main {
    public static void main(String[] args) {

        TestJMS testJMS = new TestJMS();
        String msg_to = "<accountTransferRq>\n" +
                "    <fromAcc>38662866603994122710</fromAcc>\n" +
                "    <sum>100.0</sum>\n" +
                "    <toAcc>92787367327536242945</toAcc>\n" +
                "</accountTransferRq>";

       // testJMS.sendMessage("input",msg_to,"11","ExternalTransfer");

       System.out.println(testJMS.getMessage("output","JMSCorrelationID","11",1000));

    }
}

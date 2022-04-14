package chain;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

/**
 * 业务部门处理类
 */
public class BusinessProcessor extends AbstractProcessor {

    @Override
    protected int emailType() {
        return EmailType.COOPERATE_EMAIL.type;
    }

    @Override
    protected String execute(List<Email> emails) {
        if (CollectionUtils.isNotEmpty(emails)) {
            System.out.println("-------业务部门开始处理邮件-------");
            emails.stream().forEach(email -> System.out.println(email.getContent()));
        }
        return "任务执行完毕！";
    }
}

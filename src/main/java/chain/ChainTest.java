package chain;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * 责任链模式测试类
 */
public class ChainTest {

    // 初始化待处理邮件
    private static List<Email> emails = Lists.newArrayList(new Email(EmailType.FANS_EMAIL.type, "我是粉丝A"),
            new Email(EmailType.COOPERATE_EMAIL.type, "我要找你们合作"),
            new Email(EmailType.GARBAGE_EMAIL.type, "我是垃圾邮件"),
            new Email(EmailType.FANS_EMAIL.type, "我是粉丝B"));

    public static void main(String[] args) {
        // 初始化处理类
        AbstractProcessor ceoProcessor = new CeoProcessor();
        AbstractProcessor lawProcessor = new LawProcessor();
        AbstractProcessor businessProcessor = new BusinessProcessor();
        AbstractProcessor garbageProcessor = new GarbageProcessor();

        // 设置责任链条
        ceoProcessor.setNextProcessor(lawProcessor);
        lawProcessor.setNextProcessor(businessProcessor);
        businessProcessor.setNextProcessor(garbageProcessor);

        // 开始处理邮件
        ceoProcessor.handleMessage(emails);
    }
}

package chain;

public enum EmailType {
    FANS_EMAIL(1, "粉丝邮件"),
    SLANDER_EMAIL(2, "诽谤邮件"),
    COOPERATE_EMAIL(3, "业务合作邮件"),
    GARBAGE_EMAIL(99, "垃圾邮件");

    public int type;

    public String remark;

    EmailType(int type, String remark) {
        this.type = type;
        this.remark = remark;
    }
}

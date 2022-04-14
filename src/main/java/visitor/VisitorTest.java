package visitor;

/**
 * @description 测试类
 * @author: yianmou
 **/
public class VisitorTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Visitor personVisitor = new PersonVisitor();
        Visitor studentVisitor = new StudentVisitor();
        Visitor companyVisitor = new CompanyVisitor();
        computer.buildComputer(personVisitor);
        System.out.println(String.format("针对%s，每台电脑售价为：%s元", personVisitor.visiterName(), personVisitor.price()));
        computer.buildComputer(studentVisitor);
        System.out.println(String.format("针对%s，每台电脑售价为：%s元", studentVisitor.visiterName(), studentVisitor.price()));
        computer.buildComputer(companyVisitor);
        System.out.println(String.format("针对%s，每台电脑售价为：%s元", companyVisitor.visiterName(), companyVisitor.price()));
    }
}

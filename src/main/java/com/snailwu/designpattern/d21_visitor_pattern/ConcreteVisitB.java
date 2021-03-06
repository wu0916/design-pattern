package com.snailwu.designpattern.d21_visitor_pattern;

/**
 * @author 吴庆龙
 * @date 2020/4/10 11:45 上午
 */
public class ConcreteVisitB implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("具体访问者 B 访问 -> " + elementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("具体访问者 B 访问 -> " + elementB.operationB());
    }
}

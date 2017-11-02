package me.yoryor.learn;

/**
 * Created by Michal on 2017/11/2 下午1:55.
 */
public class App {
    public static void main(String[] args) {
        Programmer programmerLi = new Programmer();
        programmerLi.setName("Li Lei");
        SkillGraph skills = new SkillGraph();
        skills.add(new Skill("Java", 4));
        skills.add(new Skill("Mysql", 3));
        programmerLi.setSkills(skills);
        programmerLi.setScore(skills.getResult());

        Programmer programmerHanmei = new Programmer();
        programmerHanmei.setName("Han Meimei");
        SkillGraph hansSkill = new SkillGraph();
        hansSkill.add(new Skill("Javascript", 5));
        hansSkill.add(new Skill("HTML", 4));
        hansSkill.add(new Skill("CSS", 4));
        programmerHanmei.setSkills(hansSkill);
        programmerHanmei.setScore(hansSkill.getResult());

        System.out.println("======================== Compute Result ========================");
        System.out.println("Profile: " + programmerLi);
        System.out.println("Profile: " + programmerHanmei);
    }
}

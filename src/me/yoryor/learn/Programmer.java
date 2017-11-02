package me.yoryor.learn;

/**
 * Created by Michal on 2017/10/31 下午4:20.
 */
public class Programmer {
    private String name;
    private SkillGraph skills;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SkillGraph getSkills() {
        return skills;
    }

    public void setSkills(SkillGraph skills) {
        this.skills = skills;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", skills=" + skills.skillList() +
                ", score=" + String.format("%.2f", score) +
                '}';
    }
}

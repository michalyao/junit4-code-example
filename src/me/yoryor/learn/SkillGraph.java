package me.yoryor.learn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Michal on 2017/10/31 下午4:33.
 */
public class SkillGraph implements Iterable<Skill>, Computable {
    private Set<Skill> skills = new HashSet<>();

    public void add(Skill skill) {
        skills.add(skill);
    }

    public List<String> skillList() {
        return skills.stream().map(Skill::getName).collect(Collectors.toList());
    }

    @Override
    public Iterator<Skill> iterator() {
        return skills.iterator();
    }

    @Override
    public double getResult() {
        return skills.stream().mapToInt(Skill::getLevel).average().orElse(0);
    }
}

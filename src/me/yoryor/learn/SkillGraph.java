package me.yoryor.learn;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Michal on 2017/10/31 下午4:33.
 */
public class SkillGraph implements Iterable<Skill>, Computable {
    private Set<Skill> skills = new HashSet<>();

    public void add(Skill skill) {
        if (Objects.isNull(skill)) {
            throw new IllegalArgumentException("Skill can not be null.");
        }
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
        return skills.stream().mapToInt(skill -> skill.getLevel() * skill.getWeight().getNumber()).average().orElse(0);
    }
}

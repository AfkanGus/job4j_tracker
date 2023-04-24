package ru.job4j.hmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sumScore = 0;
        int countSubject = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
                countSubject++;
            }
        }
        return sumScore / countSubject;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sumScore = 0;
            int countSubject = 0;
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
                countSubject++;
            }
            double averageScore = sumScore / countSubject;
            rsl.add(new Label(pupil.name(), averageScore));
        }
        return rsl;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> scoresBySubject = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scoresBySubject.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : scoresBySubject.entrySet()) {
            String subjectName = entry.getKey();
            Integer totalScore = entry.getValue();
            double averageScore = (double) totalScore / pupils.size();
            result.add(new Label(subjectName, averageScore));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        Pupil bestPupil = null;
        double bestSum = 0.0;
        for (Pupil pupil : pupils) {
            double sum = 0.0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            if (sum > bestSum) {
                bestPupil = pupil;
                bestSum = sum;
            }
        }
        if (bestPupil == null) {
            return null;
        } else {
            return new Label(bestPupil.name(), bestSum);
        }
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> scoresBySubject = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scoresBySubject.merge(subject.name(),
                        subject.score(), Integer::sum);
            }
        }
        int bestScore = 0;
        String bestSubject = "";
        for (Map.Entry<String, Integer> entry : scoresBySubject.entrySet()) {
            if (entry.getValue() > bestScore) {
                bestScore = entry.getValue();
                bestSubject = entry.getKey();
            }
        }
        return new Label(bestSubject, (double) bestScore);
    }
}


package ru.job4j.hmap;

import java.util.*;

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
        Map<String, Integer> subjectScoreMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectScoreMap.merge(subject.name(), subject.score(), Integer::sum);
            }
        }

        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : subjectScoreMap.entrySet()) {
            double avgScore = (double) entry.getValue() / pupils.size();
            result.add(new Label(entry.getKey(), avgScore));
        }

        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0.0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            labels.add(new Label(pupil.name(), sum));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> scoresBySubject = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scoresBySubject.merge(subject.name(),
                        subject.score(), Integer::sum);
            }
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : scoresBySubject.entrySet()) {
            String subject = entry.getKey();
            int score = entry.getValue();
            labels.add(new Label(subject, score));
        }

        labels.sort(Collections.reverseOrder());
        return labels.get(0);
    }
}


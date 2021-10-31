package ru.job4j.collection.job;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import java.util.Comparator;

import org.junit.Test;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobDescPriority());
        int rsl = cmpNamePriority.compare(new Job("Fix bug", 0),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator cmpPriority = new JobAscendingByPriority().thenComparing(
                new JobDescByName()
        );
        int rsl = cmpPriority.compare(new Job("Impl task", 0),
                new Job("Fix bug", 0));
        assertThat(rsl, lessThan(0));

    }

    @Test
    public void whenComparatorByAscendingName() {
        Comparator<Job> cmpNameAsc = new JobAscendingByName();
        int rsl = cmpNameAsc.compare(new Job("Impl", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByDescName() {
        Comparator<Job> cmpNameDesc = new JobDescByName();
        int rsl = cmpNameDesc.compare(new Job("Impl", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByAscendingPriority() {
        Comparator<Job> cmpPrioriAsc = new JobAscendingByPriority();
        int rsl = cmpPrioriAsc.compare(new Job("Impl", 1),
                new Job("Fix bug", 0));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByDescPriority() {
        Comparator<Job> compPrioriDesc = new JobDescPriority();
        int rsl = compPrioriDesc.compare(new Job("Impl", 1),
                new Job("Fix bug", 0));
        assertThat(rsl, lessThan(0));
    }
}
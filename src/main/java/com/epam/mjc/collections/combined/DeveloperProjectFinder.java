package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {

    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectsList = new ArrayList<>();
        for (Map.Entry<String, Set<String>> project : projects.entrySet()) {
            if (project.getValue().contains(developer)) {
                projectsList.add(project.getKey());
            }
        }
        Collections.sort(projectsList);
        projectsList.sort(new ListComparator());
        return projectsList;
    }

    static class ListComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            if (a.length() - b.length() != 0) {
                return b.length() - a.length();
            } else {
                return b.compareTo(a);
            }
        }
    }
}

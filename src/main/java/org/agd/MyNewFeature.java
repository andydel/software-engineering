package org.agd;

public class MyNewFeature {

    private String getFeatureDescription() {
        return "This is a new feature in the AGD project.";
    }

    //TODO:  Add a comment here
    public String doSomethingWild(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        if (input.length() < 3) {
            throw new IllegalArgumentException("Input must be at least 3 characters long");
        }
        String returnValue = "Added wildness: " + input.toUpperCase();
        return returnValue;
    }
}

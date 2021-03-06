package net.thucydides.core.requirements.model;

import com.google.common.collect.ImmutableList;

/**
 * Created by john on 6/03/15.
 */
public enum FeatureType {
    UNDEFINED(""), FEATURE(".feature"), STORY(".story");

    private final String extension;

    FeatureType(String extension) {
        this.extension = extension;
    }


    public String getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public static FeatureType forFilename(String storyPath) {
        for(FeatureType featureType : ImmutableList.of(FEATURE, STORY)) {
            if (storyPath.toLowerCase().endsWith(featureType.extension)) {
                return featureType;
            }
        }
        return UNDEFINED;
    }

}

package com.steve.plugins.recentprojects;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.util.registry.Registry;

import org.jetbrains.annotations.NotNull;

public class RecentProjects implements ApplicationComponent {

    public static final String IDE_MAX_RECENT_PROJECTS = "ide.max.recent.projects";

    @Override
    public void initComponent() {
        try {
            if (Registry.intValue(IDE_MAX_RECENT_PROJECTS) < 50) {
                Registry.get(IDE_MAX_RECENT_PROJECTS).setValue(50);
            }
        } catch (Exception e) {
            // oops!
        }
    }

    @Override
    public void disposeComponent() {
    }

    @NotNull
    @Override
    public String getComponentName() {
        return getClass().getSimpleName();
    }
}

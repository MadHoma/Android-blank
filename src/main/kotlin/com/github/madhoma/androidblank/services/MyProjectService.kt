package com.github.madhoma.androidblank.services

import com.github.madhoma.androidblank.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

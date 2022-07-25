package com.github.sparkmuse.sourcesglobalexclude.services

import com.intellij.openapi.project.Project
import com.github.sparkmuse.sourcesglobalexclude.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

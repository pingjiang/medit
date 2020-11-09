package com.github.pingjiang.medit.services

import com.intellij.openapi.project.Project
import com.github.pingjiang.medit.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

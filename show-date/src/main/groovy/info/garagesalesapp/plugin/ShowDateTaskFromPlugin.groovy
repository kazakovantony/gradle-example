package info.garagesalesapp.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ShowDateTaskFromPlugin extends DefaultTask {

    String dateMessage = 'Current date: '

    @TaskAction
    def showDateTaskFromPlugin() {
        println ""
        println dateMessage + new Date()
        println ""
    }
}
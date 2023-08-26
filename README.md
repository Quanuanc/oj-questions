# oj-questions

## leetcode-editor settings

1. TemplateFilePath: Copy this project's `java` folder absolute path
2. Custom Template
3. Code File Name:

    ```
    $!velocityTool.camelCaseName(${question.titleSlug})
    ```

4. Code Template:

    ```java
    package leetcode.editor.cn;
    
    /**
     * [${question.frontendQuestionId}] ${question.title}
     */
    public class $!velocityTool.camelCaseName(${question.titleSlug}) {
        ${question.code}
    }
    ```

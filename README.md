# 刷题记录

## LeetCode
> 安装 [leetcode editor](https://plugins.jetbrains.com/plugin/12132-leetcode-editor) 插件

### leetcode-editor config

**TempFilePath:** `${project-absolute-path}\src\main\java\`

**CodeFileName:**  

```java
$!velocityTool.camelCaseName(${question.titleSlug})
```
**CodeTemplate:**  

```java
// # ${question.frontendQuestionId}
${question.content}

package leetcode.editor.cn;

public class $!velocityTool.camelCaseName(${question.titleSlug}){
    public static void main(String[] args) {
         Solution solution = new $!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
    }
    ${question.code}
}
```
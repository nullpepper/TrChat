dependencies {
    compileOnly(project(":project:common"))
    compileOnly(project(":project:module-adventure"))
    compileOnly(project(":project:module-chat"))
    compileOnly(project(":project:module-compat"))
    compileOnly(project(":project:module-nms"))
    compileOnly("ink.ptms.core:v260100:260100")
    compileOnly("net.md-5:bungeecord-chat:1.21-R0.3")
    compileOnly(fileTree(rootDir.resolve("libs")))
    // Pepper 服务端 API（org.purpurmc.purpur.Pepper）：TrChat 用它查询插件数据目录，
    // 而不是自己按 plugins 的父目录推算 —— 推算会忽略服务端的 --plugins-data 参数。
    // 运行期由服务端提供，故 compileOnly。默认指向同级仓库的构建产物，
    // 可用 -PpurpurApiJar=<path> 覆盖。
    compileOnly(files(
        (findProperty("purpurApiJar") as String?)
            ?: "/home/pepper/projects/purpur-nested-plugins/purpur-api/build/libs/purpur-api-26.2.local-SNAPSHOT.jar"
    ))

    compileOnly("me.clip:placeholderapi:2.12.2") { isTransitive = false }
    // SLF4JLoggerSuppressor 需要 slf4j-api。原先由 discordSRV 传递提供，
    // 移除 DiscordSRV 支持后改为直接声明（服务器端本就自带 slf4j，故 compileOnly）。
    compileOnly("org.slf4j:slf4j-api:2.0.16") { isTransitive = false }
}

taboolib { subproject = true }
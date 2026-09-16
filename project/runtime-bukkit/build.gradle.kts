dependencies {
    compileOnly(project(":project:common"))
    compileOnly(project(":project:module-adventure"))
    compileOnly(project(":project:module-chat"))
    compileOnly(project(":project:module-compat"))
    compileOnly(project(":project:module-nms"))
    compileOnly("ink.ptms.core:v260100:260100")
    compileOnly("net.md-5:bungeecord-chat:1.21-R0.3")
    compileOnly(fileTree(rootDir.resolve("libs")))

    compileOnly("me.clip:placeholderapi:2.12.2") { isTransitive = false }
    // SLF4JLoggerSuppressor 需要 slf4j-api。原先由 discordSRV 传递提供，
    // 移除 DiscordSRV 支持后改为直接声明（服务器端本就自带 slf4j，故 compileOnly）。
    compileOnly("org.slf4j:slf4j-api:2.0.16") { isTransitive = false }
}

taboolib { subproject = true }
// 已移除 DiscordSRV / ItemsAdder 支持，因此不再需要这些第三方仓库
// （maven.devs.beer 返回 522、nexus.scarsz.me / repo.oraxen.com 超时，都会拖慢构建）
// 保留的依赖全部来自 TabooLib / Maven Central / PaperMC 等公共仓库

dependencies {
    compileOnly(project(":project:common"))
    compileOnly(project(":project:module-chat"))
    compileOnly("ink.ptms.core:v12111:12111:universal")

    compileOnly("com.willfp:eco:6.35.1") { isTransitive = false }

//    compileOnly("io.th0rgal:oraxen:1.170.0") { isTransitive = false }
//    compileOnly("com.nexomc:nexo:0.7.0")
    compileOnly("xyz.xenondevs.nova:nova-api:0.12.13") { isTransitive = false }

}

taboolib { subproject = true }
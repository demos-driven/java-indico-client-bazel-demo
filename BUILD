load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test",
#    "java_plugin",
    )

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "indico-demo",
    main_class = "com.example.myproject.Application",
    classpath_resources = ["config.properties"],
    runtime_deps = [":indico-demo-lib"],
#    plugins = [
#        "//:mvn-compile-plugin",
#    ],
#    javacopts = [
#        "-Dexec.cleanupDaemonThreads=false"
#    ],
)

#java_plugin(
#    name = "mvn-compile-plugin",
#    srcs = glob(["**/*.java"]),
#    deps = [
#        "@maven//:org_apache_maven_plugins_maven_compiler_plugin",
#    ],
#)

java_library(
    name = "indico-demo-lib",
    srcs = glob([
        "**/*.java",
    ]),
    deps = [
        "@maven//:com_indico_indico_client_java",

        "@maven//:org_apache_commons_commons_lang3",
    ]
)

java_test(
    name = "tests",
    srcs = glob([
        "**/*.java"
    ]),
    test_class = "com.example.myproject.ApplicationTest",
    deps = [
        "@maven//:junit_junit",
    ],
)

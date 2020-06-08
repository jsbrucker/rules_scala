load("//scala:scala.bzl", "scala_library", "scala_test")

scala_test(
    name = "test",
    srcs = ["OptionsTest.scala"],
    deps = [":test_message_scala_proto"],
)

scala_library(
    name = "scala_dependency",
    srcs = ["ScalaDependency.scala"],
    deps = ["//external:io_bazel_rules_scala/dependency/proto/scalapb_runtime"],
    visibility = ["//visibility:public"],
)

load("@rules_proto//proto:defs.bzl", "proto_library")

proto_library(
    name = "test_message_proto",
    srcs = ["test_message.proto"],
    deps = [":scalapb_proto"],
    data = [":scala_dependency"],
    visibility = ["//visibility:public"],
)

proto_library(
    name = "scalapb_proto",
    srcs = ["scalapb.proto"],
    deps = ["@com_google_protobuf//:descriptor_proto"],
    visibility = ["//visibility:public"],
    import_prefix = "scalapb",
    strip_import_prefix = "", # Remove the entire path to this target from the import
)

load("//scala_proto:scala_proto.bzl", "scala_proto_library")

scala_proto_library(
    name = "test_message_scala_proto",
    deps = [
        ":test_message_proto",
        "//external:io_bazel_rules_scala/dependency/proto/scalapb_runtime",
    ],
    visibility = ["//visibility:public"],
)

## Build

    bazel build //:indico-demo_deploy.jar

## Run

    java -jar bazel-bin/indico-demo_deploy.jar

## FixMe

    Exception in thread "main" com.indico.exceptions.IndicoAuthorizationException: Failed to refresh authentication state Unauthorized

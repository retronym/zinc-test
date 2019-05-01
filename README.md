```
$ git checkout 2d6edfb && sbt clean compile && git checkout 90072a9 && sbt compile c/console
Previous HEAD position was 90072a9 Rename private trait field a.A.{a1 => a2}
HEAD is now at 2d6edfb Add private field to trait a.A
[info] Loading settings for project global-plugins from idea.sbt,dirtymoney.sbt,gpg.sbt ...
[info] Loading global plugins from /Users/jz/.sbt/1.0/plugins
[info] Loading project definition from /Users/jz/code/zinc-test/project
[info] Loading settings for project zinc-test from build.sbt ...
[info] Set current project to zinc-test (in build file:/Users/jz/code/zinc-test/)
[info] Executing in batch mode. For better performance use sbt's shell
[success] Total time: 0 s, completed 01/05/2019 11:39:54 AM
[info] Updating ...
[info] Updating a...
[info] Done updating.
[info] Done updating.
[info] Updating b...
[info] Compiling 1 Scala source to /Users/jz/code/zinc-test/a/target/scala-2.12/classes ...
[info] Done updating.
[info] Updating c...
[info] Done updating.
[info] Done compiling.
[info] Compiling 1 Scala source to /Users/jz/code/zinc-test/b/target/scala-2.12/classes ...
[info] Done compiling.
[info] Compiling 1 Scala source to /Users/jz/code/zinc-test/c/target/scala-2.12/classes ...
[info] Done compiling.
[success] Total time: 2 s, completed 01/05/2019 11:39:56 AM
Previous HEAD position was 2d6edfb Add private field to trait a.A
HEAD is now at 90072a9 Rename private trait field a.A.{a1 => a2}
[info] Loading settings for project global-plugins from idea.sbt,dirtymoney.sbt,gpg.sbt ...
[info] Loading global plugins from /Users/jz/.sbt/1.0/plugins
[info] Loading project definition from /Users/jz/code/zinc-test/project
[info] Loading settings for project zinc-test from build.sbt ...
[info] Set current project to zinc-test (in build file:/Users/jz/code/zinc-test/)
[info] Executing in batch mode. For better performance use sbt's shell
[info] Compiling 1 Scala source to /Users/jz/code/zinc-test/a/target/scala-2.12/classes ...
[info] Done compiling.
[info] Compiling 1 Scala source to /Users/jz/code/zinc-test/b/target/scala-2.12/classes ...
[info] Done compiling.
[success] Total time: 1 s, completed 01/05/2019 11:40:03 AM
[info] Starting scala interpreter...
Welcome to Scala 2.12.7 (OpenJDK 64-Bit Server VM, Java 1.8.0-adoptopenjdk).
Type in expressions for evaluation. Or try :help.

scala> new c.C
java.lang.AbstractMethodError: c.C.a$A$_setter_$a$A$$a2_$eq(Ljava/lang/String;)V
  at a.A.$init$(x.scala:4)
  at c.C.<init>(x.scala:3)
  ... 36 elided
```
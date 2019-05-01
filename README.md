```
sbt:zinc-test> compile
[debug] Full compilation, no sources in previous analysis.
[debug]
[debug] Initial source changes:
[debug]     removed:Set()
[debug]     added: Set()
[debug]     modified: Set(/Users/jz/code/zinc-test/a/src/main/scala/y.scala)
[debug] Invalidated products: Set()
[debug] External API changes: API Changes: Set()
[debug] Modified binary dependencies: Set()
[debug] Initial directly invalidated classes: Set(a.Y)
[debug]
[debug] Sources indirectly invalidated by:
[debug]     product: Set()
[debug]     binary dep: Set()
[debug]     external source: Set()
[debug] All initially invalidated classes: Set(a.Y)
[debug] All initially invalidated sources:Set(/Users/jz/code/zinc-test/a/src/main/scala/y.scala)
[debug] [inv] ********* Pruned:
[debug] [inv] Relations (with name hashing enabled):
[debug] [inv]   products: Relation [
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z$.class
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z$RichY.class
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z.class
[debug] [inv] ]
[debug] [inv]   library deps: Relation [
[debug] [inv]     a/src/main/scala/z.scala -> /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar
[debug] [inv] ]
[debug] [inv]   library class names: Relation [
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Char
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Int
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Unit
[debug] [inv]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar -> java.lang.Object
[debug] [inv]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar -> java.lang.String
[debug] [inv] ]
[debug] [inv]   internalDependencies:
[debug] [inv]     DependencyByMemberRef Relation [
[debug] [inv]     a.Z -> a.Y
[debug] [inv]     a.Z.RichY -> a.Y
[debug] [inv] ]
[debug] [inv]   externalDependencies:
[debug] [inv]
[debug] [inv]   class names: Relation [
[debug] [inv]     a/src/main/scala/z.scala -> a.Z
[debug] [inv]     a/src/main/scala/z.scala -> a.Z.RichY
[debug] [inv] ]
[debug] [inv]   used names: Relation [
[debug] [inv]     a.Z -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Z -> UsedName(Object,[Default])
[debug] [inv]     a.Z -> UsedName(RichY,[Default])
[debug] [inv]     a.Z -> UsedName(String,[Default])
[debug] [inv]     a.Z -> UsedName(Y,[Default])
[debug] [inv]     a.Z -> UsedName(Z,[Default])
[debug] [inv]     a.Z -> UsedName(a,[Default])
[debug] [inv]     a.Z -> UsedName(a;Z;RichY;init;,[Default])
[debug] [inv]     a.Z -> UsedName(foo,[Default])
[debug] [inv]     a.Z -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Z -> UsedName(scala,[Default])
[debug] [inv]     a.Z -> UsedName(y,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Object,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(RichY,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Y,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Z,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(scala,[Default])
[debug] [inv] ]
[debug] [inv]   product class names: Relation [
[debug] [inv]     a.Z -> a.Z
[debug] [inv]     a.Z -> a.Z$
[debug] [inv]     a.Z.RichY -> a.Z$RichY
[debug] [inv] ]
[debug] [inv] *********
[info] Compiling 1 Scala source to /Users/jz/code/zinc-test/a/target/scala-2.12/classes ...
[debug] Getting org.scala-sbt:compiler-bridge_2.12:1.2.5:compile for Scala 2.12.7
[debug] Getting org.scala-sbt:compiler-bridge_2.12:1.2.5:compile for Scala 2.12.7
[debug] [zinc] Running cached compiler 4ead1b19 for Scala compiler version 2.12.7
[debug] [zinc] The Scala compiler is invoked with:
[debug]     -bootclasspath
[debug]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/resources.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/sunrsasign.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/jsse.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/jce.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/charsets.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/jfr.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/classes:/Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar
[debug]     -classpath
[debug]     /Users/jz/code/zinc-test/a/target/scala-2.12/classes
[debug] Scala compilation took 0.098576648 s
[info] Done compiling.
[debug] [inv] ********* Fresh:
[debug] [inv] Relations (with name hashing enabled):
[debug] [inv]   products: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> a/target/scala-2.12/classes/a/Y.class
[debug] [inv] ]
[debug] [inv]   library deps: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar
[debug] [inv]     a/src/main/scala/y.scala -> /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar
[debug] [inv] ]
[debug] [inv]   library class names: Relation [
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Int
[debug] [inv]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar -> java.lang.String
[debug] [inv] ]
[debug] [inv]   internalDependencies:
[debug] [inv]     DependencyByMemberRef Relation [
[debug] [inv]     a.Y -> a.Z
[debug] [inv] ]
[debug] [inv]   externalDependencies:
[debug] [inv]
[debug] [inv]   class names: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> a.Y
[debug] [inv] ]
[debug] [inv]   used names: Relation [
[debug] [inv]     a.Y -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Y -> UsedName(Object,[Default])
[debug] [inv]     a.Y -> UsedName(String,[Default])
[debug] [inv]     a.Y -> UsedName(Y,[Default])
[debug] [inv]     a.Y -> UsedName(Z,[Default])
[debug] [inv]     a.Y -> UsedName(a,[Default])
[debug] [inv]     a.Y -> UsedName(bar,[Default])
[debug] [inv]     a.Y -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Y -> UsedName(scala,[Default])
[debug] [inv] ]
[debug] [inv]   product class names: Relation [
[debug] [inv]     a.Y -> a.Y
[debug] [inv] ]
[debug] [inv] *********
[debug] [inv] ********* Merged:
[debug] [inv] Relations (with name hashing enabled):
[debug] [inv]   products: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> a/target/scala-2.12/classes/a/Y.class
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z$.class
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z$RichY.class
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z.class
[debug] [inv] ]
[debug] [inv]   library deps: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar
[debug] [inv]     a/src/main/scala/y.scala -> /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar
[debug] [inv]     a/src/main/scala/z.scala -> /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar
[debug] [inv] ]
[debug] [inv]   library class names: Relation [
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Char
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Int
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Unit
[debug] [inv]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar -> java.lang.Object
[debug] [inv]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar -> java.lang.String
[debug] [inv] ]
[debug] [inv]   internalDependencies:
[debug] [inv]     DependencyByMemberRef Relation [
[debug] [inv]     a.Y -> a.Z
[debug] [inv]     a.Z -> a.Y
[debug] [inv]     a.Z.RichY -> a.Y
[debug] [inv] ]
[debug] [inv]   externalDependencies:
[debug] [inv]
[debug] [inv]   class names: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> a.Y
[debug] [inv]     a/src/main/scala/z.scala -> a.Z
[debug] [inv]     a/src/main/scala/z.scala -> a.Z.RichY
[debug] [inv] ]
[debug] [inv]   used names: Relation [
[debug] [inv]     a.Y -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Y -> UsedName(Object,[Default])
[debug] [inv]     a.Y -> UsedName(String,[Default])
[debug] [inv]     a.Y -> UsedName(Y,[Default])
[debug] [inv]     a.Y -> UsedName(Z,[Default])
[debug] [inv]     a.Y -> UsedName(a,[Default])
[debug] [inv]     a.Y -> UsedName(bar,[Default])
[debug] [inv]     a.Y -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Y -> UsedName(scala,[Default])
[debug] [inv]     a.Z -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Z -> UsedName(Object,[Default])
[debug] [inv]     a.Z -> UsedName(RichY,[Default])
[debug] [inv]     a.Z -> UsedName(String,[Default])
[debug] [inv]     a.Z -> UsedName(Y,[Default])
[debug] [inv]     a.Z -> UsedName(Z,[Default])
[debug] [inv]     a.Z -> UsedName(a,[Default])
[debug] [inv]     a.Z -> UsedName(a;Z;RichY;init;,[Default])
[debug] [inv]     a.Z -> UsedName(foo,[Default])
[debug] [inv]     a.Z -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Z -> UsedName(scala,[Default])
[debug] [inv]     a.Z -> UsedName(y,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Object,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(RichY,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Y,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Z,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(scala,[Default])
[debug] [inv] ]
[debug] [inv]   product class names: Relation [
[debug] [inv]     a.Y -> a.Y
[debug] [inv]     a.Z -> a.Z
[debug] [inv]     a.Z -> a.Z$
[debug] [inv]     a.Z.RichY -> a.Z$RichY
[debug] [inv] ]
[debug] [inv] *********
[debug] [inv]
[debug] [inv] Changes:
[debug] [inv] API Changes: Set(NamesChange(a.Y,ModifiedNames(changes = UsedName(zbar,[Default]), UsedName(foo,[Default]))))
[debug] Invalidating (transitively) by inheritance from a.Y...
[debug] Initial set of included nodes: Set(a.Y)
[debug] Invalidated by transitive inheritance dependency: Set(a.Y)
[debug] None of the modified names appears in source file of a.Z.RichY. This dependency is not being considered for invalidation.
[debug] The following modified names cause invalidation of a.Z: Set(UsedName(foo,[Default]))
[debug] Change NamesChange(a.Y,ModifiedNames(changes = UsedName(zbar,[Default]), UsedName(foo,[Default]))) invalidates 2 classes due to The a.Y has the following regular definitions changed:
[debug]     UsedName(zbar,[Default]), UsedName(foo,[Default]).
[debug]     > by transitive inheritance: Set(a.Y)
[debug]     >
[debug]     > by member reference: Set(a.Z)
[debug]
[debug] New invalidations:
[debug]     Set(a.Z)
[debug] Initial set of included nodes: Set(a.Z)
[debug] Including a.Y by a.Z
[debug] Including a.Z.RichY by a.Y
[debug] Previously invalidated, but (transitively) depend on new invalidations:
[debug]     Set(a.Y)
[debug] All newly invalidated classes after taking into account (previously) recompiled classes:Set(a.Z)
[debug] [inv] ********* Pruned:
[debug] [inv] Relations (with name hashing enabled):
[debug] [inv]   products: Relation [ ]
[debug] [inv]   library deps: Relation [ ]
[debug] [inv]   library class names: Relation [
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Char
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Int
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Unit
[debug] [inv]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar -> java.lang.Object
[debug] [inv]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar -> java.lang.String
[debug] [inv] ]
[debug] [inv]   internalDependencies:
[debug] [inv]
[debug] [inv]   externalDependencies:
[debug] [inv]
[debug] [inv]   class names: Relation [ ]
[debug] [inv]   used names: Relation [ ]
[debug] [inv]   product class names: Relation [ ]
[debug] [inv] *********
[info] Compiling 2 Scala sources to /Users/jz/code/zinc-test/a/target/scala-2.12/classes ...
[debug] Getting org.scala-sbt:compiler-bridge_2.12:1.2.5:compile for Scala 2.12.7
[debug] Getting org.scala-sbt:compiler-bridge_2.12:1.2.5:compile for Scala 2.12.7
[debug] [zinc] Running cached compiler 4c2a3bcc for Scala compiler version 2.12.7
[debug] [zinc] The Scala compiler is invoked with:
[debug]     -bootclasspath
[debug]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/resources.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/sunrsasign.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/jsse.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/jce.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/charsets.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/jfr.jar:/usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/classes:/Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar
[debug]     -classpath
[debug]     /Users/jz/code/zinc-test/a/target/scala-2.12/classes
[debug] Scala compilation took 0.112866042 s
[info] Done compiling.
[debug] [inv] ********* Fresh:
[debug] [inv] Relations (with name hashing enabled):
[debug] [inv]   products: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> a/target/scala-2.12/classes/a/Y.class
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z$.class
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z$RichY.class
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z.class
[debug] [inv] ]
[debug] [inv]   library deps: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar
[debug] [inv]     a/src/main/scala/y.scala -> /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar
[debug] [inv]     a/src/main/scala/z.scala -> /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar
[debug] [inv]     a/src/main/scala/z.scala -> /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar
[debug] [inv] ]
[debug] [inv]   library class names: Relation [
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Int
[debug] [inv]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar -> java.lang.String
[debug] [inv] ]
[debug] [inv]   internalDependencies:
[debug] [inv]     DependencyByMemberRef Relation [
[debug] [inv]     a.Y -> a.Z
[debug] [inv]     a.Z -> a.Y
[debug] [inv]     a.Z.RichY -> a.Y
[debug] [inv] ]
[debug] [inv]   externalDependencies:
[debug] [inv]
[debug] [inv]   class names: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> a.Y
[debug] [inv]     a/src/main/scala/z.scala -> a.Z
[debug] [inv]     a/src/main/scala/z.scala -> a.Z.RichY
[debug] [inv] ]
[debug] [inv]   used names: Relation [
[debug] [inv]     a.Y -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Y -> UsedName(Int,[Default])
[debug] [inv]     a.Y -> UsedName(Object,[Default])
[debug] [inv]     a.Y -> UsedName(Y,[Default])
[debug] [inv]     a.Y -> UsedName(Z,[Default])
[debug] [inv]     a.Y -> UsedName(a,[Default])
[debug] [inv]     a.Y -> UsedName(bar,[Default])
[debug] [inv]     a.Y -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Y -> UsedName(scala,[Default])
[debug] [inv]     a.Z -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Z -> UsedName(Int,[Default])
[debug] [inv]     a.Z -> UsedName(Object,[Default])
[debug] [inv]     a.Z -> UsedName(RichY,[Default])
[debug] [inv]     a.Z -> UsedName(Y,[Default])
[debug] [inv]     a.Z -> UsedName(Z,[Default])
[debug] [inv]     a.Z -> UsedName(a,[Default])
[debug] [inv]     a.Z -> UsedName(a;Z;RichY;init;,[Default])
[debug] [inv]     a.Z -> UsedName(foo,[Default])
[debug] [inv]     a.Z -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Z -> UsedName(scala,[Default])
[debug] [inv]     a.Z -> UsedName(y,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Object,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(RichY,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Y,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Z,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(scala,[Default])
[debug] [inv] ]
[debug] [inv]   product class names: Relation [
[debug] [inv]     a.Y -> a.Y
[debug] [inv]     a.Z -> a.Z
[debug] [inv]     a.Z -> a.Z$
[debug] [inv]     a.Z.RichY -> a.Z$RichY
[debug] [inv] ]
[debug] [inv] *********
[debug] [inv] ********* Merged:
[debug] [inv] Relations (with name hashing enabled):
[debug] [inv]   products: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> a/target/scala-2.12/classes/a/Y.class
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z$.class
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z$RichY.class
[debug] [inv]     a/src/main/scala/z.scala -> a/target/scala-2.12/classes/a/Z.class
[debug] [inv] ]
[debug] [inv]   library deps: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar
[debug] [inv]     a/src/main/scala/y.scala -> /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar
[debug] [inv]     a/src/main/scala/z.scala -> /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar
[debug] [inv]     a/src/main/scala/z.scala -> /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar
[debug] [inv] ]
[debug] [inv]   library class names: Relation [
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Char
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Int
[debug] [inv]     /Users/jz/.sbt/boot/scala-2.12.7/lib/scala-library.jar -> scala.Unit
[debug] [inv]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar -> java.lang.Object
[debug] [inv]     /usr/local/Cellar/adoptopenjdk-openjdk8/jdk8u172-b11/jre/lib/rt.jar -> java.lang.String
[debug] [inv] ]
[debug] [inv]   internalDependencies:
[debug] [inv]     DependencyByMemberRef Relation [
[debug] [inv]     a.Y -> a.Z
[debug] [inv]     a.Z -> a.Y
[debug] [inv]     a.Z.RichY -> a.Y
[debug] [inv] ]
[debug] [inv]   externalDependencies:
[debug] [inv]
[debug] [inv]   class names: Relation [
[debug] [inv]     a/src/main/scala/y.scala -> a.Y
[debug] [inv]     a/src/main/scala/z.scala -> a.Z
[debug] [inv]     a/src/main/scala/z.scala -> a.Z.RichY
[debug] [inv] ]
[debug] [inv]   used names: Relation [
[debug] [inv]     a.Y -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Y -> UsedName(Int,[Default])
[debug] [inv]     a.Y -> UsedName(Object,[Default])
[debug] [inv]     a.Y -> UsedName(Y,[Default])
[debug] [inv]     a.Y -> UsedName(Z,[Default])
[debug] [inv]     a.Y -> UsedName(a,[Default])
[debug] [inv]     a.Y -> UsedName(bar,[Default])
[debug] [inv]     a.Y -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Y -> UsedName(scala,[Default])
[debug] [inv]     a.Z -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Z -> UsedName(Int,[Default])
[debug] [inv]     a.Z -> UsedName(Object,[Default])
[debug] [inv]     a.Z -> UsedName(RichY,[Default])
[debug] [inv]     a.Z -> UsedName(Y,[Default])
[debug] [inv]     a.Z -> UsedName(Z,[Default])
[debug] [inv]     a.Z -> UsedName(a,[Default])
[debug] [inv]     a.Z -> UsedName(a;Z;RichY;init;,[Default])
[debug] [inv]     a.Z -> UsedName(foo,[Default])
[debug] [inv]     a.Z -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Z -> UsedName(scala,[Default])
[debug] [inv]     a.Z -> UsedName(y,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(AnyRef,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Object,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(RichY,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Y,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(Z,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(java;lang;Object;init;,[Default])
[debug] [inv]     a.Z.RichY -> UsedName(scala,[Default])
[debug] [inv] ]
[debug] [inv]   product class names: Relation [
[debug] [inv]     a.Y -> a.Y
[debug] [inv]     a.Z -> a.Z
[debug] [inv]     a.Z -> a.Z$
[debug] [inv]     a.Z.RichY -> a.Z$RichY
[debug] [inv] ]
[debug] [inv] *********
[debug] [inv]
[debug] [inv] Changes:
[debug] [inv] API Changes: Set(NamesChange(a.Z,ModifiedNames(changes = UsedName(bar,[Default]))), NamesChange(a.Y,ModifiedNames(changes = UsedName(zbar,[Default]))))
[debug] Invalidating (transitively) by inheritance from a.Z...
[debug] Initial set of included nodes: Set(a.Z)
[debug] Invalidated by transitive inheritance dependency: Set(a.Z)
[debug] The following modified names cause invalidation of a.Y: Set(UsedName(bar,[Default]))
[debug] Change NamesChange(a.Z,ModifiedNames(changes = UsedName(bar,[Default]))) invalidates 2 classes due to The a.Z has the following regular definitions changed:
[debug]     UsedName(bar,[Default]).
[debug]     > by transitive inheritance: Set(a.Z)
[debug]     >
[debug]     > by member reference: Set(a.Y)
[debug]
[debug] Invalidating (transitively) by inheritance from a.Y...
[debug] Initial set of included nodes: Set(a.Y)
[debug] Invalidated by transitive inheritance dependency: Set(a.Y)
[debug] None of the modified names appears in source file of a.Z.RichY. This dependency is not being considered for invalidation.
[debug] None of the modified names appears in source file of a.Z. This dependency is not being considered for invalidation.
[debug] Change NamesChange(a.Y,ModifiedNames(changes = UsedName(zbar,[Default]))) invalidates 1 classes due to The a.Y has the following regular definitions changed:
[debug]     UsedName(zbar,[Default]).
[debug]     > by transitive inheritance: Set(a.Y)
[debug]     >
[debug]     >
[debug]
[debug] New invalidations:
[debug]     Set()
[debug] Initial set of included nodes: Set()
[debug] Previously invalidated, but (transitively) depend on new invalidations:
[debug]     Set()
[debug] All newly invalidated classes after taking into account (previously) recompiled classes:Set()
```
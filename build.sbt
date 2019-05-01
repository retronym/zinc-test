val a = project

scalaVersion := "2.12.8"

incOptions in Global := (incOptions in Global).value.withRelationsDebug(true)//.withApiDebug(true)

logLevel in Global := Level.Debug
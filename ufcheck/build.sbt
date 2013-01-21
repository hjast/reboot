libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-netty-server" % "0.6.5" % "test" cross CrossVersion.binaryMapped {
    case "2.10.0" => "2.10"
    case x => x
  }
  ,
  "org.slf4j" % "slf4j-simple" % "1.6.4" % "test"
)

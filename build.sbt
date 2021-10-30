ThisBuild / scalaVersion := "2.13.6"
ThisBuild / version := "0.1"
ThisBuild / organization := "dev.tchiba"
ThisBuild / scalacOptions ++= Seq(
  "-feature",     // 明示的に import する必要のある機能を使用した場合、警告と場所を知らせる
  "-deprecation", // 非推奨のAPIの仕様している場合、警告と場所を知らせる
  //    "-Xfatal-warnings", // 警告が出た場合はコンパイル失敗させる
  "-Xlint",          // 推奨される警告の有効化
  "-Ywarn-dead-code" // デットコードがあれば警告する
)

lazy val `ddd-core` = (project in file("ddd-core"))
  .settings(
    name := "ddd-core",
    libraryDependencies ++= Seq()
  )

lazy val `recruit-management` = (project in file("recruit-management"))
  .dependsOn(`ddd-core`)
  .settings(
    name := "recruit-system-sample-ddd",
    libraryDependencies ++= Seq()
  )

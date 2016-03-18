package org.scalafmt

/**
  * Single source of truth for version number.
  */
object Versions {
  // Nightly, used in CLI, build.sbt, etc.
  val scalafmt = "0.1.4"
  // Stable, used in official user docs.
  val latestPublished = "0.1.4"
}

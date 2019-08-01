(ns org.nd4j.versioncheck.VersionInfo
  "Created by Alex on 04/08/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.versioncheck VersionInfo]))

(defn ->version-info
  "Constructor.

  group-id - `java.lang.String`
  artifact-id - `java.lang.String`
  build-version - `java.lang.String`"
  (^VersionInfo [^java.lang.String group-id ^java.lang.String artifact-id ^java.lang.String build-version]
    (new VersionInfo group-id artifact-id build-version))
  (^VersionInfo [^java.lang.String properties-file-path]
    (new VersionInfo properties-file-path)))


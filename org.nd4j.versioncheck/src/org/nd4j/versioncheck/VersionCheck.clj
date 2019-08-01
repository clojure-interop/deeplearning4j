(ns org.nd4j.versioncheck.VersionCheck
  "A runtime version check utility that does 2 things:
 (a) validates the versions of ND4J, DL4J, DataVec, RL4J, Arbiter on the class path, logging a warning if
 incompatible versions are found
 (b) allows users to get version information for the above projects at runtime."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.versioncheck VersionCheck]))

(def *-version-check-property
  "Static Constant.

  Deprecated. Use ND4JSystemProperties.VERSION_CHECK_PROPERTY

  type: java.lang.String"
  VersionCheck/VERSION_CHECK_PROPERTY)

(def *-git-property-file-suffix
  "Static Constant.

  type: java.lang.String"
  VersionCheck/GIT_PROPERTY_FILE_SUFFIX)

(defn *check-versions
  "Perform a check of the versions of ND4J, DL4J, DataVec, RL4J and Arbiter dependencies, logging a warning
  if necessary."
  ([]
    (VersionCheck/checkVersions )))

(defn *list-git-properties-files
  "returns: A list of the property files containing the build/version info - `java.util.List<java.net.URI>`"
  (^java.util.List []
    (VersionCheck/listGitPropertiesFiles )))

(defn *get-version-infos
  "returns: A list containing the information for the discovered dependencies - `java.util.List<org.nd4j.versioncheck.VersionInfo>`"
  (^java.util.List []
    (VersionCheck/getVersionInfos )))

(defn *version-info-string
  "Get the version information for dependencies as a string with a specified amount of detail

  detail - Detail level for the version information. See VersionCheck.Detail - `org.nd4j.versioncheck.VersionCheck$Detail`

  returns: Version information, as a String - `java.lang.String`"
  (^java.lang.String [^org.nd4j.versioncheck.VersionCheck$Detail detail]
    (VersionCheck/versionInfoString detail))
  (^java.lang.String []
    (VersionCheck/versionInfoString )))

(defn *log-version-info
  "Log the version information with the specified level of detail

  detail - Level of detail for logging - `org.nd4j.versioncheck.VersionCheck$Detail`"
  ([^org.nd4j.versioncheck.VersionCheck$Detail detail]
    (VersionCheck/logVersionInfo detail))
  ([]
    (VersionCheck/logVersionInfo )))


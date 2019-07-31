(ns org.nd4j.versioncheck.VersionCheck$Detail
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.versioncheck VersionCheck$Detail]))

(def GAV
  "Enum Constant.

  type: org.nd4j.versioncheck.VersionCheck$Detail"
  VersionCheck$Detail/GAV)

(def GAVC
  "Enum Constant.

  type: org.nd4j.versioncheck.VersionCheck$Detail"
  VersionCheck$Detail/GAVC)

(def FULL
  "Enum Constant.

  type: org.nd4j.versioncheck.VersionCheck$Detail"
  VersionCheck$Detail/FULL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (VersionCheck.Detail c : VersionCheck.Detail.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.versioncheck.VersionCheck$Detail[]`"
  ([]
    (VersionCheck$Detail/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.versioncheck.VersionCheck$Detail`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.versioncheck.VersionCheck$Detail [^java.lang.String name]
    (VersionCheck$Detail/valueOf name)))


(ns org.nd4j.linalg.util.Paths
  "Path Utilities"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util Paths]))

(def *-path-env-variable
  "Static Constant.

  type: java.lang.String"
  Paths/PATH_ENV_VARIABLE)

(defn *name-exists-in-path
  "Check if a file exists in the path

  name - the name of the file - `java.lang.String`

  returns: true if the name exists
  false otherwise - `boolean`"
  (^Boolean [^java.lang.String name]
    (Paths/nameExistsInPath name)))


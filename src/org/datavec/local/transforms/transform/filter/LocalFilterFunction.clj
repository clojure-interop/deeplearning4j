(ns org.datavec.local.transforms.transform.filter.LocalFilterFunction
  "Function for executing filter operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.transform.filter LocalFilterFunction]))

(defn ->local-filter-function
  "Constructor."
  (^LocalFilterFunction []
    (new LocalFilterFunction )))

(defn apply
  "Description copied from interface: Function

  v-1 - Input - `java.util.List`

  returns: Result - `java.lang.Boolean`"
  (^java.lang.Boolean [^LocalFilterFunction this ^java.util.List v-1]
    (-> this (.apply v-1))))


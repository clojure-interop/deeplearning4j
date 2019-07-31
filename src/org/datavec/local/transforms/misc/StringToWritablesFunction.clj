(ns org.datavec.local.transforms.misc.StringToWritablesFunction
  "Convert a String to a List using a DataVec record reader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.misc StringToWritablesFunction]))

(defn ->string-to-writables-function
  "Constructor."
  (^StringToWritablesFunction []
    (new StringToWritablesFunction )))

(defn apply
  "Description copied from interface: Function

  s - Input - `java.lang.String`

  returns: Result - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^StringToWritablesFunction this ^java.lang.String s]
    (-> this (.apply s))))


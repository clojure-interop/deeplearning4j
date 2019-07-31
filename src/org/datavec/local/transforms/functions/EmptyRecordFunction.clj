(ns org.datavec.local.transforms.functions.EmptyRecordFunction
  "Used for filtering empty records"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.functions EmptyRecordFunction]))

(defn ->empty-record-function
  "Constructor."
  (^EmptyRecordFunction []
    (new EmptyRecordFunction )))

(defn apply
  "Description copied from interface: Function

  v-1 - Input - `java.util.List`

  returns: Result - `java.lang.Boolean`"
  (^java.lang.Boolean [^EmptyRecordFunction this ^java.util.List v-1]
    (-> this (.apply v-1))))


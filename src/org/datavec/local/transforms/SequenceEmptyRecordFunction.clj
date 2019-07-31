(ns org.datavec.local.transforms.SequenceEmptyRecordFunction
  "Used for filtering empty records"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms SequenceEmptyRecordFunction]))

(defn ->sequence-empty-record-function
  "Constructor."
  (^SequenceEmptyRecordFunction []
    (new SequenceEmptyRecordFunction )))

(defn apply
  "Description copied from interface: Function

  v-1 - Input - `java.util.List`

  returns: Result - `java.lang.Boolean`"
  (^java.lang.Boolean [^SequenceEmptyRecordFunction this ^java.util.List v-1]
    (-> this (.apply v-1))))


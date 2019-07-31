(ns org.datavec.local.transforms.sequence.LocalSequenceFilterFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.sequence LocalSequenceFilterFunction]))

(defn ->local-sequence-filter-function
  "Constructor."
  (^LocalSequenceFilterFunction []
    (new LocalSequenceFilterFunction )))

(defn apply
  "Description copied from interface: Function

  v-1 - Input - `java.util.List`

  returns: Result - `java.lang.Boolean`"
  (^java.lang.Boolean [^LocalSequenceFilterFunction this ^java.util.List v-1]
    (-> this (.apply v-1))))


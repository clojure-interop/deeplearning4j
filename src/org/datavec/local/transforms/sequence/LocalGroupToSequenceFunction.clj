(ns org.datavec.local.transforms.sequence.LocalGroupToSequenceFunction
  "Function for grouping independent values/examples into a sequence, and then sorting them
 using a provided SequenceComparator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.sequence LocalGroupToSequenceFunction]))

(defn ->local-group-to-sequence-function
  "Constructor."
  (^LocalGroupToSequenceFunction []
    (new LocalGroupToSequenceFunction )))

(defn apply
  "Description copied from interface: Function

  lists - Input - `java.util.List`

  returns: Result - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^LocalGroupToSequenceFunction this ^java.util.List lists]
    (-> this (.apply lists))))


(ns org.datavec.local.transforms.misc.ColumnToKeyPairTransform
  "Extract out one writable, and map it to a pair with count 1.
 Used to count the N most frequent values in a column,"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.misc ColumnToKeyPairTransform]))

(defn ->column-to-key-pair-transform
  "Constructor."
  (^ColumnToKeyPairTransform []
    (new ColumnToKeyPairTransform )))

(defn apply
  "Description copied from interface: Function

  list - Input - `java.util.List`

  returns: Result - `org.nd4j.linalg.primitives.Pair<org.datavec.api.writable.Writable,java.lang.Long>`"
  (^org.nd4j.linalg.primitives.Pair [^ColumnToKeyPairTransform this ^java.util.List list]
    (-> this (.apply list))))


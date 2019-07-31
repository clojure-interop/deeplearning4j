(ns org.datavec.api.transform.Transform
  "A Transform converts an example to another example, or a sequence to another sequence"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform Transform]))

(defn map
  "Transform a writable
  in to another writable

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^Transform this ^java.util.List writables]
    (-> this (.map writables))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^Transform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))


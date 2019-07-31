(ns org.datavec.api.writable.comparator.Comparators
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable.comparator Comparators]))

(defn *for-type
  "type - `org.datavec.api.writable.WritableType`
  ascending - `boolean`

  returns: `java.util.Comparator<org.datavec.api.writable.Writable>`"
  (^java.util.Comparator [^org.datavec.api.writable.WritableType type ^Boolean ascending]
    (Comparators/forType type ascending))
  (^java.util.Comparator [^org.datavec.api.writable.WritableType type]
    (Comparators/forType type)))


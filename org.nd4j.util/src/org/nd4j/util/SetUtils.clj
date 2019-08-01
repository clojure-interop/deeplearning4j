(ns org.nd4j.util.SetUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.util SetUtils]))

(defn *intersection
  "parent-collection - `java.util.Collection`
  remove-from-collection - `java.util.Collection`

  returns: `<T> java.util.Set<T>`"
  ([^java.util.Collection parent-collection ^java.util.Collection remove-from-collection]
    (SetUtils/intersection parent-collection remove-from-collection)))

(defn *intersection-p
  "s-1 - `java.util.Set`
  s-2 - `java.util.Set`

  returns: `<T> boolean`"
  ([^java.util.Set s-1 ^java.util.Set s-2]
    (SetUtils/intersectionP s-1 s-2)))

(defn *union
  "s-1 - `java.util.Set`
  s-2 - `java.util.Set`

  returns: `<T> java.util.Set<T>`"
  ([^java.util.Set s-1 ^java.util.Set s-2]
    (SetUtils/union s-1 s-2)))

(defn *difference
  "Return is s1 \\ s2

  s-1 - `java.util.Collection`
  s-2 - `java.util.Collection`

  returns: `<T> java.util.Set<T>`"
  ([^java.util.Collection s-1 ^java.util.Collection s-2]
    (SetUtils/difference s-1 s-2)))

